
public class Ex3_9 {

	public static void main(String[] args) {

		int i = 1_000_000;
		int y = 2_000_000;
		
		// long result = i * y; // 갑손실 발생 (int x int) = int
		long result = (long) i * y; // 한쪽이라도 형변환 한 다음에 곱해줘야한다.
		System.out.println(result);
	
	}

}
