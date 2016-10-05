package ganada.obj.product;

public class Stock {
	private String sk_code;				//재고코드
	//private String st_code;				//창고코드
	private String c_code;				//색상코드
	private String pd_size;				//사이즈
	private int amount;				//재고량
	private String pd_code;				//상품코드
	
	public String getSk_code() {
		return sk_code;
	}
	public void setSk_code(String sk_code) {
		this.sk_code = sk_code;
	}
	public String getC_code() {
		return c_code;
	}
	public void setC_code(String c_code) {
		this.c_code = c_code;
	}
	public String getPd_size() {
		return pd_size;
	}
	public void setPd_size(String pd_size) {
		this.pd_size = pd_size;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getPd_code() {
		return pd_code;
	}
	public void setPd_code(String pd_code) {
		this.pd_code = pd_code;
	}
	
}
