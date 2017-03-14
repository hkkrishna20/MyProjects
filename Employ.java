package org.me.emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EmployServ {

	public Employ searchEmploy(int empno){
		return new Employ().searchEmploy(empno);
	}
}
public class Employ {

	private int empno;
	private String name;
	private String dept;
	private String desig;
	private int basic;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	
	
	public Employ searchEmploy(int empno){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
					"scott","tiger");
			String cmd="select * from Employ1 where empno=?";
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1,empno);
			ResultSet rs=pst.executeQuery();
			Employ e;
			if(rs.next()){
				 e=new Employ();
				e.setName(rs.getString("Name"));
				e.setDept(rs.getString("Dept"));
				e.setDesig(rs.getString("Desig"));
				e.setBasic(rs.getInt("basic"));
			}
			else {
				e=new Employ();
				e.setName("Not Found");
				e.setDept("Not Found");
				e.setDesig("Not FOund");
				e.setBasic(0);
			}
			return e;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
}