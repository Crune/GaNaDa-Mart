package xyz.core;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DB {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private int pstmtNum = 0;
	private boolean needReturn = false;

	public static String getEncSHA256(String txt) throws NoSuchAlgorithmException {
		StringBuffer sbuf = new StringBuffer();

		MessageDigest mDigest = MessageDigest.getInstance("SHA-256");
		mDigest.update(txt.getBytes());

		byte[] msgStr = mDigest.digest();

		for (int i = 0; i < msgStr.length; i++) {
			byte tmpStrByte = msgStr[i];
			String tmpEncTxt = Integer.toString((tmpStrByte & 0xff) + 0x100, 16).substring(1);

			sbuf.append(tmpEncTxt);
		}

		return sbuf.toString();
	}

	public static boolean isSame(String needEnc, String alreadyEnc) throws NoSuchAlgorithmException {
		if (needEnc != null && alreadyEnc != null) {
			return getEncSHA256(needEnc).equals(alreadyEnc);
		} else {
			return false;
		}
	}

	private static Connection getConnection() throws Exception {
		if (System.getProperty("RDS_HOSTNAME") != null) {
			Class.forName("oracle.jdbc.OracleDriver");
			String dbName = System.getProperty("RDS_DB_NAME");
			String userName = System.getProperty("RDS_USERNAME");
			String password = System.getProperty("RDS_PASSWORD");
			String hostname = System.getProperty("RDS_HOSTNAME");
			String port = System.getProperty("RDS_PORT");
			// String jdbcUrl = System.getenv("JDBC_CONNECTION_STRING");
			String jdbcUrl = "jdbc:oracle:thin:@" + hostname + ":" + port + ":" + dbName;
			Connection con = DriverManager.getConnection(jdbcUrl, userName, password);

			return con;
		} else {
			Context initCtx = new InitialContext();
			Context envCtx = (Context) initCtx.lookup("java:comp/env");
			DataSource ds = (DataSource) envCtx.lookup("jdbc/orcl");
			return ds.getConnection();
		}
	}

	public DB sql(String sql) throws Exception {
		if (conn == null)
			this.conn = getConnection();

		needReturn = sql.toUpperCase().startsWith("SELECT");
		System.out.println("SQL: " + sql);

		this.pstmt = conn.prepareStatement(sql);
		pstmtNum = 1;

		return this;
	}

	/**
	 * @param args
	 *            : VALUE / TABLE / WHERE / ORDER BY (DESC / ASC)
	 * @return SQL Statement for String Type
	 * @throws Exception
	 */
	public DB S(String... args) throws Exception {
		sql(gS(args));
		return this;

	}

	public static String gS(String... args) throws Exception {
		String query = "";
		if (args.length >= 2) {
			query = "SELECT " + args[0] + " FROM " + args[1];
			if (args.length >= 3)
				if (!args[2].isEmpty())
					query += " WHERE " + args[2];
			if (args.length >= 4)
				if (!args[3].isEmpty())
					query += " ORDER BY " + args[3];
		}
		return query;
	}

	/**
	 * @param args
	 *            : TABLE / WHERE
	 * @return SQL Statement for String Type
	 * @throws Exception
	 */
	public DB D(String... args) throws Exception {
		sql(gD(args));
		return this;

	}
	
	public static String gD(String... args) throws Exception {
		String query = "";
		if (args.length >= 1) {
			query = "DELETE FROM " + args[0];
			if (args.length >= 2)
				query += " WHERE " + args[1];
		}
		return query;
	}


	/**
	 * @param args
	 *            : TABLE / SET / WHERE
	 * @return SQL Statement for String Type
	 * @throws Exception
	 */
	public static String gU(String... args) throws Exception {
		String query = "";
		if (args.length >= 2) {
			query = "UPDATE " + args[0] + " SET " + args[1];
			if (args.length >= 3)
				query += " WHERE " + args[2];
		}
		return query;
	}
	
	/**
	 * @param args
	 *            : "TABLE(COLUMN)" / VALUE
	 * @return SQL Statement for String Type
	 * @throws Exception
	 */	
	public static String gI(String... args) throws Exception {
		String query = "";
		if (args.length >= 1) {
			query = "INSERT INTO " + args[0];
			if (args.length >= 2)
				query += " VALUES (" + args[1] + ")";
		}
		return query;
	}

	public DB var(String var) throws Exception {
		if (var.isEmpty())
			var = "null";
		this.pstmt.setString(pstmtNum++, var);
		return this;
	}

	public DB var(int var) throws Exception {
		this.pstmt.setInt(pstmtNum++, var);
		return this;
	}

	public DB var(double var) throws Exception {
		this.pstmt.setDouble(pstmtNum++, var);
		return this;
	}

	public DB var(boolean var) throws Exception {
		this.pstmt.setString(pstmtNum++, (var ? 'T' : 'F') + "");
		return this;
	}

	public DB var(Timestamp var) throws Exception {
		this.pstmt.setTimestamp(pstmtNum++, var);
		return this;
	}

	public DB var(Object var) throws Exception {
		if (var == null) {
			System.out.println("null 데이터 주입!");
			return this;
		}
		if (var.getClass() == java.lang.String.class)
			var((String) var);
		if (var.getClass() == java.lang.Integer.class)
			var((int) var);
		if (var.getClass() == java.lang.Double.class)
			var((double) var);
		if (var.getClass() == java.lang.Boolean.class)
			var((boolean) var);
		if (var.getClass() == java.sql.Timestamp.class)
			var((Timestamp) var);
		return this;
	}

	public ResultSet exe() throws Exception {
		if (!needReturn) {
			this.pstmt.executeUpdate();
		} else if (rs == null) {
			this.rs = pstmt.executeQuery();
		}
		return this.rs;
	}

	public Boolean next() throws Exception {
		return this.rs.next();
	}

	public String getString(String col) throws Exception {
		return exe().getString(col);
	}

	public Timestamp getTimestamp(String col) throws Exception {
		return exe().getTimestamp(col);
	}

	public int getInt(String col) throws Exception {
		return exe().getInt(col);
	}

	public int count(String table) throws Exception {
		S("COUNT(*)", table).exe();
		if (rs.next()) {
			return rs.getInt(1);
		}
		return 0;
	}

	public void finalize() {
		if (rs != null)
			try {
				rs.close();
			} catch (Exception e) {
			}
		if (pstmt != null)
			try {
				pstmt.close();
			} catch (Exception e) {
			}
		if (conn != null)
			try {
				conn.close();
			} catch (Exception e) {
			}
	}

	public class Update {
		private String target = "";
		private String where = null;
		private HashMap<String, Object> objVarMap = new HashMap<String, Object>();
		private HashMap<String, String> sqlVarMap = new HashMap<String, String>();
		private List<Object> setVarlist = new ArrayList<Object>();
		private List<Object> whereVarList = new ArrayList<Object>();

		@SuppressWarnings("unused")
		private Update() {
		}

		public Update(String target) {
			this.target = target;
		}

		public Update set(String key, Object value) {
			objVarMap.put(key, value);
			return this;
		}

		public Update setSql(String key, String value) {
			sqlVarMap.put(key, value);
			return this;
		}

		public Update setWhereCondition(String where) {
			this.where = where;
			return this;
		}

		public Update setWhere(Object obj) {
			whereVarList.add(obj);
			return this;
		}

		public Update setWhere(String key, Object value) {
			setWhereCondition(key + "=?");
			setWhere(value);
			return this;
		}

		public void run() throws Exception {
			if (!objVarMap.isEmpty() || !sqlVarMap.isEmpty()) {
				String sql = "UPDATE " + target + " SET ";

				int sqlCount = sqlVarMap.size();
				int objCount = objVarMap.size();

				boolean isNext = false;
				for (String key : sqlVarMap.keySet()) {
					isNext = (--sqlCount + objCount) > 0;
					String comma = isNext ? "," : "";
					sql += key + "=" + sqlVarMap.get(key) + comma;
				}
				for (String key : objVarMap.keySet()) {
					isNext = --objCount > 0;
					String comma = isNext ? "," : "";
					sql += key + "=?" + comma;
					setVarlist.add(objVarMap.get(key));
				}
				if (where == null)
					sql(sql);
				else
					sql(sql + " WHERE " + where);
				for (Object obj : setVarlist)
					var((Object) obj);
				for (Object obj : whereVarList)
					var((Object) obj);
				exe();
			}
		}
	}

	public class Insert {
		private String target = "";
		private HashMap<String, Object> objVarMap = new HashMap<String, Object>();
		private HashMap<String, String> sqlVarMap = new HashMap<String, String>();

		private List<Object> list = new ArrayList<Object>();

		@SuppressWarnings("unused")
		private Insert() {
		}

		public Insert(String target) {
			this.target = target;
		}

		public Insert in(String key, Object value) {
			objVarMap.put(key, value);
			return this;
		}

		public Insert inSql(String key, String value) {
			sqlVarMap.put(key, value);
			return this;
		}

		public void run() throws Exception {
			if (!objVarMap.isEmpty() || !sqlVarMap.isEmpty()) {
				String sql = "INSERT INTO " + target + "(";
				String val = ") VALUES (";

				int sqlCount = sqlVarMap.size();
				int objCount = objVarMap.size();

				boolean isNext = false;
				for (String key : sqlVarMap.keySet()) {
					isNext = (--sqlCount + objCount) > 0;
					String comma = isNext ? "," : "";
					sql += key + comma;
					val += sqlVarMap.get(key) + comma;
				}
				for (String key : objVarMap.keySet()) {
					isNext = --objCount > 0;
					String comma = isNext ? "," : "";
					sql += key + comma;
					val += "?" + comma;
					list.add(objVarMap.get(key));
				}
				sql(sql + val + ")");
				for (Object obj : list)
					var((Object) obj);
				exe();
			}
		}
	}

}