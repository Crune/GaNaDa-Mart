package ganada.obj;

import java.sql.Timestamp;

public class Cart {
	private String item_num; //상품번호
	private String item_cl; //상품색상
	private String item_size; //상품사이즈
	private int item_cnt; //상품수량
	private int item_total; //합계금액
	public String getItem_num() {
		return item_num;
	}
	public void setItem_num(String item_num) {
		this.item_num = item_num;
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
	
	
}