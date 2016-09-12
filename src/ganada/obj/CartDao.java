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
	
	private static CartDao instance;

	public static CartDao getInstance() {

		if(instance == null) {
		instance = new CartDao();
		}
		return instance;
	}

	private CartDao(){}
    
    public void insertCart(Cart cart) throws Exception{
	DB db = new DB();
	DB.Insert sql = db.new Insert("Cart");
	try {
    	sql.inSql("ID", "BANNER_SEQ.NEXTVAL");
    	sql.in("CART_ID", cart.getCart_id()); // 장바구니 아이디(메인키)
    	sql.in("ITEM_NUM", cart.getItem_num()); //상품번호
    	sql.in("ITEM_CL", cart.getItem_cl()); //상품색상
    	sql.in("ITEM_SIZE", cart.getItem_size()); //상품사이즈
    	sql.in("ITEM_CNT", cart.getItem_cnt()); //상품수량
    	sql.in("ITEM_TOTAL", cart.getItem_total()); //합계금액
    	sql.run();
    	}catch(Exception e){
    		e.printStackTrace();
    	}finally{
    		db.finalize();
    	}
    }
  
    // 장바구니 화면으로 갈 때   
   public ArrayList<Cart> getCart(String user_id) throws Exception {
   DB db = new DB();
   ArrayList<Cart> cart_list= null;
   try {
	   db.S("*", "CART", "buyer=?").var(user_id).exe(); 
	   if (db.next()) {
		   Cart cart= new Cart();
           cart.setCart_id(db.getString("CART_ID"));
           cart.setItem_num(db.getString("ITEM_NUM"));
           cart.setItem_cl(db.getString("ITEM_CL"));
           cart.setItem_size(db.getString("ITEM_SIZE"));
           cart.setItem_cnt(db.getInt("ITEM_CNT"));
           cart.setItem_total(db.getInt("ITEM_TOTAL"));
       }
	   }catch(Exception ex){
            ex.printStackTrace();
       }finally{
            db.finalize();
       }
		return cart_list;
  }
 
   //장바구니에서 수량을 변경했을 경우 실행되는 메소드
   public void updateCart(Cart cart) throws Exception {
	   	DB db = new DB();
	   	DB.Update sql = db.new Update("Cart");
	   	try {
	       	 sql.setWhere("CART_ID", cart.getCart_id());
	         sql.set("ITEM_NUM", cart.getItem_num());
	         sql.set("ITEM_TOTAL", cart.getItem_total());
	         sql.run();
	        }catch(Exception ex) {
	            ex.printStackTrace();
	        }finally{
	           db.finalize();
	        }
   }

   //장바구니에서 cart_id에대한 레코드를 삭제하는 메소드
   public int deleteCart(String cart_id) throws Exception {
	   DB db = new DB();
	   int x = -1;
	   try {
		db.D("CART", "CODE=?").var(cart_id).exe();
		x = 1;
		}catch(Exception ex) {
           ex.printStackTrace();
		}finally {
          db.finalize();
        }
   		return x;
   		}
  }
   