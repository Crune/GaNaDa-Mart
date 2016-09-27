package ganada.obj.payment;

import java.util.ArrayList;

import ganada.core.DAO;
import ganada.core.DB;
import ganada.core.DBTable;
import ganada.obj.product.Product;

public class CartDao extends DAO {

	private static CartDao instance;

	public static CartDao getInstance() {

		if (instance == null) {
			instance = new CartDao();
		}
		return instance;
	}

	private CartDao() {
	}

	private static DBTable t;

	@Override
	protected DBTable gT() {
		if (t == null) {
			t = new DBTable("CART_ITEM", "CART_ID");
			t.setCls("ganada.obj.payment.Cart");
		}
		return t;
	}
		
	// 장바구니 화면으로 갈 때
	public ArrayList<Cart> getCart(String user_id) throws Exception {
		DB db = new DB();
		ArrayList<Cart> cart_list = new ArrayList<Cart>();
		try {
			db.S("*", "CART_ITEM", "USER_ID=?").var(user_id).exe();
			while (db.next()) {
				Cart cart = new Cart();
				cart.setCart_id(db.getInt("CART_ID"));
				cart.setItem_id(db.getString("ITEM_ID"));
				cart.setItem_cl(db.getString("ITEM_COLOR"));
				cart.setItem_size(db.getString("ITEM_SIZE"));
				cart.setItem_cnt(db.getInt("ITEM_COUNT"));
				cart.setUser_id(db.getString("USER_ID"));
				cart.setItem_image(db.getString("ITEM_IMAGE"));

				cart_list.add(cart);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			db.finalize();
		}
		return cart_list;
	}

}
