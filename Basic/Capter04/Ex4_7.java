
public class Ex4_7 {

	public static void main(String[] args) {

		int num = 0;
		
		// {} �� ���� ������ 20�� �ݺ��Ѵ�.
		// Quiz. 1 ~ 10������ ������ 20�� ����Ͻÿ�.
//		for (int i = 0; i < 20; i++) {
//			num = (int)(Math.random() * 10) + 1;
//			System.out.println(i + 1 + "���� ���� : " + num);
//		}
		
		// Quiz. -5 ~ 5������ ������ 20�� ����Ͻÿ�.
		for (int i = 0; i < 20; i++) {
			num = (int)(Math.random() * 11) -5;
			System.out.println(num);
		}
		
	}

}
