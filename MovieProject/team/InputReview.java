import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InputReview {
	
	public int insert(Review review) {
		String insertReview = "INSERT INTO review (rename, rePW, reviewT)"
							+ " VALUES (?, ?, ?)";
		
		int result = 0;
		try (Connection conn = ConnectionProvider.getConnection();
				PreparedStatement remt = conn.prepareStatement(insertReview);) {
			
			remt.setString(1, review.getRename());
			remt.setString(2, review.getRePW());
			remt.setString(3, review.getReviewT());
			
			result = remt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return result;
	}
	

}
