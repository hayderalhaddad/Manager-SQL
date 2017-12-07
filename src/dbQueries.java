import java.sql.*;
import java.util.ArrayList;
import java.io.*;

public class dbQueries {
//add username password
	static String url = "jdbc:oracle:thin:@apollo.vse.gmu.edu:1521:ite10g";
	private Connection connect;
	
	public dbQueries() {
	}
	
	public void connect() throws SQLException, IOException {
		try {
			System.out.println(username);
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException x) {
			System.out.println("Driver could not be loaded");

		}
		connect = DriverManager.getConnection(url, username, password);
	}

	public boolean mgrLogin(String Ssn) throws SQLException {
		String q = "select Fname from EMPLOYEE where ssn= ?";
		PreparedStatement req = connect.prepareStatement(q);
		req.setString(1, Ssn);
		ResultSet result = req.executeQuery();
		while (result.next()) {
			if (result.getString(1) != null) {
				System.out.println("here is result" + result.getString(1));
				return true;

			} else {
				return false;
			}
		}
		return false;
	}

	public String[] addEmployee(String[] val) throws SQLException {
		String q = "INSERT INTO employee (fname,minit,lname,ssn,bdate,address,sex,salary,superssn,dno) VALUES (?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement req = connect.prepareStatement(q);
		for (int i = 0; i < val.length; i++) {
           System.out.println(val[i] + "\n");
			if ((i == 7 || i == 9) && !(val[i].equals(""))) {
				System.out.println("here" + Integer.parseInt(val[i]));
				req.setInt(i + 1, Integer.parseInt(val[i]));

			} else {
				req.setString(i + 1, val[i]);

			}
		}
		ResultSet result = req.executeQuery();
		return val;
	}

	public String[] addProject(ArrayList<Integer> hrs, ArrayList<String> projects, String Ssn) throws SQLException {
		String q = "INSERT INTO works_on (essn,pno,hours) VALUES (?,?,?)";
		PreparedStatement req = connect.prepareStatement(q);
		for (int i = 0; i < hrs.size(); i++) {
			req.setString(1, Ssn);
			req.setString(2, projects.get(i));
			req.setString(3, hrs.get(i).toString());
			ResultSet result = req.executeQuery();

		}
		String[] f = new String[] { "1" };
		return f;
	}
	
	public String[] addDependent(String[] val) throws SQLException {
		String q = "INSERT INTO dependent (essn,dependent_name,sex,bdate,relationship) VALUES (?,?,?,?,?)";
		PreparedStatement req = connect.prepareStatement(q);
		for (int i = 0; i < val.length; i++) {
			req.setString(i + 1, val[i]);
			
		}
		ResultSet result = req.executeQuery();
		return val;
	}
}
