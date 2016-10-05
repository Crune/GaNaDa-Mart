package ganada.obj.product;

import java.sql.Timestamp;

public class ItemReview {
	private int num; //게시글 번호
	private String pd_name;// 상품명
	private String pd_code;//게시한 상품등록번호
	private String ac_code;
	private String writer;//작성자
	private String subject;//제목
	private int siz;
	private int comfortable;
	private int wid;
	private int dura;
	private String itemsize;
	private String wei;
	private String hei;
	private String age;
	private String content;//내용
	private int star;//별점
	private int vote_up;
	private int vote_down;
	private Timestamp reg_date;//등록일
	private String img;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	public String getPd_name() {
		return pd_name;
	}
	public void setPd_name(String pd_name) {
		this.pd_name = pd_name;
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
	public int getVote_up() {
		return vote_up;
	}
	public void setVote_up(int vote_up) {
		this.vote_up = vote_up;
	}
	public int getVote_down() {
		return vote_down;
	}
	public void setVote_down(int vote_down) {
		this.vote_down = vote_down;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getSiz() {
		return siz;
	}
	public void setSiz(int siz) {
		this.siz = siz;
	}
	public int getComfortable() {
		return comfortable;
	}
	public void setComfortable(int comfortable) {
		this.comfortable = comfortable;
	}
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public int getDura() {
		return dura;
	}
	public void setDura(int dura) {
		this.dura = dura;
	}
	public String getItemsize() {
		return itemsize;
	}
	public void setItemsize(String itemsize) {
		this.itemsize = itemsize;
	}
	public String getWei() {
		return wei;
	}
	public void setWei(String wei) {
		this.wei = wei;
	}
	public String getHei() {
		return hei;
	}
	public void setHei(String hei) {
		this.hei = hei;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}

	public Timestamp getReg_date() {
		return reg_date;
	}
	public void setReg_date(Timestamp reg_date) {
		this.reg_date = reg_date;
	}

	
	
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String toString() {
	    
	    String result = "ItemReview{"+num+", "+pd_name+", "+pd_code+", "+ac_code+" "+writer+", "+subject
            +siz+", "+comfortable+", "+wid+", "+dura+", "+itemsize
            +wei+", "+hei+", "+age+", "+content+", "+star+", "+reg_date+", "+"img"+","
            		+vote_up+", "+vote_down+"}";
            
	    return result;
	}
}
