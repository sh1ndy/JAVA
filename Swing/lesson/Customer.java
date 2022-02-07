import java.sql.Connection;
import java.sql.DriverManager;

public class Customer {
	public static void main(String[] args) {
		getConnection();
	}
	
	public static Connection getConnection() {
		// try-catch로 드라이버 연결
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306";
			String user = "root";
			String pass = "root";
			
			// driver 로딩
			Class.forName(driver);
			
			// MySQL 연결
			Connection conn = DriverManager.getConnection(url, user, pass);
			System.out.println("연결 완료");
			return conn;
		} catch (Exception e) {
			System.out.println("연결 안됨");
			return null;
		}
	}

}
