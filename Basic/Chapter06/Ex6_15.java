package ex15;

class Data {
	// �����ڰ� �ϳ��� ���� ���� �����Ϸ� �ڵ� ����
	int value;
}

class Data2 {
	int value;
	
	// �⺻ ������ ����� ����
	Data2() {
	}
	
	// �Ű������� �ִ� ������
	Data2(int x) {
		value = x;
	}
}

public class Ex6_15 {

	public static void main(String[] args) {
		
		Data d = new Data();
		Data2 d2 = new Data2(10);
		
		// compile error�߻� : �⺻ �����ڰ� ������������
		// �⺻ �����ڸ� ����ҷ��� �ϳ��� �����ڰ� �̹� �����ϱ� ������ �⺻�����ڸ� ��������� �ۼ��������
//		Data2 dd2 = new Data2();	

	}

}
