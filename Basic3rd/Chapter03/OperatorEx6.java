
public class OperatorEx6 {

	public static void main(String[] args) {

		byte a = 20;
		byte b = 30;
		byte c = (byte) (a + b); // 명시적으로 형변환을 해주지 않으면 int형으로 값을 반환하기때문에 컴파일 에러가 
		System.out.println(c);
		
	}

}
