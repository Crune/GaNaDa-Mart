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

import ganada.core.*;

	public class CartDao {
	
		private static CartDao instance = new CartDao();

		public static CartDao getInstance() {
	
			return instance;
		}
    
    private CartDao() {}
    
    private Connection getConnection() throws Exception {
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource)envCtx.lookup("jdbc/orcl");
		return ds.getConnection();
	}
    
    //[장바구니]를 클릭하면 수행되는 것으로 cart 테이블에 새로운 레코드를 추가
    public void insertCart(Cart cart) throws Exception {
    	Connection conn = null;
        PreparedStatement pstmt = null;
        String sql="";
    	
    	try {
    		conn = getConnection();
    		sql= "insert into cart (item_image, item_name, item_cl, item_size, item_price, item_cnt, item_total)" + 
    	         "values (?,?,?,?,?,?,?)";
    		pstmt = conn.prepareStatement(sql);
    		
    		pstmt.setString (1, cart.getItem_image()); //상품이미지
    		pstmt.setString (2, cart.getItem_name()); //상품이름
    		pstmt.setString (3, cart.getItem_cl()); //상품색상
    		pstmt.setString (4, cart.getItem_size()); //상품사이즈
    		pstmt.setInt (5, cart.getItem_price()); //상품금액
    		pstmt.setInt (6, cart.getItem_cnt()); //상품수량
    		pstmt.setInt (7, cart.getItem_total()); //합계금액
    		
    		pstmt.executeUpdate();
    	}catch(Exception ex) {
    		ex.printStackTrace();
    	}finally{
    		if(pstmt !=null)
    		   try { pstmt.close(); } catch(SQLException ex) {}
    		if(conn != null)
    		   try { conn.close(); } catch(SQLException ex) {}
    	}
    		
    }
  //id에 해당하는 레코드의 수를 얻어내는 메소드
    public int getListCount(String id) throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        int x=0;

        try {
            conn = getConnection();
            
            pstmt = conn.prepareStatement(
            		"select count(*) from cart where buyer=?");
            pstmt.setString(1, id);
            rs = pstmt.executeQuery();

            if (rs.next()) {
               x= rs.getInt(1);
			}
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            if (rs != null) 
            	try { rs.close(); } catch(SQLException ex) {}
            if (pstmt != null) 
            	try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) 
            	try { conn.close(); } catch(SQLException ex) {}
        }
		return x;
    }
 
    public int getMyArticleCount(String id) throws Exception {
    	Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        int x=0;

        try {
            conn = getConnection();
            
            pstmt = conn.prepareStatement(
            		"select count(*) from cart where buyer=?");
            pstmt.setString(1, id);
            rs = pstmt.executeQuery();

            if (rs.next()) {
               x= rs.getInt(1);
			}
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            if (rs != null) 
            	try { rs.close(); } catch(SQLException ex) {}
            if (pstmt != null) 
            	try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) 
            	try { conn.close(); } catch(SQLException ex) {}
        }
		return x;
    }
    
    //id에 해당하는 레코드의 목록을 얻어내는 메소드
    public List<Cart> getCart(String id, int count) throws Exception {
    	Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Cart cart=null;
        String sql = "";
        List<Cart> lists = null;
        
        try {
       	 conn = getConnection();
       	 
       	 sql = "select * from cart where buyer = ?";
            pstmt = conn.prepareStatement(sql);
            
            pstmt.setString(1, id);
            rs = pstmt.executeQuery();
            
            lists = new ArrayList<Cart>(count);

            while (rs.next()) {
           	 cart = new Cart();
           	 
           	cart.setItem_image(rs.getString("item_image")); 
           	cart.setItem_name(rs.getString("item_name"));
           	cart.setItem_cl(rs.getString("item_name"));
           	cart.setItem_size(rs.getString("item_size"));
           	cart.setItem_price(rs.getInt("item_price"));
           	cart.setItem_cnt(rs.getInt("item_cnt"));
           	cart.setItem_total(rs.getInt("item_total"));
           	
            lists.add(cart);
			 }
        }catch(Exception ex) {
            ex.printStackTrace();
        }finally {
            if (rs != null) 
           	 try { rs.close(); } catch(SQLException ex) {}
            if (pstmt != null) 
           	 try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) 
           	 try { conn.close(); } catch(SQLException ex) {}
        }
		 return lists;
    }
    
    //장바구니에서 수량을 수정시 실행되는 메소드
    public void updateCount(int cart_id, byte count) throws Exception {
   	 Connection conn = null;
        PreparedStatement pstmt = null;
      
        try {
       	 conn = getConnection();
           
            pstmt = conn.prepareStatement(
              "update cart set buy_count=? where cart_id=?");
            pstmt.setByte(1, count);
            pstmt.setInt(2, cart_id);
                       
            pstmt.executeUpdate();
        }catch(Exception ex) {
            ex.printStackTrace();
        }finally {
            if (pstmt != null) 
           	 try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) 
           	 try { conn.close(); } catch(SQLException ex) {}
        }
    }
  
    //장바구니에서 cart_id에대한 레코드를 삭제하는 메소드
    public void deleteList(int cart_id) throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
              
        try {
			 conn = getConnection();

            pstmt = conn.prepareStatement(
          	   "delete from cart where cart_id=?");
            pstmt.setInt(1, cart_id);
            
            pstmt.executeUpdate();
        }catch(Exception ex) {
            ex.printStackTrace();
        }finally {
            
            if (pstmt != null) 
           	 try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) 
           	 try { conn.close(); } catch(SQLException ex) {}
        }
    }
    
    //id에 해당하는 모든 레코드를 삭제하는 메소드로 [장바구니 삭제]단추를 클릭시 실행된다.
    public void deleteAll(String id) throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
                 
        try {
			 conn = getConnection();

            pstmt = conn.prepareStatement(
              "delete from cart where buyer=?");
            pstmt.setString(1, id);
            
            pstmt.executeUpdate();
        }catch(Exception ex) {
            ex.printStackTrace();
        }finally {
            if (pstmt != null) 
           	 try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) 
           	 try { conn.close(); } catch(SQLException ex) {}
        }
    }
}
