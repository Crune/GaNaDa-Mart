package ganada.obj.product;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import ganada.core.*;

import ganada.obj.product.Stock;
import ganada.obj.product.StockDao;

public class StockDao extends DAO {
private static StockDao instance = new StockDao();
    
    public static StockDao getInstance() {
        return instance;
    }
    
    private StockDao() {
    }

    private static DBTable t;
	@Override
	protected DBTable gT() {
    	if (t == null) {
    		t = new DBTable("stock", "sk_code");
    		t.setCls("ganada.obj.product.Stock");
    	}
		return t;
	}		
	
	/**
	 * @param pd_code 상품코드
	 * @return 상품코드로 조회한 색상별 재고
	 */
	public Map<String, Stock> mapColorStock(String pd_code) {
		DB db = new DB();
		Map<String, Stock> stockPerColor = new HashMap<String, Stock>(); 
		try {
				db.S("*","stock", "pd_code=?").var(pd_code).exe();
				while (db.next()) {
					Stock cur= new Stock();
                    for (Method m : t.setter()) {
                        Object value = cVO(m.getParameterTypes()[0], db.getString(cName(m)));
                        m.invoke(cur, value);
                    }
                    stockPerColor.put(cur.getC_code(), cur);
				}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.finalize();
		}
		return stockPerColor;
	}	
}
