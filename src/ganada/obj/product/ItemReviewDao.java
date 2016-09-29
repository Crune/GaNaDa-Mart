package ganada.obj.product;

import ganada.core.*;

import java.sql.Connection;
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
        //int ref = article.getRef();
       // int re_step = article.getRe_step();
        //int re_level = article.getRe_level();
        int number = 0;
        
        try {
            db.S("max(num)", "review").exe();

            if (db.next()) {
                number = db.exe().getInt(1) + 1;
            } else {
                number = 1;
            }

           // if (num != 0) {
             //   up.setWhereCondition("ref=? and re_step>?").setWhere(ref).setWhere(re_step);
             //   up.setSql("re_step", "re_step+1").run();
             //   re_step = re_step + 1;
              //  re_level = re_level + 1;
           // } else {
             //   ref = number;
             //   re_step = 0;
              //  re_level = 0;
           // }        
            in.inSql("num", "review_seq.NEXTVAL");
            in.in("itemnum", article.getItemnum());
            in.in("itemname", article.getItemname());
            in.in("writer", article.getWriter());
            in.in("subject", article.getSubject());
            in.in("siz", article.getSiz());
            in.in("comfortable", article.getComfortable());
            in.in("wid", article.getWid());
            in.in("dura", article.getDura());
            in.in("itemsize", article.getItemsize());
            in.in("wei", article.getWei());
            in.in("hei", article.getHei());
            in.in("age", article.getAge());
            in.in("content", article.getContent());
            in.in("star", article.getStar());
            in.inSql("REG_DATE", "sysdate");
            in.in("img", article.getImg());
            in.run();  
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.finalize();
        }
        
    }


	

	// 특정 상품번호로 review 
	 public List<ItemReview> getReview(String itemnum) throws Exception {
			DB db = new DB();
			List<ItemReview> reviewList = null;
			int x = 0;
			try {    
			    db.S("*", "REVIEW", "ITEMNUM=?","reg_date desc").var(itemnum).exe();
			    
			    if (db.next()) {
			    	reviewList = new ArrayList<ItemReview>();
			    	do{
			    		ItemReview review = new ItemReview();				
						review.setNum(db.getInt("num"));
						review.setItemnum(db.getString("itemnum"));
						review.setItemname(db.getString("itemname"));
						review.setWriter(db.getString("writer"));
						review.setSubject(db.getString("subject"));
						review.setSiz(db.getInt("siz"));
						review.setComfortable(db.getInt("comfortable"));
						review.setWid(db.getInt("wid"));
						review.setDura(db.getInt("dura"));
						review.setItemsize(db.getString("itemsize"));
						review.setWei(db.getString("wei"));
						review.setHei(db.getString("hei"));
						review.setAge(db.getString("age"));
						review.setContent(db.getString("content"));
						review.setStar(db.getInt("star"));
						review.setReadcount(db.getInt("readcount"));
						review.setReg_date(db.getTimestamp("reg_date"));
						review.setImg(db.getString("img"));
						
						reviewList.add(review);
			    	}while(db.next());
			    }
			} catch (Exception ex) {
			    ex.printStackTrace();
			} finally {
			    db.finalize();
			}
			return reviewList;
		   }
	 
	 //전체 등록수 카운트
	 public int getAllArticleCount()throws Exception{
		 DB db = new DB();
		 int x = 0;
		 try{
			 x= db.count("REVIEW");
		 }catch(Exception ex){
			 ex.printStackTrace();
		 }finally{
			 db.finalize();
		 }
		 return x;
	 }
	 
	 
	 //상품번호의 리뷰 카운트...
	public int getArticleCount(String itemnum) throws Exception {
		DB db = new DB();
		ItemReview review = null;
		int x = 0;
		if(itemnum == null){
			itemnum ="0";
		}
		int num = Integer.parseInt(itemnum);
		
		try {
			String sql="select count(*) from review where itemnum=?";
			if(db.sql(sql).var(num).exe().next()){
				x = db.exe().getInt(1);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			db.finalize();
		}
		return x;
	}
	
	
//특정 상품에 대해 작성한 리뷰를 지정한 수만큼 얻어냄
	public List<ItemReview> getArticles(String itemnum) throws Exception {

		DB db = new DB();
		List<ItemReview> articleList = null;

		try {
		//	if(itemnum.equals("")){
				db.S("*","review").exe();
				
			//}//else{
			//	db.S("*","review","where itemnum="+itemnum, "order by ref desc, re_step asc").var(itemnum).exe();
				
			//}
			//db.sql("select * from review where itemnum=" + itemnum + "order by ref desc, re_step asc").exe();
			
			if (db.next()) {
				articleList = new ArrayList<ItemReview>();
				do {
					ItemReview article = new ItemReview();
					article.setNum(db.getInt("num"));
					article.setItemnum(db.getString("itemnum"));
					article.setItemname(db.getString("itemname"));
					article.setWriter(db.getString("writer"));
					article.setSubject(db.getString("subject"));
					article.setSiz(db.getInt("siz"));
					article.setComfortable(db.getInt("comfortable"));
					article.setWid(db.getInt("wid"));
					article.setDura(db.getInt("dura"));
					article.setItemsize(db.getString("itemsize"));
					article.setWei(db.getString("wei"));
					article.setHei(db.getString("hei"));
					article.setAge(db.getString("age"));
					article.setContent(db.getString("content"));
					article.setStar(db.getInt("star"));
					article.setReadcount(db.getInt("readcount"));
					article.setReg_date(db.getTimestamp("reg_date"));
				

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
public ItemReview getMember(String itemnum)throws Exception {
	
DB db = new DB();
ItemReview member = null;
try{
	db.S("*","REVIEW","itemnum=?").var(itemnum).exe();
	
	if(db.next()){
		member = new ItemReview();
		member.setNum(db.getInt("num"));
		member.setItemnum(db.getString("itemnum"));
		member.setItemname(db.getString("itemname"));
		member.setWriter(db.getString("writer"));
		member.setSubject(db.getString("subject"));
		member.setSiz(db.getInt("siz"));
		member.setComfortable(db.getInt("comfortable"));
		member.setWid(db.getInt("wid"));
		member.setDura(db.getInt("dura"));
		member.setItemsize(db.getString("itemsize"));
		member.setWei(db.getString("wei"));
		member.setHei(db.getString("hei"));
		member.setAge(db.getString("age"));
		member.setContent(db.getString("content"));
		member.setStar(db.getInt("star"));
		member.setReadcount(db.getInt("readcount"));
		member.setReg_date(db.getTimestamp("reg_date"));
	}
	}catch(Exception ex){
		ex.printStackTrace();
	}finally {
		db.finalize();
}
return member;

}

	public int deleteArticle(int num) {
		DB db = new DB();
		int x = -1;
		try {
			db.D("REVIEW", "num=?").var(num).exe();
			x = 1;
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			db.finalize();
		}
		return x;
	}

}