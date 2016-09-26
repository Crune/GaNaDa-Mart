package ganada.obj.product;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<Stock> getStockList(String pd_code, String c_code) throws Exception {	//list화면에 시작부터 끝줄까지 전부 화면에 출력하기위해 db의값을 dto에저장
		DB db = new DB();
		List<Stock> articleList = null;
		try {
				db.S("*","stock", "pd_code=? and c_code=?").var(pd_code).var(c_code).exe();
				if (db.next()) {
						articleList = new ArrayList<Stock>(); 
						while(db.next()){ 			//결과가 있어야 이 메서드가 실행되기 때문에 do로 사용해도 에러가 나지 않는다
							Stock article= new Stock();
							article.setPd_code(db.getString("sk_code"));
							article.setPd_code(db.getString("st_code"));
							article.setPd_code(db.getString("c_code"));
							article.setPd_code(db.getString("pd_size"));
							article.setPd_code(db.getString("amount"));
							article.setPd_code(db.getString("pd_code"));
							articleList.add(article); 
						}
					}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			db.finalize();
		}
		return articleList;
	}	
}
