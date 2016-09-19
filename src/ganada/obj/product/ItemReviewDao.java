package ganada.obj.product;

import ganada.core.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import ganada.core.DB;
import ganada.core.DB.Insert;
import ganada.core.DB.Update;

public class ItemReviewDao {

	private static ItemReviewDao instance = new ItemReviewDao();

	public static ItemReviewDao getInstance() {
		return instance;
	}

	private ItemReviewDao() {
	}

	

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
            in.in("itemname", article.getItemname());
            in.in("writer", article.getWriter());
            in.in("subject", article.getSubject());
            in.in("lik",article.getLik());
            in.in("bad", article.getBad());
            in.in("siz", article.getSiz());
            in.in("comfortable", article.getComfortable());
            in.in("wid", article.getWid());
            in.in("dura", article.getDura());
            in.in("itemsize", article.getItemsize());
            in.in("wei", article.getWei());
            in.in("hei", article.getHei());
            in.in("age", article.getAge());
            in.in("mail", article.getMail());
            in.in("content", article.getContent());
            in.in("star", article.getStar());
            in.in("passwd", article.getPasswd());
            in.in("readcount", article.getReadcount());
            in.in("ip", article.getIp());
            in.in("ref", article.getRef());
            in.in("re_step", article.getRe_step());
            in.in("re_level", article.getRe_level());
            in.inSql("REG_DATE", "sysdate");
            in.run();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.finalize();
        }
        
    }


	

	// 특정 상품번호로 review 
	 public ItemReview getReview(int itemnum) throws Exception {
			DB db = new DB();
			ItemReview review = null;
			int x = 0;
			try {
			    db.S("*", "REVIEW", "ITEMNUM=?").var(itemnum).exe();
			    if (db.next()) {
				review = new ItemReview();
				review.setNum(db.getInt("num"));
				review.setItemnum(db.getInt("itemnum"));
				review.setItemname(db.getString("itemname"));
				review.setWriter(db.getString("writer"));
				review.setSubject(db.getString("subject"));
				review.setLik(db.getInt("lik"));
				review.setBad(db.getInt("bad"));
				review.setSiz(db.getInt("siz"));
				review.setComfortable(db.getInt("comfortable"));
				review.setWid(db.getInt("wid"));
				review.setDura(db.getInt("dura"));
				review.setItemsize(db.getString("itemsize"));
				review.setWei(db.getString("wei"));
				review.setHei(db.getString("hei"));
				review.setAge(db.getString("age"));
				review.setMail(db.getString("mail"));
				review.setContent(db.getString("content"));
				review.setStar(db.getInt("star"));
				review.setPasswd(db.getString("passwd"));
				review.setReadcount(db.getInt("readcount"));
				review.setIp(db.getString("ip"));
				review.setReg_date(db.getTimestamp("reg_date"));
				review.setRef(db.getInt("ref"));
				review.setRe_step(db.getInt("re_step"));
				review.setRe_level(db.getInt("re_level"));
			    }
			} catch (Exception ex) {
			    ex.printStackTrace();
			} finally {
			    db.finalize();
			}
			return review;
		    }
	 //상품번호의 리뷰 카운트...
	public int getArticleCount(int itemnum) throws Exception {
		DB db = new DB();
		ItemReview review = null;
		int x = 0;

		try {
			db.S("count(*)", "REVIEW", "ITEMNUM=").var(itemnum).exe();

			if (db.next())
				x = db.getInt("1");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			db.finalize();
		}
		return x;
	}
//특정 상품에 대해 작성한 리뷰를 지정한 수만큼 얻어냄
	public List<ItemReview> getArticles(int count, int itemnum) throws Exception {

		DB db = new DB();
		List<ItemReview> articleList = null;

		try {
			//db.sql("select * from review where itemnum=" + itemnum + "order by ref desc, re_step asc").exe();
			db.S("*","review","where itemnum="+itemnum, "order by ref desc, re_step asc").exe();
			if (db.next()) {
				articleList = new ArrayList<ItemReview>(count);
				do {
					ItemReview article = new ItemReview();
					article.setNum(db.getInt("num"));
					article.setItemnum(db.getInt("itemnum"));
					article.setItemname(db.getString("itemname"));
					article.setWriter(db.getString("writer"));
					article.setSubject(db.getString("subject"));
					article.setLik(db.getInt("lik"));
					article.setBad(db.getInt("bad"));
					article.setSiz(db.getInt("siz"));
					article.setComfortable(db.getInt("comfortable"));
					article.setWid(db.getInt("wid"));
					article.setDura(db.getInt("dura"));
					article.setItemsize(db.getString("itemsize"));
					article.setWei(db.getString("wei"));
					article.setHei(db.getString("hei"));
					article.setAge(db.getString("age"));
					article.setMail(db.getString("mail"));
					article.setContent(db.getString("content"));
					article.setStar(db.getInt("star"));
					article.setPasswd(db.getString("passwd"));
					article.setReadcount(db.getInt("readcount"));
					article.setIp(db.getString("ip"));
					article.setReg_date(db.getTimestamp("reg_date"));
					article.setRef(db.getInt("ref"));
					article.setRe_step(db.getInt("re_step"));
					article.setRe_level(db.getInt("re_level"));

					articleList.add(article);
				} while (db.next());

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			db.finalize();
		}
		return articleList;
	}

	//nike엔 수정이 없음...



	public int deleteArticle(int num) {
		DB db = new DB();
		int x = -1;
		try {
			db.D("REVIEW", "NUM=?").var(num).exe();
			x = 1;
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			db.finalize();
		}
		return x;
	}

}