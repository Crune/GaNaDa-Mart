package ganada.obj.product;

import org.json.simple.JSONObject;

public class ResultProduct {
    private  String price="";

    
    @SuppressWarnings("unchecked")
    public JSONObject getJSONObject() {
        JSONObject logObj = new JSONObject();   
        { 
            logObj.put("price", price); 
        }
        return logObj;        
    }
}
