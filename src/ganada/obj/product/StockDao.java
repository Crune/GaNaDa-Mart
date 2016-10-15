package ganada.obj.product;

import java.lang.reflect.Method;
import java.util.*;

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
    		t = new DBTable("stock", "SK_CODE");
    		t.setCls("ganada.obj.product.Stock");
    	}
		return t;
	}		
	
	/**
	 * @param pd_code 상품코드
	 * @return 상품코드로 조회한 색상별 재고
	 */
	public Map<String, List<Stock>> mapColorStock(String pd_code) {
		DB db = new DB();
		Map<String, List<Stock>> rst = new HashMap<String, List<Stock>>();
		List<Stock> allList = (List<Stock>) search("pd_code", pd_code);
		Set<String> stockList = new HashSet<String>();
		for (Stock cur : allList) {
			stockList.add(cur.getC_code());
		}
		for (String cur : stockList) {
			List<Stock> curList = new ArrayList<Stock>();
			for (Stock img : allList) {
				if (img.getC_code().equals(cur))
					curList.add(img);
			}
			rst.put(cur, curList);
		}
		return rst;
	}	
}
