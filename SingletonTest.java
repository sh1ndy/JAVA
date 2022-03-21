final class Singleton {
	private static Singleton s = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if (s == null) {
			s = new Singleton();
		}
		
		return s;
	}
}

public class SingletonTest {
                                       
	public static void main(String[] args) {

//		Singleton s = new Singleton(); // 에러!! private으로 접근제어라로 제어되어있음
		Singleton s = Singleton.getInstance(); // public static 메서드로 생성 가능
		
	}

}
