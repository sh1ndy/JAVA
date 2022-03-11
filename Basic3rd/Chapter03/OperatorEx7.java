
public class OperatorEx7 {

	public static void main(String[] args) {

		byte a = 10;
		byte b = 30;
		byte c = (byte) (a * b); // byte의 범위를 초과해서 값 손실 발생
		System.out.println(c); // 44
		
	}

}
