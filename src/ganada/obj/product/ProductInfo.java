package ganada.obj.product;

public class ProductInfo {
	private String pd_infocode;					//상품정보코드
	private String pd_infocontent;				//상품정보내용
	private String pd_infotype;
	
	
	public String getPd_infotype() {
		return pd_infotype;
	}
	public void setPd_infotype(String pd_infotype) {
		this.pd_infotype = pd_infotype;
	}
	public String getPd_infocode() {
		return pd_infocode;
	}
	public void setPd_infocode(String pd_infocode) {
		this.pd_infocode = pd_infocode;
	}
	public String getPd_infocontent() {
		return pd_infocontent;
	}
	public void setPd_infocontent(String pd_infocontent) {
		this.pd_infocontent = pd_infocontent;
	}
}
