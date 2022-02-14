package employeeEx;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DB {
	public static Connection dbConn() {
		Connection conn = null;
		try {
			FileInputStream fis = new FileInputStream("C:\\Help_JAVA\\java_mysql\\db.prop");
			Properties prop = new Properties();
			prop.load(fis);
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String id = prop.getProperty("id");
			String password= prop.getProperty("password");
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
