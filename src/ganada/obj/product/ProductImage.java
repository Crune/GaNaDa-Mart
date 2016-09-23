package ganada.obj.product;

public class ProductImage {
	private String im_code;				//이미지코드
	private String pd_code;				//상품코드
	private int im_order;				//이미지순서
	private String im_name;				//이미지이름
	private String c_code;				//색상코드
	
	public String getIm_code() {
		return im_code;
	}
	public void setIm_code(String im_code) {
		this.im_code = im_code;
	}
	public String getPd_code() {
		return pd_code;
	}
	public void setPd_code(String pd_code) {
		this.pd_code = pd_code;
	}
	public int getIm_order() {
		return im_order;
	}
	public void setIm_order(int im_order) {
		this.im_order = im_order;
	}
	public String getIm_name() {
		return im_name;
	}
	public void setIm_name(String im_name) {
		this.im_name = im_name;
	}
	public String getC_code() {
		return c_code;
	}
	public void setC_code(String c_code) {
		this.c_code = c_code;
	}

	public String toString() {
		String str = "ProductImage{"
				+"im_code:"+im_code
				+", pd_code:"+pd_code
				+", im_order:"+im_order
				+", im_name:"+im_name
				+", c_code:"+c_code
				+"}";
		return str;
	}
	
}
