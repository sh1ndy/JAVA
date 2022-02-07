import java.sql.Connection;
import java.sql.DriverManager;

public class Customer {
	public static void main(String[] args) {
		getConnection();
	}
	
	public static Connection getConnection() {
		// try-catch�� ����̹� ����
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306";
			String user = "root";
			String pass = "root";
			
			// driver �ε�
			Class.forName(driver);
			
			// MySQL ����
			Connection conn = DriverManager.getConnection(url, user, pass);
			System.out.println("���� �Ϸ�");
			return conn;
		} catch (Exception e) {
			System.out.println("���� �ȵ�");
			return null;
		}
	}

}
