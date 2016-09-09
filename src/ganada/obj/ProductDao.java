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
		
		public List getArticles() throws Exception{
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			List articleList=null;
			try {
				conn = getConnection();
				pstmt = conn.prepareStatement("select * from prouct");
						rs = pstmt.executeQuery();
						if (rs.next()) {
							articleList = new ArrayList(); 
							while(rs.next()){ 			
								Product article= new Product();
								article.setNum(rs.getInt("num"));
								article.setName(rs.getString("name"));
								article.setPrice(rs.getInt("price"));
								article.setDiscount(rs.getInt("discount"));
								article.setColor(rs.getString("color"));
								article.setStock(rs.getInt("Stock"));
								article.setStoread(rs.getString("storead"));
								article.setImage(rs.getString("image"));
								article.setStar(rs.getInt("star"));
								article.setRecommend(rs.getInt("recommend"));
								article.setInfo(rs.getString("info"));
								article.setDeliveryinfo(rs.getString("deliveryinfo"));
								article.setNote(rs.getString("note"));
								article.setAsinfo(rs.getString("asinfo"));
								article.setReg_date(rs.getTimestamp("reg_date"));
								
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
		
		public void insertArticle(Product article){		//관리자가 상품을 등록할 때 사용
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				conn = getConnection();		
				String sql="insert into product values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,sysdate)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, article.getNum());		
				pstmt.setString(2, article.getPasswd());
				pstmt.setString(3, article.getName());	
				pstmt.setInt(4, article.getPrice());	
				pstmt.setInt(5, article.getDiscount());
				pstmt.setString(6, article.getColor());
				pstmt.setString(7, article.getSize());
				pstmt.setInt(8, article.getStock());
				pstmt.setString(9, article.getStoread());
				pstmt.setString(10, article.getImage());
				pstmt.setInt(11, article.getStar());
				pstmt.setInt(12, article.getRecommend());
				pstmt.setString(13, article.getInfo());
				pstmt.setString(14, article.getDeliveryinfo());	
				pstmt.setString(15, article.getNote());	
				pstmt.setString(16, article.getAsinfo());		
				pstmt.executeUpdate();
			}catch(Exception e){			
				e.printStackTrace();
			}finally{
				if(pstmt != null){try{pstmt.close();}catch(SQLException s){}}
				if(conn != null){try{conn.close();}catch(SQLException s){}}
			}
		}		
		
		public int updateArticle(Product article) throws Exception {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs= null;
			String dbpasswd="";
			String sql="";
			int x=-1;
			try {
				conn = getConnection();
				pstmt = conn.prepareStatement(
				"select passwd from product where num = ?");
				pstmt.setInt(1, article.getNum());
				rs = pstmt.executeQuery();
				if(rs.next()){
					dbpasswd= rs.getString("passwd"); 
					if(dbpasswd.equals(article.getPasswd())){
						sql="update product set passwd=?,name=?,price=?,discount=?,color=?,size=?,stock=?,storead=?,image=?,star=?,recommend=?,info=?,deliveryinfo=?,note=?,asinfo=? where num=?";
						pstmt = conn.prepareStatement(sql);		
						pstmt.setString(1, article.getPasswd());
						pstmt.setString(2, article.getName());	
						pstmt.setInt(3, article.getPrice());	
						pstmt.setInt(4, article.getDiscount());
						pstmt.setString(5, article.getColor());
						pstmt.setString(6, article.getSize());
						pstmt.setInt(7, article.getStock());
						pstmt.setString(8, article.getStoread());
						pstmt.setString(9, article.getImage());
						pstmt.setInt(10, article.getStar());
						pstmt.setInt(11, article.getRecommend());
						pstmt.setString(12, article.getInfo());
						pstmt.setString(13, article.getDeliveryinfo());	
						pstmt.setString(14, article.getNote());	
						pstmt.setString(15, article.getAsinfo());	
						pstmt.setInt(16, article.getNum());
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
		
		public int deleteArticle(int num, String passwd) throws Exception {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs= null;
			String dbpasswd="";
			int x=-1;
			try {
				conn = getConnection();
				pstmt = conn.prepareStatement(
				"select passwd from product where num = ?");
				pstmt.setInt(1, num);
				rs = pstmt.executeQuery();
				if(rs.next()){
					dbpasswd= rs.getString("passwd");
					if(dbpasswd.equals(passwd)){
						pstmt = conn.prepareStatement("delete from product where num=?");
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
