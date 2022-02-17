package ch18;

public class Company {
	// �̱��� ����
	private static Company instance;
	
	// ����Ʈ �����ڸ� ĸ��ȭ ��Ŵ
	private Company() {
		
	}
	
	// �ܺ� Ŭ�������� ȣ�� �� �� �ִ� �޼���
	public static Company getInstance() {
		// instance�� �ʱ�ȭ �Ǿ����� �ʴٸ�
		if (instance == null) {
			// Compnay��ü�� ����
			instance = new Company();
		}
		return instance;
	}


}
