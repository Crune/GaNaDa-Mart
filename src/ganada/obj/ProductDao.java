package ganada.obj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import ganada.obj.ProductDao;
import ganada.obj.Product;

public class ProductDao {
	private static ProductDao instance = new ProductDao();
	    
	    public static ProductDao getInstance() {
	        return instance;
	    }
	    
	    private ProductDao() {
	    }
		
		private Connection getConnection()throws Exception{
			Context ctx = new InitialContext();						
			Context env = (Context)ctx.lookup("java:comp/env");		
			DataSource ds = (DataSource)env.lookup("jdbc/orcl");	
			Connection conn = ds.getConnection();		
			return conn;
		}
		
		public void insertItem(Product product){		//관리자가 상품을 등록할 때 사용
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				conn = getConnection();		
				String sql="insert into item values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,sysdate)";				//?=��ġȦ��				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, product.getNum());		
				pstmt.setString(2, product.getPasswd());	
				pstmt.setString(3, product.getName());	
				pstmt.setString(4, product.getSize());
				pstmt.setString(5, product.getColor());
				pstmt.setInt(6, product.getColorcount());
				pstmt.setString(7, product.getImage());
				pstmt.setString(8, product.getGender());
				pstmt.setString(9, product.getType());
				pstmt.setString(10, product.getBrand());
				pstmt.setString(11, product.getWidth());
				pstmt.setInt(12, product.getRecommend());
				pstmt.setInt(13, product.getSellcount());
				pstmt.setInt(14, product.getStock());
				pstmt.setInt(15, product.getPrice());
				pstmt.setString(16, product.getInfo());
				pstmt.setString(17, product.getDeliveryinfo());	
				pstmt.setString(18, product.getNote());	
				pstmt.setString(19, product.getAsinfo());		
				pstmt.executeUpdate();
			}catch(Exception e){			
				e.printStackTrace();
			}finally{
				if(pstmt != null){try{pstmt.close();}catch(SQLException s){}}
				if(conn != null){try{conn.close();}catch(SQLException s){}}
			}
		}
		
		public List getArticles(int start, int end) throws Exception{
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			List articleList=null;
			try {
				conn = getConnection();
				pstmt = conn.prepareStatement(
						"select num,name,r "
						+
						"from (select num,name r " +
						"from (select * from item order by num asc) order by item asc ) where r >= ? and r <= ? ");
						pstmt.setInt(1, start); 
						pstmt.setInt(2, end); 

						rs = pstmt.executeQuery();
						if (rs.next()) {
							articleList = new ArrayList(end); 
							while(rs.next()){ 			//결과가 있어야 이 메서드가 실행되기 때문에 do로 사용해도 에러가 나지 않는다
								Product article= new Product();
								article.setNum(rs.getInt("num"));
								article.setName(rs.getString("name"));
								
								articleList.add(article); 
							}
						}
			} catch(Exception ex) {
				ex.printStackTrace();
			} finally {
				if (rs != null) try { rs.close(); } catch(SQLException ex) {}
				if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
				if (conn != null) try { conn.close(); } catch(SQLException ex) {}
			}
			return articleList;
		}
		
		public Product getArticle(int num) throws Exception {		//추천수1늘리고 db의 정보를 dto에저장    미완성
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			Product article=null;
			try {
				conn = getConnection();
				pstmt = conn.prepareStatement(
				"update item set readcount=readcount+1 where num = ?"); 
				pstmt.setInt(1, num);
				pstmt.executeUpdate();
				pstmt = conn.prepareStatement("select * from item where num = ?"); 
				pstmt.setInt(1, num);
				rs = pstmt.executeQuery();
				if (rs.next()) {
					article = new Product();
					article.setNum(rs.getInt("num"));
					article.setName(rs.getString("name"));
				}
			} catch(Exception ex) {
				ex.printStackTrace();
			} finally {
				if (rs != null) try { rs.close(); } catch(SQLException ex) {}
				if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
				if (conn != null) try { conn.close(); } catch(SQLException ex) {}
			}
			return article;
		}
		
		public int getArticleCount() throws Exception {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			int x=0;
			try {
				conn = getConnection();
				pstmt = conn.prepareStatement("select count(*) from item");	//테이블의 갯수count(*)
				rs = pstmt.executeQuery();
				if (rs.next()) {
					x= rs.getInt(1); 		//1번컬럼있는 테이블의 갯수를 x에 대입
				}
			} catch(Exception ex) {
				ex.printStackTrace();
			} finally {
				if (rs != null) try { rs.close(); } catch(SQLException ex) {}
				if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
				if (conn != null) try { conn.close(); } catch(SQLException ex) {}
			}
			return x; 
		}
		
		public int updateItem(Product article) throws Exception {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs= null;
			String dbpasswd="";
			String sql="";
			int x=-1;
			try {
				conn = getConnection();
				pstmt = conn.prepareStatement(
				"select passwd from item where num = ?");
				pstmt.setInt(1, article.getNum());
				rs = pstmt.executeQuery();
				if(rs.next()){
					dbpasswd= rs.getString("passwd"); 
					if(dbpasswd.equals(article.getPasswd())){
						sql="update item set name=?,passwd=? where num=?";
						pstmt = conn.prepareStatement(sql);
						pstmt.setString(1, article.getName());
						pstmt.setString(2, article.getPasswd());
						pstmt.setInt(3, article.getNum());
						pstmt.executeUpdate();
						x= 1;
					}else{
						x= 0;
					}
				}
			} catch(Exception ex) {
				ex.printStackTrace();
			} finally {
				if (rs != null) try { rs.close(); } catch(SQLException ex) {}
				if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
				if (conn != null) try { conn.close(); } catch(SQLException ex) {}
			}
			return x;
		}
		
		public int deleteItem(int num, String passwd) throws Exception {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs= null;
			String dbpasswd="";
			int x=-1;
			try {
				conn = getConnection();
				pstmt = conn.prepareStatement(
				"select passwd from item where num = ?");
				pstmt.setInt(1, num);
				rs = pstmt.executeQuery();
				if(rs.next()){
					dbpasswd= rs.getString("passwd");
					if(dbpasswd.equals(passwd)){
						pstmt = conn.prepareStatement("delete from item where num=?");
						pstmt.setInt(1, num);
						pstmt.executeUpdate();
						x= 1; 
					}else
						x= 0; 
				}
			} catch(Exception ex) {
				ex.printStackTrace();
			} finally {
				if (rs != null) try { rs.close(); } catch(SQLException ex) {}
				if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
				if (conn != null) try { conn.close(); } catch(SQLException ex) {}
			}
			return x;
		}
		
}
