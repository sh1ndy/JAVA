
public class Ex8_7 {

	public static void main(String[] args) {

		try {
			throw new Exception(); // Exception�� �� �ڼ��� �ݵ�� ����ó���� ������Ѵ�. (�ʼ�)
		} catch (Exception e) {
			System.out.println(e);
		}
		
		throw new RuntimeException(); // RuntimeException�� �� �ڼ��� ����ó���� ���������� �� �� �ִ�. (����)

	}

}
