package ganada.obj.product;

import java.sql.Timestamp;

public class ItemReview {
	private int num; //게시글 번호
	private String itemname;// 상품명
	private String itemnum;//게시한 상품등록번호
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
	private int readcount;//조회수
	private Timestamp reg_date;//등록일
	private int ref;//게시글 그룹번호
	private int re_step;//게시글 계층 정렬 번호
	private int re_level;//게시글 계층 번호
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getItemnum() {
		return itemnum;
	}
	public void setItemnum(String itemnum) {
		this.itemnum = itemnum;
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
	public int getReadcount() {
		return readcount;
	}
	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}
	public Timestamp getReg_date() {
		return reg_date;
	}
	public void setReg_date(Timestamp reg_date) {
		this.reg_date = reg_date;
	}
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	public int getRe_step() {
		return re_step;
	}
	public void setRe_step(int re_step) {
		this.re_step = re_step;
	}
	public int getRe_level() {
		return re_level;
	}
	public void setRe_level(int re_level) {
		this.re_level = re_level;
	}

	public String toString() {
	    
	    String result = "ItemReview{"+num+", "+itemname+", "+itemnum+", "+writer+", "+subject
            +siz+", "+comfortable+", "+wid+", "+dura+", "+itemsize
            +wei+", "+hei+", "+age+", "+content+", "+star
            +readcount+", "+reg_date+", "+ref+", "+re_step+", "+re_level+"}";
            
	    return result;
	}
}
