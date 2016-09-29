package ganada.obj.product;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ganada.core.*;
import ganada.obj.product.ProductImage;
import ganada.obj.product.ProductImageDao;

public class ProductImageDao extends DAO {
    private static ProductImageDao instance = new ProductImageDao();

    public static ProductImageDao getInstance() {
        return instance;
    }

    private ProductImageDao() {
    }

    private static DBTable t;

    @Override
    protected DBTable gT() {
        if (t == null) {
            t = new DBTable("product_image", "im_code");
            t.setCls("ganada.obj.product.ProductImage");
        }
        return t;
    }
    
    public List<ProductImage> getProductImageList(String pd_code, String c_code) throws Exception {
        DB db = new DB();
        List<ProductImage> articleList = null;
        try {
            db.S("*", "product_image", "pd_code=? and c_code=?").var(pd_code).var(c_code).exe();
            if (db.next()) {
                // System.out.println("ProductImageDao.getProductImageList.next?:독작둥");
                articleList = new ArrayList<ProductImage>();
                do {
                    ProductImage article = new ProductImage();
                    article.setIm_code(db.getString("im_code"));
                    article.setPd_code(db.getString("pd_code"));
                    article.setIm_order(db.getInt("im_order"));
                    article.setIm_name(db.getString("im_name"));
                    article.setC_code(db.getString("c_code"));
                    articleList.add(article);
                } while (db.next());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            db.finalize();
        }
        return articleList;
    }

    /**
     * @param pd_code
     *            상품코드
     * @return 상품코드로 조회한 색상별 이미지
     */
    public Map<String, ProductImage> mapColorImg(String pd_code) {
        DB db = new DB();
        Map<String, ProductImage> imgPerColor = new HashMap<String, ProductImage>();
        try {
            db.S("*", "product_image", "pd_code=?").var(pd_code).exe();
            while (db.next()) {
                ProductImage cur = new ProductImage();
                for (Method m : t.setter()) {
                    Object value = cVO(m.getParameterTypes()[0], db.getString(cName(m)));
                    m.invoke(cur, value);
                }
                imgPerColor.put(cur.getC_code(), cur);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.finalize();
        }
        return imgPerColor;
    }

}
