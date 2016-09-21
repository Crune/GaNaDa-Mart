package ganada.obj.product;

public class Image {
	private String im_code;				//이미지코드
	private String pd_code;				//상품코드
	private String im_order;			//이미지순서
	private String im_path;				//이미지경로
	
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
	public String getIm_order() {
		return im_order;
	}
	public void setIm_order(String im_order) {
		this.im_order = im_order;
	}
	public String getIm_path() {
		return im_path;
	}
	public void setIm_path(String im_path) {
		this.im_path = im_path;
	}
}
