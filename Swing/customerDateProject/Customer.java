import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Customer {
	// customer 클래스를 사용할거라서 메인이 필요없음
//	public static void main(String[] args) {
//		createTable();
//		createCustomer("Danny", "123456789", "Male", "23", "Random Note...");
//		
//		ArrayList<String> list = getCustomers();
//		for(String item : list) {
//			System.out.println(item);
//		}
//		
//		createCustomer("David", "441122211", "Female", "25", "Important Customer");
//		list = getCustomers();
//		for(String item : list) {
//			System.out.println(item);
//		}
//		
//	}
	
	// swing 연결해서 데이터를 불러오는 곳
		public static String[][] getCustomers() {
			try {
				Connection conn = getConnection();
				PreparedStatement stmt = conn.prepareStatement("SELECT * FROM customer");
				
				// 결과값을 받는 곳
				ResultSet rs = stmt.executeQuery();
				ArrayList<String[]> list = new ArrayList<String[]>();
				
				// 데이터가 끝날 때까지 다음데이터가 없을 때 까지 전부 다 불러오기
				while(rs.next()) {
					list.add(new String[] {
								rs.getString("name"),
								rs.getString("phone"),
								rs.getString("gender"),
								rs.getString("age"),
								rs.getString("note")
								});
				}
				System.out.println("데이터를 전부다 불러옴");
				String[][] arr = new String[list.size()][5];
				// 형변환 시켜서 반환
				return list.toArray(arr);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				return null;
			}
			
		}
	
//	// 데이터 불러오는 메서드 -기존-
//	public static ArrayList<String> getCustomers() {
//		try {
//			Connection conn = getConnection();
//			PreparedStatement stmt = conn.prepareStatement("SELECT name, phone, gender FROM customer");
//			
//			// 결과값을 받는 곳
//			ResultSet rs = stmt.executeQuery();
//			ArrayList<String> list = new ArrayList<String>();
//			
//			// 데이터가 끝날 때까지 다음데이터가 없을 때 까지 전부 다 불러오기
//			while(rs.next()) {
//				list.add("Name : " + rs.getString("name") + 
//						" Phone : " + rs.getString("phone") +
//						" Gender : " +rs.getString("gender"));	
//			}
//			System.out.println("데이터를 전부다 불러옴");
//			return list;
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			return null;
//		}
//		
//	}
	
	// 실제 데이터를 저장하는 메서드
	public static void createCustomer(String name, String phone, String gender, String age, String note) {
		try {
			Connection conn = getConnection();
			PreparedStatement insert = conn.prepareStatement(""
					+ "INSERT INTO customer"
					+ "(name, phone, gender, age, note) "
					+ "VALUES "
					+ "('" + name + "','" + phone + "','" + gender + "','" + age + "','" + note + "')");
			insert.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("데이터 저장 완료");
		}
	}
	
	// 테이블 만들기
	public static void createTable() {
		// 항상 try-catch
		try {
			// 드라이버 및 MySQL연동을 Connection 타입의 conn 변수에 저장
			Connection conn = getConnection();
			// SQL에게 테이블을 만들어라는 명령 전달
			PreparedStatement createTable = conn.prepareStatement(
					"CREATE TABLE IF NOT EXISTS "
					+ "customer(id int NOT NULL AUTO_INCREMENT,"
					+ "name varChar(255),"
					+ "phone varChar(255),"
					+ "gender varChar(255),"
					+ "age varChar(255),"
					+ "note varChar(255),"
					+ "PRIMARY KEY(id))");
			
			// 명령한 용어를 실행
			createTable.execute();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("테이블 생성 완료");
		}
	}
	
	public static Connection getConnection() {
		// try-catch로 드라이버 연결
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/my_db";
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
