
public class Ex3_5 {

	public static void main(String[] args) {
		
		// 1,000,000	1�鸸 = 10�� 6����
		int a = 1_000_000;
		// 2,000,000	2�鸸 = 10�� 6����
		int b = 2_000_000;
		
		// 10�� 12����.	int�� ������ 10�� 9����
		// a, b ���� ����ȯ ���Ѻ��� �ƹ� �ҿ���� ó������ �߸��� �� �̱� ������
		long c1 = (long)(a * b);
		System.out.println(c1);
		
		// a, b �� �ϳ��� ���� long Ÿ������ ���� ����ȯ�� ��Ű���Ѵ�.
		long c2 = (long)a * b; 
		System.out.println(c2);
	}

}
