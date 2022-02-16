package ch21;

public class BreakTest {

	public static void main(String[] args) {
		// 1 ~ n 까지 더할때 100이 넘는 수를 구하고 그 총 합을 구함
		int sum = 0;
		int num = 1;
		
		// 조건식을 for문안에서 작성
		for (num = 1; ; num++) {
			sum += num;
			// 만약에 sum 이 100보다 크거나 같으면 
			if (sum >= 100) {
				// 조건문을 탈출해라
				break;
			}
		}
		
		System.out.println(sum);
		System.out.println(num);
		
		
	}

}
