package ganada.core;

public class NULL {

    public static String toDQ(String checkStr) {
        if (checkStr == null) return "";
        else return checkStr;
    }
    
    
    public static Object R(Object obj, Object replace) {
        if (obj == null) return replace;
        else return obj;
    }
}
