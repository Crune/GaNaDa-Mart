package ganada.obj;

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

	private Connection getConnection() throws Exception {
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource) envCtx.lookup("jdbc/orcl");
		return ds.getConnection();
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


	// review에 저장된 전체 글의 수
	public int getArticleCount() throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int x = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select count(*) from review");
			rs = pstmt.executeQuery();

			if (rs.next())
				x = rs.getInt(1);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ex) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ex) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException ex) {
				}
		}
		return x;
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
	public int getArticleCount(int itemnum) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int x = 0;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select count(*) from review where itemnum=" + itemnum);

			rs = pstmt.executeQuery();

			if (rs.next())
				x = rs.getInt(1);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ex) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ex) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException ex) {
				}
		}
		return x;
	}

	public List<ItemReview> getArticles(int count) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<ItemReview> articleList = null;
		try {
			conn = getConnection();

			pstmt = conn.prepareStatement("select * from review order by ref desc, re_step asc");
			rs = pstmt.executeQuery();

			if (rs.next()) {
				articleList = new ArrayList<ItemReview>(count);
				do {
					ItemReview article = new ItemReview();
					article.setNum(rs.getInt("num"));
					article.setItemnum(rs.getInt("itemnum"));
					article.setItemname(rs.getString("itemname"));
					article.setWriter(rs.getString("writer"));
					article.setSubject(rs.getString("subject"));
					article.setLik(rs.getInt("lik"));
					article.setBad(rs.getInt("bad"));
					article.setSiz(rs.getInt("siz"));
					article.setComfortable(rs.getInt("comfortable"));
					article.setWid(rs.getInt("wid"));
					article.setDura(rs.getInt("dura"));
					article.setItemsize(rs.getString("itemsize"));
					article.setWei(rs.getString("wei"));
					article.setHei(rs.getString("hei"));
					article.setAge(rs.getString("age"));
					article.setMail(rs.getString("mail"));
					article.setContent(rs.getString("content"));
					article.setStar(rs.getInt("star"));
					article.setPasswd(rs.getString("passwd"));
					article.setReadcount(rs.getInt("readcount"));
					article.setIp(rs.getString("ip"));
					article.setReg_date(rs.getTimestamp("reg_date"));
					article.setRef(rs.getInt("ref"));
					article.setRe_step(rs.getInt("re_step"));
					article.setRe_level(rs.getInt("re_level"));

					articleList.add(article);
				} while (rs.next());

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ex) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ex) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException ex) {
				}
		}
		return articleList;
	}

	public List<ItemReview> getArticles(int count, int itemnum) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<ItemReview> articleList = null;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(
					"select * from review where itemnum=" + itemnum + "order by ref desc, re_step asc");
			rs = pstmt.executeQuery();

			if (rs.next()) {
				articleList = new ArrayList<ItemReview>(count);
				do {
					ItemReview article = new ItemReview();
					article.setNum(rs.getInt("num"));
					article.setItemnum(rs.getInt("itemnum"));
					article.setItemname(rs.getString("itemname"));
					article.setWriter(rs.getString("writer"));
					article.setSubject(rs.getString("subject"));
					article.setLik(rs.getInt("lik"));
					article.setBad(rs.getInt("bad"));
					article.setSiz(rs.getInt("siz"));
					article.setComfortable(rs.getInt("comfortable"));
					article.setWid(rs.getInt("wid"));
					article.setDura(rs.getInt("dura"));
					article.setItemsize(rs.getString("itemsize"));
					article.setWei(rs.getString("wei"));
					article.setHei(rs.getString("hei"));
					article.setAge(rs.getString("age"));
					article.setMail(rs.getString("mail"));
					article.setContent(rs.getString("content"));
					article.setStar(rs.getInt("star"));
					article.setPasswd(rs.getString("passwd"));
					article.setReadcount(rs.getInt("readcount"));
					article.setIp(rs.getString("ip"));
					article.setReg_date(rs.getTimestamp("reg_date"));
					article.setRef(rs.getInt("ref"));
					article.setRe_step(rs.getInt("re_step"));
					article.setRe_level(rs.getInt("re_level"));

					articleList.add(article);
				} while (rs.next());

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ex) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ex) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException ex) {
				}
		}
		return articleList;
	}

	public ItemReview updateGetArticle(int num) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ItemReview article = null;
		try {
			conn = getConnection();

			pstmt = conn.prepareStatement("select * from review where num = ?");
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				article = new ItemReview();
				article.setNum(rs.getInt("num"));
				article.setItemnum(rs.getInt("itemnum"));
				article.setItemname(rs.getString("itemname"));
				article.setWriter(rs.getString("writer"));
				article.setSubject(rs.getString("subject"));
				article.setLik(rs.getInt("lik"));
				article.setBad(rs.getInt("bad"));
				article.setSiz(rs.getInt("siz"));
				article.setComfortable(rs.getInt("comfortable"));
				article.setWid(rs.getInt("wid"));
				article.setDura(rs.getInt("dura"));
				article.setItemsize(rs.getString("itemsize"));
				article.setWei(rs.getString("wei"));
				article.setHei(rs.getString("hei"));
				article.setAge(rs.getString("age"));
				article.setMail(rs.getString("mail"));
				article.setContent(rs.getString("content"));
				article.setStar(rs.getInt("star"));
				article.setPasswd(rs.getString("passwd"));
				article.setReadcount(rs.getInt("readcount"));
				article.setIp(rs.getString("ip"));
				article.setReg_date(rs.getTimestamp("reg_date"));
				article.setRef(rs.getInt("ref"));
				article.setRe_step(rs.getInt("re_step"));
				article.setRe_level(rs.getInt("re_level"));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ex) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ex) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException ex) {
				}
		}
		return article;
	}

	public int updateArticle(ItemReview article) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String dbpasswd = "";
		String sql = "";
		int x = -1;
		try {
			conn = getConnection();
			sql = "select passwd from review where num = ?";
			pstmt.setInt(1, article.getNum());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				dbpasswd = rs.getString("passwd");
				if (dbpasswd.equals(article.getPasswd())) {
					sql = "update review set content=? where num=?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, article.getContent());
					pstmt.setInt(2, article.getNum());
					pstmt.executeUpdate();
					x = 1;
				} else {
					x = 0;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ex) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ex) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException ex) {
				}
		}
		return x;
	}

	public int deleteArticle(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int x = -1;
		try {
			conn = getConnection();

			pstmt = conn.prepareStatement("delete from review where num=?");
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			x = 1;
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ex) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ex) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException ex) {
				}
		}
		return x;
	}

}