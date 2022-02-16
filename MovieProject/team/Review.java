


public class Review {
	private String rename;
	private String rePW;
	private String reviewT;
	
	public Review() {
		
	}

	public Review(String rename, String rePW, String reviewT) {
		super();
		this.rename = rename;
		this.rePW = rePW;
		this.reviewT = reviewT;
	}
	
	public String getRename() {
		return rename;
	}

	public void setRename(String rename) {
		this.rename = rename;
	}

	public String getRePW() {
		return rePW;
	}

	public void setRePW(String rePW) {
		this.rePW = rePW;
	}

	public String getReviewT() {
		return reviewT;
	}

	public void setReviewT(String reviewT) {
		this.reviewT = reviewT;
	}

	@Override
	public String toString() {
		return "Review [rename=" + rename + ", rePW=" + rePW + ", reviewT=" + reviewT + "]";
	}

	
	
	
}
