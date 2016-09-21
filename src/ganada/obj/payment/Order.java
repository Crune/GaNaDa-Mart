package ganada.obj.payment;

public class Order{

	private int order_id; // 구매 아이디(메인키)
	private String item_image; //상품이미지
	private String item_name; // 상품이름
	private String item_cl; //상품색상
	private String item_size; //상품사이즈
	private int item_cnt; //상품수량
	private int item_total; //합계금액
	private String sanction; //배송정보
	private String deliveryName; //받으시는분
	private String delivery; //배송지명
	private String deliveryTel ; // 배송지 전화번호
	private String deliveryCel ; // 배송지 휴대폰
	private String deliveryAddress1; //지번 주소
	private String deliveryAddress2; //도로명 주소
	private String delivery_msg; //배송메시지
	private String account;
	
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getItem_image() {
		return item_image;
	}
	public void setItem_image(String item_image) {
		this.item_image = item_image;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
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
	public int getItem_total() {
		return item_total;
	}
	public void setItem_total(int item_total) {
		this.item_total = item_total;
	}
	public String getSanction() {
		return sanction;
	}
	public void setSanction(String sanction) {
		this.sanction = sanction;
	}
	public String getDeliveryName() {
		return deliveryName;
	}
	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}
	public String getDelivery() {
		return delivery;
	}
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}
	public String getDeliveryTel() {
		return deliveryTel;
	}
	public void setDeliveryTel(String deliveryTel) {
		this.deliveryTel = deliveryTel;
	}
	public String getDeliveryCel() {
		return deliveryCel;
	}
	public void setDeliveryCel(String deliveryCel) {
		this.deliveryCel = deliveryCel;
	}
	public String getDeliveryAddress1() {
		return deliveryAddress1;
	}
	public void setDeliveryAddress1(String deliveryAddress1) {
		this.deliveryAddress1 = deliveryAddress1;
	}
	public String getDeliveryAddress2() {
		return deliveryAddress2;
	}
	public void setDeliveryAddress2(String deliveryAddress2) {
		this.deliveryAddress2 = deliveryAddress2;
	}
	public String getDelivery_msg() {
		return delivery_msg;
	}
	public void setDelivery_msg(String delivery_msg) {
		this.delivery_msg = delivery_msg;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	
}