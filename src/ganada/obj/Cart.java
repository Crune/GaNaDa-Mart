package ganada.obj;

import java.sql.Timestamp;

public class Cart {
	private String item_image; //상품이미지
	private String item_name; //상품이름
	private String item_cl; //상품색상
	private String item_size; //상품사이즈
	private int item_price; //상품금액
	private int item_cnt; //상품수량
	private int item_total; //합계금액
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
	public int getItem_price() {
		return item_price;
	}
	public void setItem_price(int item_price) {
		this.item_price = item_price;
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
	
}