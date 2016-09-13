package ganada.obj;

public class Menu {

    public static final int TYPE_NORMAL = 0;
    public static final int TYPE_EVENT = 1;

    private int level;
    private String code;
    private String name;
    private int type = TYPE_NORMAL;
    private String upper;
    private int order_lv = 100;

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
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
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public String getUpper() {
        return upper;
    }
    public void setUpper(String upper) {
        this.upper = upper;
    }
    public int getOrder_lv() {
        return order_lv;
    }
    public void setOrder_lv(int order_lv) {
        this.order_lv = order_lv;
    }
}
