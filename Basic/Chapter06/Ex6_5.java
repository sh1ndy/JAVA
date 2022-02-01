package ex05;

class Time {
	int hour;
	int minute;
	int second;
}

public class Ex6_5 {

	public static void main(String[] args) {
		
		Time t = new Time();
		t.hour = 6;
		t.minute = 33;
		t.second = 12;
		
		System.out.println("현재 시간 : " + t.hour +"시 " + t.minute + "분 " + t.second + "초 입니다.");
		
	}

}
