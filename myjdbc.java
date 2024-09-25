import java.sql.*;
public class myjdbc {
	public static void main(String[] args) {
		try {
			//step 1
			//Drivermanager is a class in java.sql package
			//that is a static method, it has two arguments parts
			//url: jdbc:mysql://localhost:3306/dbname
			//user name and password : root Root@123
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3333/tybca?useSSL=false","root","Root@123");
			System.out.println("mysql connected upto TYBCA db");
			
			//step 2
			Statement stmt = con.createStatement();
			
			//step 3
			ResultSet rs = stmt.executeQuery("select * from student");
			
			//traverse the resultset
			while(rs.next()) {
				System.out.println(rs.getInt(1)+":"+rs.getString(2));
			}
			
			//closing connection
			con.close();
		}catch(Exception e) {System.out.println("error connecting db"+e);}
	}
}
