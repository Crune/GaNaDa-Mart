package ganada.obj.product;

import java.sql.Timestamp;

public class Product {
	private String pd_code;				//상품코드
	private String menu_code;			//메뉴코드
	private String pd_name;				//상품이름
	private int pd_price;				//상품가격
	private Timestamp pd_reg_date;		//상품등록일
	private String pd_infocode1;		//상품정보코드
	private String pd_infocode2;		//상품정보코드
	private String pd_infocode3;		//상품정보코드
	private String pd_infocode4;		//상품정보코드
	private String pd_infocode5;		//상품정보코드
	
	public String getPd_code() {
		return pd_code;
	}
	public void setPd_code(String pd_code) {
		this.pd_code = pd_code;
	}
	public String getMenu_code() {
		return menu_code;
	}
	public void setMenu_code(String menu_code) {
		this.menu_code = menu_code;
	}
	public String getPd_name() {
		return pd_name;
	}
	public void setPd_name(String pd_name) {
		this.pd_name = pd_name;
	}
	public int getPd_price() {
		return pd_price;
	}
	public void setPd_price(int pd_price) {
		this.pd_price = pd_price;
	}
	public Timestamp getPd_reg_date() {
		return pd_reg_date;
	}
	public void setPd_reg_date(Timestamp pd_reg_date) {
		this.pd_reg_date = pd_reg_date;
	}
	public String getPd_infocode1() {
		return pd_infocode1;
	}
	public void setPd_infocode1(String pd_infocode1) {
		this.pd_infocode1 = pd_infocode1;
	}
	public String getPd_infocode2() {
		return pd_infocode2;
	}
	public void setPd_infocode2(String pd_infocode2) {
		this.pd_infocode2 = pd_infocode2;
	}
	public String getPd_infocode3() {
		return pd_infocode3;
	}
	public void setPd_infocode3(String pd_infocode3) {
		this.pd_infocode3 = pd_infocode3;
	}
	public String getPd_infocode4() {
		return pd_infocode4;
	}
	public void setPd_infocode4(String pd_infocode4) {
		this.pd_infocode4 = pd_infocode4;
	}
	@Override
	public String toString() {
		return "Product [pd_code=" + pd_code + ", menu_code=" + menu_code + ", pd_name=" + pd_name + ", pd_price="
				+ pd_price + ", pd_reg_date=" + pd_reg_date + ", pd_infocode1=" + pd_infocode1 + ", pd_infocode2="
				+ pd_infocode2 + ", pd_infocode3=" + pd_infocode3 + ", pd_infocode4=" + pd_infocode4 + "]";
	}
	
	/*private int num;				//상품이 등록된 게시글번호
	private String name;			//상품이름
	private int price;				//가격
	private int discount;			//할인가격
	private String color;			//상품색
	private String colorcode;		//색상코드
	private String colorimage;		//색이미지
	private String pd_size;			//상품크기		
	private int stock;				//재고
	private String storead;			//매장위치
	private String image;			//상품이미지 (imageright.png/imageleft.png/imagebot.png/imagetop.png/image.png)
	private int star;				//별점
	private int recommend;			//추천수
	private String info;			//상품정보
	private String deliveryinfo;	//배송정보
	private String note;			//유의사항
	private String asinfo;			//AS정보
	private Timestamp reg_date;		//등록날짜
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColorcode() {
		return colorcode;
	}
	public void setColorcode(String colorcode) {
		this.colorcode = colorcode;
	}
	public String getColorimage() {
		return colorimage;
	}
	public void setColorimage(String colorimage) {
		this.colorimage = colorimage;
	}
	public String getPd_size() {
		return pd_size;
	}
	public void setPd_size(String pd_size) {
		this.pd_size = pd_size;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getStoread() {
		return storead;
	}
	public void setStoread(String storead) {
		this.storead = storead;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	public int getRecommend() {
		return recommend;
	}
	public void setRecommend(int recommend) {
		this.recommend = recommend;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getDeliveryinfo() {
		return deliveryinfo;
	}
	public void setDeliveryinfo(String deliveryinfo) {
		this.deliveryinfo = deliveryinfo;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getAsinfo() {
		return asinfo;
	}
	public void setAsinfo(String asinfo) {
		this.asinfo = asinfo;
	}
	public Timestamp getReg_date() {
		return reg_date;
	}
	public void setReg_date(Timestamp reg_date) {
		this.reg_date = reg_date;
	}*/
}
