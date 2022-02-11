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
		// FileInputStream 파일의 내용 읽기
		FileInputStream fis = new FileInputStream("C:/Help_JAVA/java_mysql/db.prop");
		// key=value
		Properties prop = new Properties();
		prop.load(fis);	// db.prop 파일에서 key, value 로딩
		String driver = prop.getProperty("driver"); // getProperty(key) 개별 값
		String url = prop.getProperty("url");
		String id = prop.getProperty("id");
		String password = prop.getProperty("password");
		
		Connection conn = null;	// db 접속
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver); // mysql 드라이버 로딩
			// getConnection(연결문자열, 아이디, 비밀번호)
			conn = DriverManager.getConnection(url, id, password);
			
			// 고정 입력 값
//			String title = "Python";
//			String author = "한지우";
//			String year = "2021";
//			int price = 45000;
			
			// 콘솔 입력 값
			Scanner sc = new Scanner(System.in);
			System.out.print("제목:");
			String title = sc.next();
			System.out.print("저자:");
			String author = sc.next();
			System.out.print("년도:");
			String year = sc.next();
			System.out.print("가격:");
			int price = sc.nextInt();
			
			String sql = "insert into books (title, author, year, price) values (?,?,?,?)";
			pstmt = conn.prepareStatement(sql); // sql 명령어 준비
			pstmt.setString(1, title); // 1번 물음표에 값 입력
			pstmt.setString(2, author);
			pstmt.setString(3, year);
			pstmt.setInt(4, price);
			pstmt.executeUpdate(); // 추가, 수정, 삭제
			System.out.println("추가되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // 리소스 정리
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
