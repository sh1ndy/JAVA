
class Time {
	private int hour;
	private int minute;
	private int second;
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		if (isNotVaildHour(hour)) {
			return;
		}
		this.hour = hour;
	}
	
	// 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
	private boolean isNotVaildHour(int hour) {
		return hour < 0 || hour > 24;
	}
}

public class TimeTest {

	public static void main(String[] args) {

		Time t = new Time();
		t.setHour(24);
		System.out.println(t.getHour());
		
	}

}
