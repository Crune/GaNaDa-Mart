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
public class ItemDBReview {

	private static ItemDBReview instance = new ItemDBReview();

	public static ItemDBReview getInstance(){
		return instance;
	}

	private ItemDBReview(){}
	
	private Connection getConnection() throws Exception{
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource)envCtx.lookup("jdbc/orcl");
		return ds.getConnection();
	}
	
	public void insertArticle(ItemReview article){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int num = article.getNum();
		int ref = article.getRef();
		int re_step = article.getRe_step();
		int re_level = article.getRe_level();
		int number = 0;
		String sql="";
		try{
			conn = getConnection();
			pstmt = conn.prepareStatement("select max(num) from review");
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				number = rs.getInt(1)+1;
			}
			else{
				number = 1;
			}
			
			if(num != 0)
			{
				sql = "update review set re_step=re_step+1 where ref=? and re_step>?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, ref);
				pstmt.setInt(2, re_step);
				pstmt.executeUpdate();
				re_step = re_step+1;
				re_level = re_level+1;
			}else{
				ref = number;
				re_step = 0;
				re_level = 0;
			}
			
			sql = "insert into review(num,itemnum,itemname,writer,subject,mail,content,star,passwd,readcount,ip,reg_date,REF,RE_STEP,RE_LEVEL) values(review_seq.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, article.getItemnum());
			pstmt.setString(2, article.getItemname());
			pstmt.setString(3, article.getWriter());
			pstmt.setString(4, article.getSubject());
			pstmt.setString(5, article.getMail());
			pstmt.setString(6, article.getContent());
			pstmt.setInt(7, article.getStar());
			pstmt.setString(8, article.getPasswd());
			pstmt.setInt(9, article.getReadcount());
			pstmt.setString(10, article.getIp());
			pstmt.setTimestamp(11, article.getReg_date());
			pstmt.setInt(12, article.getRef());
			pstmt.setInt(13, article.getRe_step());
			pstmt.setInt(14, article.getRe_level());
			pstmt.executeUpdate();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			if(rs != null)try{ rs.close();}catch(SQLException ex){}
			if(pstmt != null)try{ pstmt.close();}catch(SQLException ex){}
			if(conn != null)try{ conn.close();}catch(SQLException ex){}
		}
	}
	
	//review에 저장된 전체 글의 수
	public int getArticleCount() throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int x = 0;
		try{
			conn = getConnection();
			pstmt = conn.prepareStatement("select count(*) from review");
			rs = pstmt.executeQuery();
			
			if(rs.next())
				x = rs.getInt(1);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			if(rs != null)try{ rs.close();}catch(SQLException ex){}
			if(pstmt != null)try{ pstmt.close();}catch(SQLException ex){}
			if(conn != null)try{ conn.close();}catch(SQLException ex){}
		}
		return x;
	}
	
	//특정 상품에 대해 작성한 review의 수
	
	public int getArticleCount(int itemnum) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int x = 0;
		
		try{
			conn = getConnection();
			pstmt = conn.prepareStatement("select count(*) from review where itemnum="+itemnum);
			
			rs=pstmt.executeQuery();
			
			if(rs.next())
				x=rs.getInt(1);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			if(rs != null)try{ rs.close();}catch(SQLException ex){}
			if(pstmt != null)try{ pstmt.close();}catch(SQLException ex){}
			if(conn != null)try{ conn.close();}catch(SQLException ex){}
		}
		return x;
	}
	
	public List<ItemReview> getArticles(int count) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<ItemReview> articleList = null;
		try{
			conn = getConnection();
			
			pstmt = conn.prepareStatement("select * from review order by ref desc, re_step asc");
			rs = pstmt.executeQuery();
			
			if(rs.next())
			{
				articleList = new ArrayList<ItemReview>(count);
				do{
					ItemReview article = new ItemReview();
					article.setNum(rs.getInt("num"));
					article.setItemnum(rs.getInt("itemnum"));
					article.setItemname(rs.getString("itemname"));
					article.setWriter(rs.getString("writer"));
					article.setSubject(rs.getString("subject"));
					article.setMail(rs.getString("mail"));
					article.setContent(rs.getString("content"));
					article.setStar(rs.getInt("star"));
					article.setPasswd(rs.getString("passwd"));
					article.setReadcount(rs.getInt("readcount"));
					article.setIp(rs.getString("ip"));
					article.setReg_date(rs.getTimestamp("reg_date"));
					article.setRef(rs.getInt("ref"));
					article.setRe_step(rs.getInt("re_step"));
					article.setRe_level(rs.getInt("re_level"));
					
					articleList.add(article);
				}while(rs.next());
					
				}
			}catch(Exception ex){ex.printStackTrace();
		}finally{
			if(rs != null)try{ rs.close();}catch(SQLException ex){}
			if(pstmt != null)try{ pstmt.close();}catch(SQLException ex){}
			if(conn != null)try{ conn.close();}catch(SQLException ex){}
		}
		return articleList;
	}
	public List<ItemReview> getArticles(int count, int itemnum) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<ItemReview> articleList = null;
		
		try{
			conn = getConnection();
			pstmt = conn.prepareStatement("select * from review where itemnum="+itemnum+"order by ref desc, re_step asc");
			rs = pstmt.executeQuery();
			
			if(rs.next())
			{
				articleList = new ArrayList<ItemReview>(count);
				do{
					ItemReview article = new ItemReview();
					article.setNum(rs.getInt("num"));
					article.setItemnum(rs.getInt("itemnum"));
					article.setItemname(rs.getString("itemname"));
					article.setWriter(rs.getString("writer"));
					article.setSubject(rs.getString("subject"));
					article.setMail(rs.getString("mail"));
					article.setContent(rs.getString("content"));
					article.setStar(rs.getInt("star"));
					article.setPasswd(rs.getString("passwd"));
					article.setReadcount(rs.getInt("readcount"));
					article.setIp(rs.getString("ip"));
					article.setReg_date(rs.getTimestamp("reg_date"));
					article.setRef(rs.getInt("ref"));
					article.setRe_step(rs.getInt("re_step"));
					article.setRe_level(rs.getInt("re_level"));
					
					articleList.add(article);
				}while(rs.next());
				
			}
		}catch(Exception ex){ex.printStackTrace();}
		finally{
			if(rs != null)try{ rs.close();}catch(SQLException ex){}
			if(pstmt != null)try{ pstmt.close();}catch(SQLException ex){}
			if(conn != null)try{ conn.close();}catch(SQLException ex){}
		}
		return articleList;
	}
	public ItemReview updateGetArticle(int num) throws Exception{
		 Connection conn = null;
		 PreparedStatement pstmt = null;
		 ResultSet rs = null;
		 ItemReview article = null;
		 try{
			 conn = getConnection();
			 
			 pstmt = conn.prepareStatement("select * from review where num = ?");
			 pstmt.setInt(1, num);
			 rs = pstmt.executeQuery();
			 
			 if(rs.next()){
				 article = new ItemReview();
				 article.setNum(rs.getInt("num"));
				 article.setItemnum(rs.getInt("itemnum"));
				 article.setItemname(rs.getString("itemname"));
				 article.setWriter(rs.getString("writer"));
				 article.setSubject(rs.getString("subject"));
				 article.setMail(rs.getString("mail"));
				 article.setContent(rs.getString("content"));
				 article.setStar(rs.getInt("star"));
				 article.setPasswd(rs.getString("passwd"));
				 article.setReadcount(rs.getInt("readcount"));
				 article.setIp(rs.getString("ip"));
				 article.setReg_date(rs.getTimestamp("reg_date"));
				 article.setRef(rs.getInt("ref"));
				 article.setRe_step(rs.getInt("re_step"));
				 article.setRe_level(rs.getInt("re_level"));
			 }
		 }catch(Exception ex){ ex.printStackTrace(); }
		finally{
			if(rs != null)try{ rs.close();}catch(SQLException ex){}
			if(pstmt != null)try{ pstmt.close();}catch(SQLException ex){}
			if(conn != null)try{ conn.close();}catch(SQLException ex){}
		}
		 return article;
	}
	
	public int updateArticle(ItemReview article) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String dbpasswd="";
		String sql="";
		int x = -1;
		try{
			conn = getConnection();
			sql="select passwd from review where num = ?");
			pstmt.setInt(1,  article.getNum());
			rs = pstmt.executeQuery();
			if(rs.next()){
				dbpasswd= rs.getString("passwd");
				if(dbpasswd.equals(article.getPasswd())){
					sql="update review set content=? where num=?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, article.getContent());
					pstmt.setInt(2, article.getNum());
					pstmt.executeUpdate();
					x = 1;
				}else{
					x=0;
				}
			}
		}catch(Exception ex){
				ex.printStackTrace();
	}finally{
		if(rs != null)try{ rs.close();}catch(SQLException ex){}
		if(pstmt != null)try{ pstmt.close();}catch(SQLException ex){}
		if(conn != null)try{ conn.close();}catch(SQLException ex){}
	}
		return x;
}
	

}