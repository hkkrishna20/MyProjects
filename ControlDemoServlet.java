import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CtrlDemoServlet
 */
public class CtrlDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CtrlDemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String compType=request.getParameter("h1");
		String Desc=request.getParameter("CompDesc");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
			PreparedStatement pst=con.prepareStatement("insert into  CRegister1(Cid,Complaint_Type,Complaint_Desc)"
					+ " values(?,?,?)");
			IdGen id=new IdGen();
			int cid=id.generateCompNo();
			pst.setInt(1, cid);
			pst.setString(2, compType);
			pst.setString(3, Desc);
			pst.executeUpdate();
			out.println("Record Inserted");
		
		}
		catch(SQLException | ClassNotFoundException e){
			
			e.printStackTrace();
		}
		
	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

