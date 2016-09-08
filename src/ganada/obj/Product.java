package ganada.obj;

import java.sql.Timestamp;

public class Product {
	private int num;				//상품번호	
	private String passwd;			//글비밀번호
	private String name;			//상품이름
	private String size;			//상품크기
	private String color;			//상품색
	private int colorcount;			//상품색종류		
	private String image;			//상품이미지
	private String gender;			//상품설명
	private String type;			//상품타입
	private String brand;			//상품브랜드
	private String width;			//발볼크기		
	private int recommend;			//추천수		
	private int sellcount;			//판매량		
	private int stock;				//재고
	private int price;				//가격
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
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getColorcount() {
		return colorcount;
	}
	public void setColorcount(int colorcount) {
		this.colorcount = colorcount;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public int getRecommend() {
		return recommend;
	}
	public void setRecommend(int recommend) {
		this.recommend = recommend;
	}
	public int getSellcount() {
		return sellcount;
	}
	public void setSellcount(int sellcount) {
		this.sellcount = sellcount;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
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
