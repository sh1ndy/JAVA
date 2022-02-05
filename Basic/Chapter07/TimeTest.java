class Time {
	private int hour;	// 0 ~ 23 ������ ���� ������ ��
	private int minute;
	private int second;
	
	// hour �� ��ȯ
	public int getHour() {
		return hour;
	}
	
	// hour �� ����
	public void setHour(int hour) {
		// ���� ���ϴ� ������ ������ �´��� Ȯ��
		if (isNotVaildHour(hour)) {
			return;
		}
		
		this.hour = hour;
	}
	
	// minute �� ��ȯ
	public int getMinute() {
		return minute;
	}
	
	// minute �� ����
	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) {
			return;
		}
		
		this.minute = minute;
	}
	
	// second �� ��ȯ
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		if (second < 0 || second > 59) {
			return;
		}
		
		this.second = second;
	}
	
	// �Ű������� �Ѱ��� hour�� �������� Ȯ���ؼ� �˷��ִ� �޼���
	// �ܺο��� ���� ����� ���������� Method�� private���� ���������� ���
	private boolean isNotVaildHour(int hour) {
		return hour < 0 || hour > 23;
	}
	
}
public class TimeTest {

	public static void main(String[] args) {

		Time t = new Time();
		t.setHour(23);		// hour�� �ð� �� �ٲܷ��� setHour() ȣ��
		t.setMinute(59);	// minute�� �� �� �ٲܷ��� setMinute() ȣ��
		t.setSecond(59);	// second�� �� �� �ٲܷ��� setSecond() ȣ��
		System.out.println(t.getHour());	// hour�� ���� �������� setHour() ȣ��
		System.out.println(t.getMinute());	// Minute�� ���� �������� setMinute() ȣ��
		System.out.println(t.getSecond());	// Second�� ���� �������� setSecond() ȣ��
		
	}

}
