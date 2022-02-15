package movieProject;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class MovieDAO {

	public int insertMovie(MovieDTO dto) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = Controller.dbConn();
			String sql = "INSERT INTO movie (name, genre, grade, rating, image, time) VALUES (?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getGenre());
			pstmt.setString(3, dto.getGrade());
			pstmt.setDouble(4, dto.getRating());
			pstmt.setBlob(5, new FileInputStream(dto.getImage()));
			pstmt.setDate(6, dto.getTime());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return result;
	}

	public int deleteMovie(String name) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = Controller.dbConn();
			String sql = "DELETE FROM movie WHERE name = ?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, name);

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return result;
	}

	public int updateMovie(MovieDTO dto) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = Controller.dbConn();
			String sql = "UPDATE movie SET name = ?, genre = ?, grade = ?, rating = ?, image = ?, time = ? WHERE name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getGenre());
			pstmt.setString(3, dto.getGrade());
			pstmt.setDouble(4, dto.getRating());
			pstmt.setBlob(5, new FileInputStream(dto.getImage()));
			pstmt.setDate(6, dto.getTime());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return result;
	}
	
	public Vector listMovie() {
		Vector items = new Vector();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = Controller.dbConn();
			String sql = "SELECT name, genre, grade, rating, image, time FROM movie";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Vector row = new Vector();
//				row.add(rs.getString("id"));
				row.add(rs.getString("name"));
				row.add(rs.getString("genre"));
				row.add(rs.getString("grade"));
				row.add(rs.getString("rating"));
				row.add(rs.getString("image"));
				row.add(rs.getString("time"));
				
				items.add(row);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return items;
	}

}


















