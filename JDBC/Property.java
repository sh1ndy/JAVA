package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Property {
	public static void main(String[] args) throws IOException {
		// ConnectEx ����� ���ȼ� ������ Property ����� ����
		// ���Ṯ�ڿ�
		// jdbc:mysql://localhost:��Ʈ/�����ͺ��̽�
		Connection conn = null; // db�� ���Ӵ�� �ϴ� ��ü
		Statement stmt = null; // sql ��ɾ ���� ���ִ� ��ü
		ResultSet rs = null; // select ��ɾ ���� ���ִ� ��ü

		try { // ���� ó�� �ʼ�
			FileInputStream fis = new FileInputStream("C:/Help_JAVA/java_mysql/db.prop");
			Properties prop = new Properties();
			prop.load(fis);
			String driver = prop.getProperty("driver"); // getProperty(key) ���� ��
			String url = prop.getProperty("url");
			String id = prop.getProperty("id");
			String password = prop.getProperty("password");
			// mysql ����̹� �ε�
			Class.forName(driver);
			// db�� ����
			conn = DriverManager.getConnection(url, id, password);
			String sql = "select * from books"; // sql ��ɾ�
			stmt = conn.createStatement(); // sql ���� ��ü
			rs = stmt.executeQuery(sql); // ����, ������� �����ּҸ� rs�� ����

			while (rs.next()) { // ���ڵ� 1���� ����, ������ ������ true, ������ false
				// �����.get�ڷ���("�ʵ��")
				int book_code = rs.getInt("book_code");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String year = rs.getString("year");
				int price = rs.getInt("price");

				System.out.println(book_code + "\t" + title + "\t" + author + "\t" + year + "\t" + price);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally { // ���ܹ߻�, ����ó��
			// ������ �������� �ݾ���� ��
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}

			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}

			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
