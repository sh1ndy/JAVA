
public class Ex4_4 {

	public static void main(String[] args) {

		// ���� ��� ǥ��
		// 90�� �̻� - A, 80�� �̻� - B, 70�� �̻� - C, 60�� �̻� - D
		
		int score = 5;
		String grade = "D";
		
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		}
		
		System.out.printf("�л��� ������ %d �̰� ����� %s ���� �Դϴ�.%n", score, grade);
		
	}

}
