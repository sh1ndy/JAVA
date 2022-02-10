import java.sql.Connection;
import java.sql.DriverManager;

public class MyDriver {
	Connection conn;
	MyDriverInfo mdInfo = new MyDriverInfo();
	
	public Connection getDriver() {
		
		try {
			Class.forName(mdInfo.getDriver());
			conn = DriverManager.getConnection(mdInfo.getUrl(), mdInfo.getUserName(), mdInfo.getPassword());
			System.out.println("드라이버 연결 완료!");
		} catch (Exception e) {
			System.out.println("드라이버 연결 실패!");
			e.printStackTrace();
		}
		
		return conn;
	}

}
