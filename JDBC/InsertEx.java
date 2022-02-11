package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;

public class InsertEx {
	public static void main(String[] args) throws IOException {
		// FileInputStream ������ ���� �б�
		FileInputStream fis = new FileInputStream("C:/Help_JAVA/java_mysql/db.prop");
		// key=value
		Properties prop = new Properties();
		prop.load(fis);	// db.prop ���Ͽ��� key, value �ε�
		String driver = prop.getProperty("driver"); // getProperty(key) ���� ��
		String url = prop.getProperty("url");
		String id = prop.getProperty("id");
		String password = prop.getProperty("password");
		
		Connection conn = null;	// db ����
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver); // mysql ����̹� �ε�
			// getConnection(���Ṯ�ڿ�, ���̵�, ��й�ȣ)
			conn = DriverManager.getConnection(url, id, password);
			
			// ���� �Է� ��
//			String title = "Python";
//			String author = "������";
//			String year = "2021";
//			int price = 45000;
			
			// �ܼ� �Է� ��
			Scanner sc = new Scanner(System.in);
			System.out.print("����:");
			String title = sc.next();
			System.out.print("����:");
			String author = sc.next();
			System.out.print("�⵵:");
			String year = sc.next();
			System.out.print("����:");
			int price = sc.nextInt();
			
			String sql = "insert into books (title, author, year, price) values (?,?,?,?)";
			pstmt = conn.prepareStatement(sql); // sql ��ɾ� �غ�
			pstmt.setString(1, title); // 1�� ����ǥ�� �� �Է�
			pstmt.setString(2, author);
			pstmt.setString(3, year);
			pstmt.setInt(4, price);
			pstmt.executeUpdate(); // �߰�, ����, ����
			System.out.println("�߰��Ǿ����ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // ���ҽ� ����
			try {
				if (pstmt != null) {
					pstmt.close();
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
