package ganada.obj.product;

import org.json.simple.JSONObject;

public class ResultProduct {
    private  String price=""; // 본래가격
    private  String sale=""; // 할인가격
    private  String mark=""; // 
    private  String review="";

    
    @SuppressWarnings("unchecked")
    public JSONObject getJSONObject() {
        JSONObject logObj = new JSONObject();   
        { 
            logObj.put("price", price); 
            // 분기 한 후 수정함.
        }
        return logObj;        
    }
}
