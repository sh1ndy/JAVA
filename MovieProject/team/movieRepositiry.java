import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class movieRepository {

	ArrayList<Movie> li = new ArrayList<Movie>();

	// 없으면 테이블 생성
	public void crateTable() {
		String query = "CREATE TABLE IF NOT EXISTS movie (" + "movie_name VARCHAR(30) NOT NULL"
				+ ", Genre VARCHAR(20) NOT NULL" + ", Grade VARCHAR(20) NOT NULL" + ", Rating DOUBLE NOT NULL"
				+ ", Image MEDIUMBLOB" + ", time DATE" + ");";

		try (Connection conn = ConnectionProvider.getConnection(); Statement stmt = conn.createStatement();) {

			stmt.executeUpdate(query);
			System.out.println("테이블 생성");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int insert(Movie movie) {
		String insertMovie = "INSERT INTO movie (movie_name, Genre, Grade, Rating, Image, time)"
				+ " VALUES (?, ?, ?, ?, ?, ?)";

		int result = 0;
		try (Connection conn = ConnectionProvider.getConnection();
				PreparedStatement stmt = conn.prepareStatement(insertMovie);) {

			stmt.setString(1, movie.getMovie_name());
			stmt.setString(2, movie.getGenre());
			stmt.setString(3, movie.getGrade());
			stmt.setDouble(4, movie.getRating());
			stmt.setBlob(5, new FileInputStream(movie.getFile()));
			stmt.setDate(6, Date.valueOf(movie.getDate()));

			result = stmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return result;
	}
//	public int countMovie() {
//		String query = "Select Max(id) from movie;";
//		int max = 0;
//		try (Connection conn = ConnectionProvider.getConnection(); Statement stmt = conn.createStatement();) {
//			ResultSet rs = stmt.executeQuery(query);
//			while (rs.next()) {
//
//				max = rs.getInt("id");
//
//			}
//			return max;
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return max;
//	}

	public List<Movie> selectMovie() {
		String query = "Select * from movie;";

		List<Movie> list = new ArrayList<>();
		try (Connection conn = ConnectionProvider.getConnection(); Statement stmt = conn.createStatement();) {
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				String movie_name = rs.getString("movie_name");
				String genre = rs.getString("genre");
				String grade = rs.getString("grade");
				Double rating = rs.getDouble("rating");
				Blob image = rs.getBlob("image");
				byte[] b = image.getBytes(1, (int) image.length());
				LocalDate date = rs.getDate("time").toLocalDate();

				list.add(new Movie(movie_name, genre, grade, rating, byteToFile(movie_name, b), date));

			}

			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public int getMovieId(String s) {
		String query = "Select id from movie where movie_name = ?";

		try (Connection conn = ConnectionProvider.getConnection();
				PreparedStatement stmt = conn.prepareStatement(query);) {
			stmt.setString(1, s);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			int a = rs.getInt("id");
			return a;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public void updatedMovie(Movie m, int i) {
		String Query = "UPDATE movie SET movie_name = ?, genre = ?, grade = ? , rating = ? , image = ? WHERE id = ? ;";

		try (Connection conn = ConnectionProvider.getConnection();
				PreparedStatement stmt = conn.prepareStatement(Query);) {
			stmt.setString(1, m.getMovie_name());
			stmt.setString(2, m.getGenre());
			stmt.setString(3, m.getGrade());
			stmt.setDouble(4, m.getRating());
			stmt.setBlob(5, FileToBlob(m.getFile()));
			stmt.setInt(6, i);
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void deleteMovie(String s) {
		String deleteQuery = "DELETE FROM movie WHERE movie_name = ? ;";
		try (Connection conn = ConnectionProvider.getConnection();
				PreparedStatement stmt = conn.prepareStatement(deleteQuery);) {
			stmt.setString(1, s);
			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public File byteToFile(String filename, byte[] pData)

	{
		if (pData == null) {
			return null;
		}
		int lByteArraySize = pData.length;
		try {// 원하는 경로 하면 됨
			File lOutFile = new File("c:\\\\aaa\\\\movieFolder\\\\" + filename);
			FileOutputStream lFileOutputStream = new FileOutputStream(lOutFile);
			lFileOutputStream.write(pData);
			lFileOutputStream.close();
			return lOutFile;
		} catch (Throwable e) {
			e.printStackTrace(System.out);
		}
		return null;
	}

	public Blob FileToBlob(File file) {

		Blob blob = null;
		FileInputStream inputStream = null;

		try {
			byte[] byteArray = new byte[(int) file.length()];
			inputStream = new FileInputStream(file);
			inputStream.read(byteArray);

			blob = new javax.sql.rowset.serial.SerialBlob(byteArray);

		} catch (Exception e) {

		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}

			} catch (Exception e) {

				inputStream = null;

			} finally {
				inputStream = null;
			}
		}

		return blob;
	}

}