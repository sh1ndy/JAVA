package ex11;

class Data {
	int x;

}

public class Ex6_11 {

	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		
		Data d2 = copy(d);
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
		

	}
	
	static Data copy(Data d) {
		Data tmp = new Data();	// ���ο� ��ü tmp ����
		tmp.x = d.x;	// d.x�� ���� tmp.x�� �����Ѵ�.
		return tmp;		// ������ ��ü�� �ּҸ� ��ȯ�Ѵ�.
	}
	
}
