import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Bank {
	private int accountNo;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getCheqFacil() {
		return cheqFacil;
	}
	public void setCheqFacil(String cheqFacil) {
		this.cheqFacil = cheqFacil;
	}
	public String getAmountType() {
		return amountType;
	}
	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}
	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private int amount;
	private String cheqFacil;
	private String amountType;
	
	
	private Connection conn;
	private PreparedStatement pst;
	
	public String createBankAccount(Bank obj){
		
		conn=ConnectionHelper.getConnection();
		
		String cmd="insert into Employ values(?,?,?,?,?,?,?,?)";
		try {
			pst.setString(1, obj.getFirstName());
			pst.setString(2, obj.getLastName());
			pst.executeUpdate();
			return "Account Created";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		return e.getMessage();
		}
	}
	
	public ResultSet searchAccount(int accountNo){
		
		conn=ConnectionHelper.getConnection();
		String cmd="select * from Employ where AccountNo=?";
		try {
			pst=conn.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			ResultSet rs=pst.executeQuery();
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		return null;
		}
				
				
					
					
				
	}
	
}
