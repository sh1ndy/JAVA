package ch13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Main {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\FAST_JAVA\\Chapter03\\src\\ch13\\db.prop");
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		UserInfo u = new UserInfo("no-name", "company", "1a2a3a4a");
		
		UserInfoDao userInfoDao = null;
		
		if (dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMysqlDao();
			userInfoDao.insert(u);
			userInfoDao.update(u);
			userInfoDao.delete(u);
		} else if (dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
			userInfoDao.insert(u);
			userInfoDao.update(u);
			userInfoDao.delete(u);
		} else {
			System.out.println("db Error");
		}
		
		
	}

}
