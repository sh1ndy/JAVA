package employeeEx;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	public int delete_emp(int empno) {  // ������� ����
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DB.dbConn();  // static, Ŭ�����̸����� ����
			String sql = "DELETE FROM emp WHERE empno = ?";  // ? == ���
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empno);  // 1�� ����ǥ�� �Է�
			result = pstmt.executeUpdate();  // ���ڵ� ����, ������ ���ڵ� ��
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
		
		return result;  // ������ ���ڵ� �� ����
	}
	
	public List<EmpDTO> list_emp() {
		List<EmpDTO> items = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;  // �����
		
		try {
			conn = DB.dbConn();
			String sql = "SELECT * FROM emp";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();  // select ����, ������� �����ּҸ� rs�� ����
			
			while (rs.next()) {  // 1���� ���ڵ带 ����
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				Date hiredate = rs.getDate("hiredate");
				int sal = rs.getInt("sal");
				// ����Ʈ�� �߰�
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
			// ����ǥ 4��, 1 ~ 4
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getEmpno());
			pstmt.setString(2, dto.getEname());
			pstmt.setDate(3, dto.getHiredate());
			pstmt.setInt(4, dto.getSal());
			pstmt.executeUpdate(); // ���ڵ� �߰�
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
