package ganada.obj.payment;

import java.util.ArrayList;

import ganada.core.DB;
import ganada.obj.product.Product;

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
	DB.Insert sql = db.new Insert("Cart_Item");
	try {
    	sql.inSql("CART_ID", "CART_ITEM_PK.NEXTVAL"); // 장바구니 아이디(메인키)
    	sql.inSql("REGDT", "SYSDATE"); // 날짜
    	sql.in("ITEM_ID", cart.getItem_id()); //상품번호
    	sql.in("ITEM_COLOR", cart.getItem_cl()); //상품색상
    	sql.in("ITEM_SIZE", cart.getItem_size()); //상품사이즈
    	sql.in("ITEM_COUNT", cart.getItem_cnt()); //상품수량
    	sql.in("ITEM_TOTAL", cart.getItem_total()); //합계금액
      	sql.in("USER_ID", cart.getUser_id()); // 고객  id
    	sql.run();
    	}catch(Exception e){
    		e.printStackTrace();
    	}finally{
    		db.finalize();
    	}
    }
    
    public Product getProduct(String item_id) throws Exception{
    	
    	   DB db = new DB();
    		Product product = new Product();
    	 
    		db.S("*", "product", "pd_code=?").var(item_id).exe();
		    if (db.next()) {
		    	product.setPd_name(db.getString("name"));
		    	product.setPd_price(db.getInt("price"));
		    	//product.setDiscount(db.getInt("discount"));
		    }   	   
    	   return product;
    	
    }
  
    // 장바구니 화면으로 갈 때   
   public ArrayList<Cart> getCart(String user_id) throws Exception {
   DB db = new DB();
   ArrayList<Cart> cart_list=  new ArrayList<Cart>();
   try {
	   db.S("*", "CART_ITEM", "USER_ID=?").var(user_id).exe(); 
	   while(db.next()) {
		   Cart cart= new Cart();
           cart.setCart_id(db.getInt("CART_ID"));
           cart.setItem_id(db.getString("ITEM_ID"));
           cart.setItem_cl(db.getString("ITEM_COLOR"));
           cart.setItem_size(db.getString("ITEM_SIZE"));
           cart.setItem_cnt(db.getInt("ITEM_COUNT"));
           cart.setUser_id(db.getString("USER_ID"));
           cart.setItem_image(db.getString("ITEM_IMAGE"));
           
           cart_list.add(cart);
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
   public int deleteCart(int cart_id) throws Exception {
	   DB db = new DB();
	   int x = -1;
	   
	   try {
		   db.D("CART", "CART_ID=?").var(cart_id).exe();
		   x = 1;
		
	   }catch(Exception ex) {
           ex.printStackTrace();
		}finally {
          db.finalize();
        }
  
	   return x;	
   }  
}
   