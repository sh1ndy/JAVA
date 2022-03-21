class Time {
	private int hour;
	private int minute;
	private int second;
	
	Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (!(0 < hour && hour < 24)) return;
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (!(0 < minute && minute < 60)) return;
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (!(0 < second && second < 60)) return;
		this.second = second;
	}
	
	public String toString() {
		return hour + " : " + minute + " : " + second;
	}
	
}

public class TimeTest {

	public static void main(String[] args) {

		Time t = new Time(23, 44, 55);
		t.setHour(24);
		t.setMinute(60);
		t.setSecond(60);
		System.out.println(t);
		
	}

}
