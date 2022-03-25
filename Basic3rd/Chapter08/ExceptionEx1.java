
public class ExceptionEx1 {

	public static void main(String[] args) {

		try {
			try { } catch (Exception e) { }
		} catch (Exception e) {
//			try {} catch (ExceptionEx e) {} // 에러. 변수 e가 중복 선언되었다
		}
		
		try {
			
		} catch (Exception e) {
			
		}
		
	}

}
