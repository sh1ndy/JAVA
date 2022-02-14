package employeeEx;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	public int delete_emp(int empno) {  // 사원정보 삭제
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DB.dbConn();  // static, 클래스이름으로 접근
			String sql = "DELETE FROM emp WHERE empno = ?";  // ? == 사번
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empno);  // 1번 물음표에 입력
			result = pstmt.executeUpdate();  // 레코드 삭제, 삭제된 레코드 수
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			try {
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return result;  // 삭제된 레코드 수 리턴
	}
	
	public List<EmpDTO> list_emp() {
		List<EmpDTO> items = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;  // 결과셋
		
		try {
			conn = DB.dbConn();
			String sql = "SELECT * FROM emp";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();  // select 실행, 결과셋의 시작주소를 rs에 전달
			
			while (rs.next()) {  // 1개의 레코드를 읽음
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				Date hiredate = rs.getDate("hiredate");
				int sal = rs.getInt("sal");
				// 리스트에 추가
				items.add(new EmpDTO(empno, ename, hiredate, sal));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			try {
				if (pstmt != null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			try {
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return items;
	}
	
	public void insert_emp(EmpDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DB.dbConn();
			String sql = "INSERT INTO emp (empno, ename, hiredate, sal) VALUES (?, ?, ?, ?)";
			// 물음표 4개, 1 ~ 4
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getEmpno());
			pstmt.setString(2, dto.getEname());
			pstmt.setDate(3, dto.getHiredate());
			pstmt.setInt(4, dto.getSal());
			pstmt.executeUpdate(); // 레코드 추가
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			try {
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
