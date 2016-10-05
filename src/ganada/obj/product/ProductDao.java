package ganada.obj.product;

import java.util.ArrayList;
import java.util.List;

import ganada.core.*;
import ganada.obj.product.Product;
import ganada.obj.product.ProductDao;

public class ProductDao extends DAO {
	private static ProductDao instance = new ProductDao();
	    
	    public static ProductDao getInstance() {
	        return instance;
	    }
	    
	    private ProductDao() {
	    }
	    private static DBTable t;
		@Override
		protected DBTable gT() {
	    	if (t == null) {
	    		t = new DBTable(null, "product", "pd_code", "PD_REG_DATE", "");
	    		t.setCls("ganada.obj.product.Product");
	    	}
			return t;
		}

		
		
		public List<Product> getInfoName() throws Exception {
			DB db = new DB();
			List<Product> productList = new ArrayList<Product>();
			try {
				String sql = "SELECT pd_code, menu_code, pd_name, pd_price, pd_reg_date,"
						+ " pif.pd_infoname as info1, pif2.pd_infoname as info2, pif3.pd_infoname as info3, pif4.pd_infoname as info4"
						+ " from PRODUCT p,"
						+ " PRODUCT_INFO pif,PRODUCT_INFO pif2,"
						+ " PRODUCT_INFO pif3,PRODUCT_INFO pif4"
						+ " WHERE pif.PD_INFOCODE=p.PD_INFOCODE1"
						+ " AND pif2.PD_INFOCODE=p.PD_INFOCODE2"
						+ " AND pif3.PD_INFOCODE=p.PD_INFOCODE3"
						+ " AND pif4.PD_INFOCODE=p.PD_INFOCODE4"
						+ " ORDER BY PD_REG_DATE DESC";
			    db.sql(sql).exe();
		    	while(db.next()){
			    	Product product = new Product();
			    	product.setPd_code(db.getString("pd_code"));
			    	product.setMenu_code(db.getString("menu_code"));
			    	product.setPd_name(db.getString("pd_name"));
			    	product.setPd_price(db.getInt("pd_price"));
			    	product.setPd_reg_date(db.getTimestamp("pd_reg_date"));
			    	product.setPd_infocode1(db.getString("info1"));
			    	product.setPd_infocode2(db.getString("info2"));
			    	product.setPd_infocode3(db.getString("info3"));
			    	product.setPd_infocode4(db.getString("info4"));
			    	productList.add(product);
			    	
				}
			} catch (Exception ex) {
			    ex.printStackTrace();
			} finally {
			    db.finalize();
			}
			return productList;
			//return select(pd_code, pd_code);
		    }

		
	
		 public int getCount() throws Exception {
			 return count();
		 }

}
