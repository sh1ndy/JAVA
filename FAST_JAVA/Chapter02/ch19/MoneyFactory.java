package ch19;

public class MoneyFactory {
	// �̱��� ������ �̿��� �ϳ��� ���ุ ����
	private static MoneyFactory instance;
	private String name;
	
	private MoneyFactory(String name) {
		this.name = name;
	}
	
	public static MoneyFactory getInstance() {
		if (instance == null) {
			instance = new MoneyFactory("��������");
		}
		
		return instance;
	}
	
	public Money create() {
		Money m = new Money();
		return m;
	}
	

}
