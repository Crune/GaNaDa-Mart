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

	public void insertArticle(ItemReview article) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int num = article.getNum();
		int ref = article.getRef();
		int re_step = article.getRe_step();
		int re_level = article.getRe_level();
		int number = 0;
		String sql = "";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select max(num) from review");
			rs = pstmt.executeQuery();

			if (rs.next()) {
				number = rs.getInt(1) + 1;
			} else {
				number = 1;
			}

			if (num != 0) {
				sql = "update review set re_step=re_step+1 where ref=? and re_step>?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, ref);
				pstmt.setInt(2, re_step);
				pstmt.executeUpdate();
				re_step = re_step + 1;
				re_level = re_level + 1;
			} else {
				ref = number;
				re_step = 0;
				re_level = 0;
			}

			sql = "insert into review(num,itemnum,itemname,writer,subject,"
					+ "lik,bad,siz,comfortable,wid,"
					+ "dura,itemsize,wei,hei,age,"
					+ "mail,content,star,passwd,readcount,"
					+ "ip,reg_date,REF,RE_STEP,RE_LEVEL) values(review_seq.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, article.getItemnum());
			pstmt.setString(2, article.getItemname());
			pstmt.setString(3, article.getWriter());
			pstmt.setString(4, article.getSubject());
			pstmt.setInt(5, article.getLik());
			pstmt.setInt(6, article.getBad());
			pstmt.setInt(7, article.getSiz());
			pstmt.setInt(8, article.getComfortable());
			pstmt.setInt(9, article.getWid());
			pstmt.setInt(10, article.getDura());
			pstmt.setString(11, article.getItemsize());
			pstmt.setString(12, article.getWei());
			pstmt.setString(13, article.getHei());
			pstmt.setString(14, article.getAge());
			pstmt.setString(15, article.getMail());
			pstmt.setString(16, article.getContent());
			pstmt.setInt(17, article.getStar());
			pstmt.setString(18, article.getPasswd());
			pstmt.setInt(19, article.getReadcount());
			pstmt.setString(20, article.getIp());
			pstmt.setTimestamp(21, article.getReg_date());
			pstmt.setInt(22, article.getRef());
			pstmt.setInt(23, article.getRe_step());
			pstmt.setInt(24, article.getRe_level());
			pstmt.executeUpdate();
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

	// 특정 상품에 대해 작성한 review의 수

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