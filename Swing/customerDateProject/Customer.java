import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Customer {
	// customer Ŭ������ ����ҰŶ� ������ �ʿ����
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
	
	// swing �����ؼ� �����͸� �ҷ����� ��
		public static String[][] getCustomers() {
			try {
				Connection conn = getConnection();
				PreparedStatement stmt = conn.prepareStatement("SELECT * FROM customer");
				
				// ������� �޴� ��
				ResultSet rs = stmt.executeQuery();
				ArrayList<String[]> list = new ArrayList<String[]>();
				
				// �����Ͱ� ���� ������ ���������Ͱ� ���� �� ���� ���� �� �ҷ�����
				while(rs.next()) {
					list.add(new String[] {
								rs.getString("name"),
								rs.getString("phone"),
								rs.getString("gender"),
								rs.getString("age"),
								rs.getString("note")
								});
				}
				System.out.println("�����͸� ���δ� �ҷ���");
				String[][] arr = new String[list.size()][5];
				// ����ȯ ���Ѽ� ��ȯ
				return list.toArray(arr);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				return null;
			}
			
		}
	
//	// ������ �ҷ����� �޼��� -����-
//	public static ArrayList<String> getCustomers() {
//		try {
//			Connection conn = getConnection();
//			PreparedStatement stmt = conn.prepareStatement("SELECT name, phone, gender FROM customer");
//			
//			// ������� �޴� ��
//			ResultSet rs = stmt.executeQuery();
//			ArrayList<String> list = new ArrayList<String>();
//			
//			// �����Ͱ� ���� ������ ���������Ͱ� ���� �� ���� ���� �� �ҷ�����
//			while(rs.next()) {
//				list.add("Name : " + rs.getString("name") + 
//						" Phone : " + rs.getString("phone") +
//						" Gender : " +rs.getString("gender"));	
//			}
//			System.out.println("�����͸� ���δ� �ҷ���");
//			return list;
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			return null;
//		}
//		
//	}
	
	// ���� �����͸� �����ϴ� �޼���
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
			System.out.println("������ ���� �Ϸ�");
		}
	}
	
	// ���̺� �����
	public static void createTable() {
		// �׻� try-catch
		try {
			// ����̹� �� MySQL������ Connection Ÿ���� conn ������ ����
			Connection conn = getConnection();
			// SQL���� ���̺��� ������� ��� ����
			PreparedStatement createTable = conn.prepareStatement(
					"CREATE TABLE IF NOT EXISTS "
					+ "customer(id int NOT NULL AUTO_INCREMENT,"
					+ "name varChar(255),"
					+ "phone varChar(255),"
					+ "gender varChar(255),"
					+ "age varChar(255),"
					+ "note varChar(255),"
					+ "PRIMARY KEY(id))");
			
			// ����� �� ����
			createTable.execute();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("���̺� ���� �Ϸ�");
		}
	}
	
	public static Connection getConnection() {
		// try-catch�� ����̹� ����
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/my_db";
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
