
public class Ex3_8 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		System.out.println(x < y);		// x�� y���� �۴� true
		System.out.println(x > y);		// x�� y���� ũ�� false
		System.out.println(x >= y);		// x�� y���� ũ�ų� ���� false
		System.out.println(x <= y);		// x�� y���� �۰ų� ���� false
		System.out.println(x == y);		// x�� y�� ���� false
		
		System.out.println(1 < x && x < 11); 	// 1�� x���� �۰� x�� 11���� �۴� true
		System.out.println(x % 2 == 0 || x % 3 == 0); // x�� 2�� ��� �̰ų� x�� 3�� ����̴� true
		
		char c = 'c';
		System.out.println('a' < c && c < 'f'); // a < c < f �̱⶧���� true
		
		// ���� �� ���� true �̰� ��Ȳ�� ���� ture �̱⶧���� true
		System.out.println((1 < 2 && 2 < 4) && (4 > 2 && 5 > 4)); 
		
		// ���� �� ���� true �̰� ��Ȳ�� ���� false ������ or ���� �̱⶧���� true
		System.out.println((1 < 2 && 2 < 4) || (1 > 2 && 4 > 4));
		
		System.out.println(x != 11); // x�� 11�̶� �ٸ��� true
		System.out.println(x != 10); // x�� 10�̶� �ٸ��� �ʴ� false
		System.out.println(!(x != 10)); // true
		
	}

}
