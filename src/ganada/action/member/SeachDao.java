package ganada.action.member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class SeachDao {
	private Connection conn;
	
	public SearchDao(Connection conn){

		

		this.conn = conn;
		
	}

	public String searchId(String Name, String phone)throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet re= null;
		try{
			pstmt = conn.prepareStatement()
					"select userId from LOGIN " +
					"where userName = ? and userPhone = ?");
					  pstmt.setString(1, Name);

				       pstmt.setString(2, Phone);

				    rs = pstmt.executeQuery();

				             if( rs.next() )

				               return (rs.getString("userId"));

				              else

				                 return null;

				   } finally {

				    if(rs!=null)try { rs.close(); } catch(SQLException ex) {}

				    if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}

				   }




				   

				  }

				     public String searchPwd(String Id, String Phone) throws SQLException {

				      PreparedStatement pstmt = null;

				         ResultSet rs = null;

				   try {

				    pstmt = conn.prepareStatement( 

				      "select userPwd from LOGIN " +

				      "where userId = ? and userPhone = ? ");

				    pstmt.setString(1, Id);

				       pstmt.setString(2, Phone);

				    rs = pstmt.executeQuery();

				             if( rs.next() )

				               return (rs.getString("userPwd"));

				              else

				                 return null;

				   } finally {

				    if(rs!=null)try { rs.close(); } catch(SQLException ex) {}

				    if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}

				   }




				  }




				}


			