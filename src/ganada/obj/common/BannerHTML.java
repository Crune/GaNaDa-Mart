package ganada.obj.common;

import java.sql.Timestamp;

public class BannerHTML {

    private String code;
    private String name;
    private String info;

    private String html;
    
    private Timestamp reg_date;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getInfo() {
	return info;
    }

    public void setInfo(String info) {
	this.info = info;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public Timestamp getReg_date() {
	return reg_date;
    }

    public void setReg_date(Timestamp reg_date) {
	this.reg_date = reg_date;
    }

}
