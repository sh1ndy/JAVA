
public class VarEx2 {
	public static void main(String[] args) {
		// x, y�� ���� ���� ���� ���
		int x = 4;
		int y = 2;
		
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		System.out.println("==============");
		
		int tmp = x; // x�� ���� tmp�� ����
		x = y; // y�� ���� x�� ����
		y = tmp; // tmp�� ���� y�� ����
		
		System.out.println("x:" + x);
		System.out.println("y:" + y);
	}
}
