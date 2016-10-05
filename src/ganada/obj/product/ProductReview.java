package ganada.obj.product;

import java.sql.Timestamp;

public class ProductReview {
	private String rv_code;
	private String pd_code;
	private String ac_code;
    private String ac_name;

	private String rv_subject;
	private String rv_cont;

    private int rv_rate0=0;
	private int rv_rate1=0;
	private int rv_rate2=0;
	private int rv_rate3=0;
	private int rv_rate4=0;
	
    private int rv_size;
    private int rv_weight;
    private int rv_height;
    private int rv_age;
    
    private int rv_vote_up=0;
    private int rv_vote_down=0;
    
	private Timestamp rv_reg_date;

    private String rv_img;
    
	public double _getTotalScore() {
		double result = (rv_rate1+rv_rate2+rv_rate3+rv_rate4)/4/7*5;
		return result;
	}

    public String getRv_code() {
        return rv_code;
    }

    public void setRv_code(String rv_code) {
        this.rv_code = rv_code;
    }

    public String getPd_code() {
        return pd_code;
    }

    public void setPd_code(String pd_code) {
        this.pd_code = pd_code;
    }

    public String getAc_code() {
        return ac_code;
    }

    public void setAc_code(String ac_code) {
        this.ac_code = ac_code;
    }

    public String getAc_name() {
        return ac_name;
    }

    public void setAc_name(String ac_name) {
        this.ac_name = ac_name;
    }

    public String getRv_subject() {
        return rv_subject;
    }

    public void setRv_subject(String rv_subject) {
        this.rv_subject = rv_subject;
    }

    public String getRv_cont() {
        return rv_cont;
    }

    public void setRv_cont(String rv_cont) {
        this.rv_cont = rv_cont;
    }

    public int getRv_rate0() {
        return rv_rate0;
    }

    public void setRv_rate0(int rv_rate0) {
        this.rv_rate0 = rv_rate0;
    }

    public int getRv_rate1() {
        return rv_rate1;
    }

    public void setRv_rate1(int rv_rate1) {
        this.rv_rate1 = rv_rate1;
    }

    public int getRv_rate2() {
        return rv_rate2;
    }

    public void setRv_rate2(int rv_rate2) {
        this.rv_rate2 = rv_rate2;
    }

    public int getRv_rate3() {
        return rv_rate3;
    }

    public void setRv_rate3(int rv_rate3) {
        this.rv_rate3 = rv_rate3;
    }

    public int getRv_rate4() {
        return rv_rate4;
    }

    public void setRv_rate4(int rv_rate4) {
        this.rv_rate4 = rv_rate4;
    }

    public int getRv_size() {
        return rv_size;
    }

    public void setRv_size(int rv_size) {
        this.rv_size = rv_size;
    }

    public int getRv_weight() {
        return rv_weight;
    }

    public void setRv_weight(int rv_weight) {
        this.rv_weight = rv_weight;
    }

    public int getRv_height() {
        return rv_height;
    }

    public void setRv_height(int rv_height) {
        this.rv_height = rv_height;
    }

    public int getRv_age() {
        return rv_age;
    }

    public void setRv_age(int rv_age) {
        this.rv_age = rv_age;
    }

    public int getRv_vote_up() {
        return rv_vote_up;
    }

    public void setRv_vote_up(int rv_vote_up) {
        this.rv_vote_up = rv_vote_up;
    }

    public int getRv_vote_down() {
        return rv_vote_down;
    }

    public void setRv_vote_down(int rv_vote_down) {
        this.rv_vote_down = rv_vote_down;
    }

    public Timestamp getRv_reg_date() {
        return rv_reg_date;
    }

    public void setRv_reg_date(Timestamp rv_reg_date) {
        this.rv_reg_date = rv_reg_date;
    }

    public String getRv_img() {
        return rv_img;
    }

    public void setRv_img(String rv_img) {
        this.rv_img = rv_img;
    }
	

}
