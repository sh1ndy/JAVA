
public class VarEx5 {

	public static void main(String[] args) {

		// ���� ����� �ʱ�ȭ
		int x = 10;
		int y = 20;
		
		// ���� ���� (�ʱ�ȭ ���߿� �ص�)
		int tmp;
		
		System.out.println("x , y : " + x + " , " + y);
		
		tmp = x; // tmp �� x ����
		x = y; 	 // x �� y ����
		y = tmp; // y �� tmp ����
		System.out.println("x , y : " + x + " , " + y);
		
		
		
	}

}
