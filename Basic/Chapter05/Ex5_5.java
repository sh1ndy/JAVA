import java.util.Arrays;

public class Ex5_5 {

	public static void main(String[] args) {

		// �ζ� ��ȣ ����
		int[] balls = new int[45];
		
		// 1 ~ 45 ���� �迭�� ������� �ʱ�ȭ�Ѵ�.
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		}
		
		// �迭�ȿ� �ִ� ���� ���� �� �̿��ؼ� ���´�.
		for (int i = 0; i < 6; i++) {
			int n = (int) (Math.random() * 45);
			int tmp = balls[i];
			balls[i] = balls[n];
			balls[n] = tmp;
		}
		
		// 6���� ����Ѵ�.
		for (int i = 0; i < 6; i++) {
			System.out.println("balls[" + (i + 1) + "] = " + balls[i]);
		}
		
	}

}
