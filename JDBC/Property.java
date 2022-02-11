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
		// ConnectEx 방식을 보안성 문제로 Property 방식을 수정
		// 연결문자열
		// jdbc:mysql://localhost:포트/데이터베이스
		Connection conn = null; // db에 접속담당 하는 객체
		Statement stmt = null; // sql 명령어를 실행 해주는 객체
		ResultSet rs = null; // select 명령어를 실행 해주는 객체

		try { // 예외 처리 필수
			FileInputStream fis = new FileInputStream("C:/Help_JAVA/java_mysql/db.prop");
			Properties prop = new Properties();
			prop.load(fis);
			String driver = prop.getProperty("driver"); // getProperty(key) 개별 값
			String url = prop.getProperty("url");
			String id = prop.getProperty("id");
			String password = prop.getProperty("password");
			// mysql 드라이버 로딩
			Class.forName(driver);
			// db에 접속
			conn = DriverManager.getConnection(url, id, password);
			String sql = "select * from books"; // sql 명령어
			stmt = conn.createStatement(); // sql 실행 객체
			rs = stmt.executeQuery(sql); // 실행, 결과셋의 시작주소를 rs에 전달

			while (rs.next()) { // 레코드 1개를 읽음, 내용이 있으면 true, 없으면 false
				// 결과셋.get자료형("필드명")
				int book_code = rs.getInt("book_code");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String year = rs.getString("year");
				int price = rs.getInt("price");

				System.out.println(book_code + "\t" + title + "\t" + author + "\t" + year + "\t" + price);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally { // 예외발생, 정상처리
			// 실행한 역순으로 닫아줘야 됨
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
