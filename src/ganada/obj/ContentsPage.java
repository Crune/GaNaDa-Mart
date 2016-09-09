package ganada.obj;

import java.sql.Timestamp;
import java.util.HashMap;

public class ContentsPage {

    private String code;
    private String name;
    private String info;

    private HashMap<Integer, String> banners; // order, code
    
    private Timestamp reg_date;
    private Timestamp mod_date;
    
    
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
    
    public String getBanners() {
	String result = "";
	boolean isFirst = true;
	for (int key : banners.keySet()) {
	    result += (isFirst)?"":"/"+key+banners.get(key);
	    if (isFirst) isFirst = false;
	}
        return result;
    }
    public void setBanners(String news) {
	if (banners == null) banners = new HashMap<>();
	else clearBanners();
	for (String cur : news.split("|")) {
	    String[] var = cur.split("=");
	    banners.put(Integer.getInteger(var[0]), var[1]);
	}
    }
    
    public Timestamp getReg_date() {
        return reg_date;
    }
    public void setReg_date(Timestamp reg_date) {
        this.reg_date = reg_date;
    }
    public Timestamp getMod_date() {
        return mod_date;
    }
    public void setMod_date(Timestamp mod_date) {
        this.mod_date = mod_date;
    }
    
    

    public void clearBanners() {
	banners.clear();
    }
    public void putBanner(int order, String code) {
	if (order>0) order=0;
	this.banners.put(order, code);
    }
    public void addBanner(String code) {
	int max = getMaxOrderBanner();
	this.banners.put(++max, code);
    }
    public int getMaxOrderBanner() {
	int maxKey = 0;
	for (int key : this.banners.keySet()) {
	    maxKey = (maxKey<key)?key:maxKey;
	}
	return maxKey;
    }
    public void removeBanner(String code) {
	banners.remove(code);
    }
}