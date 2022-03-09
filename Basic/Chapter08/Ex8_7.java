
public class Ex8_7 {

	public static void main(String[] args) {

		try {
			throw new Exception(); // Exception과 그 자손은 반드시 예외처리를 해줘야한다. (필수)
		} catch (Exception e) {
			System.out.println(e);
		}
		
		throw new RuntimeException(); // RuntimeException과 그 자손은 예외처리를 선택적으로 할 수 있다. (선택)

	}

}
