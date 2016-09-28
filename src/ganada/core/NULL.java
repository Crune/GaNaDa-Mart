package ganada.core;

public class NULL {

    @SuppressWarnings("finally")
    public static String toDQ(String checkStr) {
        try {
            if (checkStr == null) return "";
            else return checkStr;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return "";
        }
    }
    
    
    @SuppressWarnings("finally")
    public static Object R(Object obj, Object replace) {
        try {
            if (obj == null) return replace;
            else return obj;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return replace;
        }
    }
}
