
class MyMath2 {
	int x;
	int y;
	
	long add() {
		return x + y;
	}
	
	// �������� ���°��� �ƴ϶� iv ������ ����ϴ��� ���ϴ����� ����
	// lv������ ����� ��� static �ٿ���
	static long add(long a, long b) {
		return a + b;
	}
}

public class Ex6_9 {

	public static void main(String[] args) {
		
		System.out.println(MyMath2.add(200L, 300L));
		
		MyMath2 mm = new MyMath2();
		mm.x = 100;
		mm.y = 200;
		System.out.println(mm.add());

		
	}

}
