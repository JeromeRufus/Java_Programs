package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc_connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection obj = DriverManager.getConnection("jdbc:mysql://localhost/demo", "root", "");
			System.out.println("Connected");
			Statement st = obj.createStatement();
			st.execute("insert into login(name,password)values('Jerome','rufus')");
			System.out.println("inserted");

			ResultSet rs = st.executeQuery("select * from login");
			while (rs.next()) {
				System.out.println(rs.getString("name"));
			}
			//st.executeUpdate("update login set name ='Rufus'   where id = 1 ");
			//System.out.println("Updated");
			//st.executeUpdate("delete from login ");
			//System.out.println("Deleted");
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
