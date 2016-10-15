package ganada.obj.product;

public class ProductCatalog {
    private String cat_code;
    private String cat_name;
    private String cat_info;
    private String cat_upper;

    
    public String getCat_code() {
        return cat_code;
    }
    public void setCat_code(String cat_code) {
        this.cat_code = cat_code;
    }
    public String getCat_name() {
        return cat_name;
    }
    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }
    public String getCat_info() {
        return cat_info;
    }
    public void setCat_info(String cat_info) {
        this.cat_info = cat_info;
    }
    public String getCat_upper() {
        return cat_upper;
    }
    public void setCat_upper(String cat_upper) {
        this.cat_upper = cat_upper;
    }
    
    @Override
    public String toString() {
        return "ProductCatalog [cat_code=" + cat_code 
                            + ", cat_name=" + cat_name 
                            + ", cat_info=" + cat_info
                            + ", cat_upper=" + cat_upper 
                            + "]";
    }
}
