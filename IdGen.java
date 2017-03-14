import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IdGen {
	private Connection conn;
	private PreparedStatement pst;
	public int generateCompNo(){
		conn=ConnectionHelper.getConnection();
	String cmd="select CASE when Max(Cid) is NULL then 1 "
					+ "else max(Cid)+1 end accno from CRegister";	
	try {
		PreparedStatement pst=conn.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		rs.next();
		
		int idGenno=rs.getInt("Cid");
		

	return idGenno;
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	return 0;
	}	
		
	}
}