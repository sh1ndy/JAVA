
public class Ex3_6 {

	public static void main(String[] args) {
		
		// ���� ���ϴ� �Ҽ��� ��� �� ���
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000.0) / 1000.0;
		System.out.println(shortPi);
		
		//�Ҽ��� �Ѷ��ڸ� ���� ���
		double pi2 = 4.578905;
		double shortPi2 = Math.round(pi2 * 100.0) / 100.0;
		System.out.println(shortPi2);
		
		// ���࿡ 3.141�� ��������
		System.out.println(pi);
		System.out.println(pi * 1000);
		System.out.println((int)(pi * 1000));
		System.out.println((int)(pi * 1000) / 1000.0);
	}

}
