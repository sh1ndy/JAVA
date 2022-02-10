import java.sql.Connection;
import java.sql.DriverManager;

public class MyDriver {
	Connection conn;
	MyDriverInfo mdInfo = new MyDriverInfo();
	
	public Connection getDriver() {
		
		try {
			Class.forName(mdInfo.getDriver());
			conn = DriverManager.getConnection(mdInfo.getUrl(), mdInfo.getUserName(), mdInfo.getPassword());
			System.out.println("����̹� ���� �Ϸ�!");
		} catch (Exception e) {
			System.out.println("����̹� ���� ����!");
			e.printStackTrace();
		}
		
		return conn;
	}

}
