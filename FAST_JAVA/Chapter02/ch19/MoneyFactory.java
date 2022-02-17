package ch19;

public class MoneyFactory {
	// 싱글톤 패턴을 이용한 하나의 은행만 생성
	private static MoneyFactory instance;
	private String name;
	
	private MoneyFactory(String name) {
		this.name = name;
	}
	
	public static MoneyFactory getInstance() {
		if (instance == null) {
			instance = new MoneyFactory("신한은행");
		}
		
		return instance;
	}
	
	public Money create() {
		Money m = new Money();
		return m;
	}
	

}
