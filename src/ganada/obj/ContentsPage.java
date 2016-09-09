package ganada.obj;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.StringTokenizer;

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
            result += (isFirst) ? "" : "|";
            result += key +"="+ banners.get(key);
            if (isFirst)
                isFirst = false;
        }
        return result;
    }

    public void setBanners(String news) {
        if (banners == null)
            banners = new HashMap<>();
        else
            clearBanners();
        StringTokenizer cur = new StringTokenizer(news, "|");
        while (cur.hasMoreElements()) {
            String curStr = cur.nextToken();
            StringTokenizer var = new StringTokenizer(curStr, "=");
            String varStr1 = var.nextToken();
            String varStr2 = var.nextToken();
            banners.put(Integer.parseInt(varStr1), varStr2);
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
        if (order > 0)
            order = 0;
        this.banners.put(order, code);
    }

    public void addBanner(String code) {
        int max = getMaxOrderBanner();
        this.banners.put(++max, code);
    }

    public int getMaxOrderBanner() {
        int maxKey = 0;
        for (int key : this.banners.keySet()) {
            maxKey = (maxKey < key) ? key : maxKey;
        }
        return maxKey;
    }

    public void removeBanner(String code) {
        banners.remove(code);
    }
}