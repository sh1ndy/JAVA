package ch18;

public class Company {
	// 싱글톤 패턴
	private static Company instance;
	
	// 디폴트 생성자를 캡슐화 시킴
	private Company() {
		
	}
	
	// 외부 클래스에서 호출 할 수 있는 메서드
	public static Company getInstance() {
		// instance가 초기화 되어있지 않다면
		if (instance == null) {
			// Compnay객체를 생성
			instance = new Company();
		}
		return instance;
	}


}
