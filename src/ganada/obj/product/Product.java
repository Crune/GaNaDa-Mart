package ganada.obj.product;

import java.sql.Timestamp;

public class Product {
	private int num;				//상품이 등록된 게시글번호
//	private String passwd;			//글비밀번호
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
	//private int pd_num;				//상품등록번호
	//private String imageright;	//상품우측이미지
	//private String imageleft;		//상품좌측이미지
	//private String imagebot;		//상품하단이미지
	//private String imagetop;		//상품상단이미지
	//private int sellcount;		//판매량
	//private String gender;		//상품성별
	//private String type;			//상품타입
	//private String brand;			//상품브랜드
	//private String width;			//발볼크기	
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
	}
}
