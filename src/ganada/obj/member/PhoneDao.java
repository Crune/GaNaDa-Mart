package ganada.obj.member;

import ganada.core.DB;

public class PhoneDao {

    private static PhoneDao instance = new PhoneDao();
    public static PhoneDao getInstance() {
        return instance;
    }
    private PhoneDao() {
    }

    public void insertPhone(Phone phone) throws Exception {
        DB db = new DB();
        DB.Insert sql = db.new Insert("PHONE");
        try {
            sql.inSql("CODE", "PHONE_SEQ.NEXTVAL");
            sql.in("NATION", phone.getNation());
            sql.in("NUM1", phone.getNum1());
            sql.in("NUM2", phone.getNum2());
            sql.in("NUM3", phone.getNum3());
            sql.in("INFO", phone.getInfo());
            sql.run();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.finalize();
        }
    }

    public Phone getPhone(String code) throws Exception {
        DB db = new DB();
        Phone phone = null;
        try {
            db.S("*", "PHONE", "CODE=?").var(code).exe();
            if (db.next()) {
                phone = new Phone();
                phone.setCode(db.getString("CODE"));
                phone.setNation(db.getString("NATION"));
                phone.setNum1(db.getString("NUM1"));
                phone.setNum2(db.getString("NUM2"));
                phone.setNum3(db.getString("NUM3"));
                phone.setInfo(db.getString("INFO"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            db.finalize();
        }
        return phone;
    }

    public void updatePhone(Phone phone) throws Exception {
        DB db = new DB();
        DB.Update sql = db.new Update("PHONE");
        try {
            sql.setWhere("CODE", phone.getCode());
            sql.set("NATION", phone.getNation());
            sql.set("NUM1", phone.getNum1());
            sql.set("NUM2", phone.getNum2());
            sql.set("NUM3", phone.getNum3());
            sql.set("INFO", phone.getInfo());
            sql.run();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            db.finalize();
        }
    }

    public int deletePhone(String code) throws Exception {
        DB db = new DB();
        int x = -1;
        try {
            db.D("PHONE", "CODE=?").var(code).exe();
            x = 1;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.finalize();
        }
        return x;
    }
}
