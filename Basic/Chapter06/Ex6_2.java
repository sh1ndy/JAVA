
public class Ex6_2 {

	public static void main(String[] args) {

		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		t1.channel = 7;	// t1�� �Ӽ� channel ���� 7���� �Ѵ�.
		
		System.out.println("���� Tv1ä���� " + t1.channel + "�� �Դϴ�.");
		System.out.println("���� Tv2ä���� " + t2.channel + "�� �Դϴ�.");
		
		t2 = t1;	// t2�� t1�� �ּҰ��� �����Ѵ�.
		System.out.println("���� Tv1ä���� " + t1.channel + "�� �Դϴ�.");
		System.out.println("���� Tv2ä���� " + t2.channel + "�� �Դϴ�.");
		
		// ���̰� 3�� ��ü �迭 ����
		Tv[] tvArr = {new Tv(), new Tv(), new Tv()};
		
		tvArr[0].channel = 10;  // tvArr[0] �Ӽ��� channel�� 10 ����
		tvArr[1].channel = 20;  // tvArr[1] �Ӽ��� channel�� 20 ����
		tvArr[2].channel = 30;  // tvArr[2] �Ӽ��� channel�� 30 ����
		System.out.println("���� tvArr[0]ä���� " + tvArr[0].channel + "�� �Դϴ�.");
		System.out.println("���� tvArr[1]ä���� " + tvArr[1].channel + "�� �Դϴ�.");
		System.out.println("���� tvArr[2]ä���� " + tvArr[2].channel + "�� �Դϴ�.");
		
		
		
	}

}
