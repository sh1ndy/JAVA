
public class Ex3_9 {

	public static void main(String[] args) {

		int i = 1_000_000;
		int y = 2_000_000;
		
		// long result = i * y; // ���ս� �߻� (int x int) = int
		long result = (long) i * y; // �����̶� ����ȯ �� ������ ��������Ѵ�.
		System.out.println(result);
	
	}

}
