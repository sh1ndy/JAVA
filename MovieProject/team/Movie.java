import java.io.File;
import java.time.LocalDate;
import java.util.Arrays;

public class Movie {
	private String movie_name;
	private String Genre;
	private String Grade;
	private double Rating;
	private File file;
	private LocalDate date;
	
	public Movie() {
		
	}

	public Movie(String movie_name, String genre, String grade, double rating, File file, LocalDate date) {
		super();
		this.movie_name = movie_name;
		this.Genre = genre;
		this.Grade = grade;
		this.Rating = rating;
		this.file = file;
		this.date = date;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		this.Genre = genre;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		this.Grade = grade;
	}

	public double getRating() {
		return Rating;
	}

	public void setRating(double rating) {
		this.Rating = rating;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Movie [movie_name=" + movie_name + ", Genre=" + Genre + ", Grade=" + Grade + ", Rating=" + Rating
				+ ", file=" + file + ", date=" + date + "]";
	}
	
	

	
	
}
