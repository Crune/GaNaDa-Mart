package ganada.obj.payment;

public class Cart {
	private int cart_id; // 장바구니 아이디(메인키)
	private String item_num; //상품번호
	private String item_name; // 상품이름
	private String item_id; // 상품이름
	private String user_id;  // 고객 id
	private String item_cl; //상품색상
	private String item_size; //상품사이즈
	private int item_cnt; //상품수량
	private int item_price; //  상품 단가
	private int item_total; //합계금액
	private String item_image;
	
	public int getCart_id() {
		return cart_id;
	}
	public String getItem_id() {
		return item_id;
	}
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	public String getItem_num() {
		return item_num;
	}
	public void setItem_num(String item_num) {
		this.item_num = item_num;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getItem_cl() {
		return item_cl;
	}
	public void setItem_cl(String item_cl) {
		this.item_cl = item_cl;
	}
	public String getItem_size() {
		return item_size;
	}
	public void setItem_size(String item_size) {
		this.item_size = item_size;
	}
	public int getItem_cnt() {
		return item_cnt;
	}
	public void setItem_cnt(int item_cnt) {
		this.item_cnt = item_cnt;
	}
	public int getItem_price() {
		return item_price;
	}
	public void setItem_price(int item_price) {
		this.item_price = item_price;
	}
	public int getItem_total() {
		return item_total;
	}
	public void setItem_total(int item_total) {
		this.item_total = item_total;
	}
	public String getItem_image() {
		return item_image;
	}
	public void setItem_image(String item_image) {
		this.item_image = item_image;
	}
	
	
}
	
