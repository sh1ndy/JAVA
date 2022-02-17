package ch10;

public class BirthDay {

	private int day;
	private int month;
	private int year;
	private int lastDay;
	private boolean isValid;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			isValid = false;
		} else {
			isValid = true;
			this.month = month;
			switch (this.month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 9:
			case 11:
				lastDay = 30;
				break;
			case 2:
			case 4:
			case 6:
			case 8:
			case 12:
				lastDay = 31;
				break;
			}
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void showDate() {
		if (isValid) {
			System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
			System.out.println(month + "월의 마지막 일은 " + lastDay + "일 입니다.");
		} else {
			System.out.println("유효하지 않는 달 입니다.");
		}
	}

}
