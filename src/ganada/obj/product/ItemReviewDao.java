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
        DB.Insert in = db.new Insert("PRODUCT_REVIEW");
        DB.Update up = db.new Update("PRODUCT_REVIEW");

        int num = article.getNum();
        //int ref = article.getRef();
       // int re_step = article.getRe_step();
        //int re_level = article.getRe_level();
        int number = 0;
        
        try {
            db.S("max(num)", "PRODUCT_REVIEW").exe();

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
            in.in("pd_code", article.getPd_code());
            in.in("pd_name", article.getPd_name());
            in.in("ac_code", article.getAc_code());
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
            in.in("vote_up", article.getVote_up());
            in.in("vote_down", article.getVote_down());
            in.run();  
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.finalize();
        }
        
    }


	

	// 특정 상품번호로 review 
	 public List<ItemReview> getReview(String pd_code) throws Exception {
			DB db = new DB();
			List<ItemReview> reviewList = null;
			int x = 0;
			try {    
			    db.S("*", "PRODUCT_REVIEW", "PD_CODE=?","reg_date desc").var(pd_code).exe();
			    
			    if (db.next()) {
			    	reviewList = new ArrayList<ItemReview>();
			    	do{
			    		ItemReview review = new ItemReview();				
						review.setNum(db.getInt("num"));
						review.setPd_code(db.getString("pd_code"));
						review.setPd_name(db.getString("pd_name"));
						review.setAc_code(db.getString("ac_code"));
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
						review.setReg_date(db.getTimestamp("reg_date"));
						review.setImg(db.getString("img"));
						review.setVote_up(db.getInt("vote_up"));
						review.setVote_down(db.getInt("vote_down"));
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
			 x= db.count("PRODUCT_REVIEW");
		 }catch(Exception ex){
			 ex.printStackTrace();
		 }finally{
			 db.finalize();
		 }
		 return x;
	 }
	 
	 
	 //상품번호의 리뷰 카운트...
	public int getArticleCount(String pd_code) throws Exception {
		DB db = new DB();
		ItemReview review = null;
		int x = 0;
		if(pd_code == null){
			pd_code ="0";
		}
		
		int num = Integer.parseInt(pd_code);
		
		try {
			String sql="select count(*) from PRODUCT_REVIEW where pd_code=?";
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
	public List<ItemReview> getArticles(String pd_code) throws Exception {

		DB db = new DB();
		List<ItemReview> articleList = null;

		try {
		//	if(itemnum.equals("")){
				db.S("*","PRODUCT_REVIEW").exe();
				
			//}//else{
			//	db.S("*","review","where itemnum="+itemnum, "order by ref desc, re_step asc").var(itemnum).exe();
				
			//}
			//db.sql("select * from review where itemnum=" + itemnum + "order by ref desc, re_step asc").exe();
			
			if (db.next()) {
				articleList = new ArrayList<ItemReview>();
				do {
					ItemReview article = new ItemReview();
					article.setNum(db.getInt("num"));
					article.setPd_code(db.getString("pd_code"));
					article.setPd_name(db.getString("pd_name"));
					article.setAc_code(db.getString("ac_code"));
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
		member.setPd_code(db.getString("pd_code"));
		member.setPd_name(db.getString("pd_name"));
		member.setAc_code(db.getString("ac_code"));
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
			db.D("PRODUCT_REVIEW", "num=?").var(num).exe();
			x = 1;
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			db.finalize();
		}
		return x;
	}

}