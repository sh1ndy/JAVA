
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
	
	// �Ű������� �Ѱ��� hour�� ��ȿ���� Ȯ���ؼ� �˷��ִ� �޼���
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
