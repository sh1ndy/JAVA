class Time {
	private int hour;	// 0 ~ 23 사이의 값을 가져야 함
	private int minute;
	private int second;
	
	// hour 값 반환
	public int getHour() {
		return hour;
	}
	
	// hour 값 수정
	public void setHour(int hour) {
		// 내가 원하는 숫자의 조건이 맞는지 확인
		if (isNotVaildHour(hour)) {
			return;
		}
		
		this.hour = hour;
	}
	
	// minute 값 반환
	public int getMinute() {
		return minute;
	}
	
	// minute 값 수정
	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) {
			return;
		}
		
		this.minute = minute;
	}
	
	// second 값 반환
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		if (second < 0 || second > 59) {
			return;
		}
		
		this.second = second;
	}
	
	// 매개변수로 넘겨진 hour가 유요한지 확인해서 알려주는 메서드
	// 외부에서 굳이 사용할 이유가없는 Method는 private으로 접근제어자 사용
	private boolean isNotVaildHour(int hour) {
		return hour < 0 || hour > 23;
	}
	
}
public class TimeTest {

	public static void main(String[] args) {

		Time t = new Time();
		t.setHour(23);		// hour의 시간 을 바꿀려면 setHour() 호출
		t.setMinute(59);	// minute의 분 을 바꿀려면 setMinute() 호출
		t.setSecond(59);	// second의 초 를 바꿀려면 setSecond() 호출
		System.out.println(t.getHour());	// hour의 값을 받을려면 setHour() 호출
		System.out.println(t.getMinute());	// Minute의 값을 받을려면 setMinute() 호출
		System.out.println(t.getSecond());	// Second의 값을 받을려면 setSecond() 호출
		
	}

}
