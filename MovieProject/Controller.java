package movieProject;

import java.sql.Connection;
import java.sql.DriverManager;

public class Controller {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/movie_db";
	private static final String ID = "root";
	private static final String PASSWORD = "root";
	
	public static Connection dbConn() {
		Connection conn = null;
		
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, ID, PASSWORD);
			System.out.println("드라이버 연결 성공!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
}
