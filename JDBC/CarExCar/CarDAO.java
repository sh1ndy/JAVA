package jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class CarDAO {
	// db커넥션 리턴
	public Connection dbConn() {
		Connection conn = null;	// db접속
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Help_JAVA\\java_mysql\\db.prop");
			Properties prop = new Properties();
			prop.load(fis);	// db.prop => 프로퍼티(key, value)
			String url = prop.getProperty("url");	// 프로퍼티에서 key => value
			String id = prop.getProperty("id");
			String password = prop.getProperty("password");
			conn = DriverManager.getConnection(url, id, password);	// db 접속
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;	// 커넥션 리턴
	}
	
	// 레코드 리스트
	public List<CarDTO> list_car() {
		// 좌변 상위, 우변 하위 => 다형성
		List<CarDTO> items = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = dbConn();	// db 접속
			String sql = "select * from car"; 	// sql 명령어 작성
			pstmt = conn.prepareStatement(sql);	// sql 실행 객체
			rs = pstmt.executeQuery();	// sql 실행, 결과셋에 시작주소값을 리턴
			
			while (rs.next()) {	// 레코드 1개를 읽음, 내용이 있으면 true, 없으면 false
				// 결과셋.get자료형("필드형")
				String car_no = rs.getString("car_no");	
				String company = rs.getString("company");
				String type = rs.getString("type");
				int year = rs.getInt("year");
				int efficiency = rs.getInt("efficiency");
				
				// DTO 생성
				CarDTO dto = new CarDTO(car_no, company, type, year, efficiency);
				// 리스트에 DTO 추가
				items.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {	// 항상 실행, rs => pstmt => conn 역순으로 닫음
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
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
		
		return items;  // 리스트 리턴
	}
	
	public void insert_car(CarDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = dbConn();
			String sql = "insert into car (car_no, company, type, year, efficiency) values (?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getCar_no());
			pstmt.setString(2, dto.getCompany());
			pstmt.setString(3, dto.getType());
			pstmt.setInt(4, dto.getYear());
			pstmt.setInt(5, dto.getEfficiency());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
	
	public int delete_car(String car_no) {
		int result = 0;  // 삭제된 레코드 수
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = dbConn();  // db 접속
			String sql = "delete from car where car_no = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, car_no);
			result = pstmt.executeUpdate();	// 레코드 삭제, 삭제된 행의 수가 리턴
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
			
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		}
		return result;
	}

}
