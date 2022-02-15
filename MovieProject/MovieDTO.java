package movieProject;

import java.io.File;
import java.sql.Blob;
import java.sql.Date;

public class MovieDTO {

	private String name;
	private String genre;
	private String grade;
	private double rating;
	private File image;
	private Date time;

	public MovieDTO() {
	}

	public MovieDTO(String name, String genre, String grade, double rating, File image, Date time) {
		this.name = name;
		this.genre = genre;
		this.grade = grade;
		this.rating = rating;
		this.image = image;
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", genre=" + genre + ", grade=" + grade + ", rating=" + rating + ", image="
				+ image + ", time=" + time + "]";
	}

}
