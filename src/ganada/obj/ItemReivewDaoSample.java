package ganada.obj;

import ganada.core.*;

public class ItemReivewDaoSample {

    public void insert(ItemReview article) {
        DB db = new DB();
        DB.Insert in = db.new Insert("review");
        DB.Update up = db.new Update("review");

        int num = article.getNum();
        int ref = article.getRef();
        int re_step = article.getRe_step();
        int re_level = article.getRe_level();
        int number = 0;
        
        try {
            db.S("max(num)", "review").exe();

            if (db.next()) {
                number = db.exe().getInt(1) + 1;
            } else {
                number = 1;
            }

            if (num != 0) {
                up.setWhereCondition("ref=? and re_step>?").setWhere(ref).setWhere(re_step);
                up.setSql("re_step", "re_step+1").run();
                re_step = re_step + 1;
                re_level = re_level + 1;
            } else {
                ref = number;
                re_step = 0;
                re_level = 0;
            }        
            in.inSql("num", "review_seq.NEXTVAL");
            in.in("itemnum", article.getItemnum());
            in.in("", article.getItemnum());
            in.in("", article.getItemnum());
            in.in("", article.getItemnum());
            in.in("", article.getItemnum());
            in.in("", article.getItemnum());
            in.in("", article.getItemnum());
            in.in("", article.getItemnum());
            in.in("", article.getItemnum());
            in.in("", article.getItemnum());
            in.in("", article.getItemnum());
            in.in("", article.getItemnum());
            in.in("", article.getItemnum());
            in.in("", article.getItemnum());
            in.in("", article.getItemnum());
            in.inSql("REG_DATE", "sysdate");
            in.run();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.finalize();
        }
        
    }
}
