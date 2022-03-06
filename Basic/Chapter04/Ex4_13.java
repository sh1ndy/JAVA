
public class Ex4_13 {

	public static void main(String[] args) {

		// i를 몇번을 더하면 sum 100이 넘을지
		int sum = 0;
		int count = 0;
		
		// count를 1씩 증가시켜서 sum에 계속 더해나간다.
		while (sum <= 100) {
			System.out.printf("%d - %d%n", sum, count);
			sum += ++count;
		}
		
	}

}
