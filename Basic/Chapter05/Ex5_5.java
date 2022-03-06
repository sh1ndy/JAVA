import java.util.Arrays;

public class Ex5_5 {

	public static void main(String[] args) {

		// 로또 번호 추출
		int[] balls = new int[45];
		
		// 1 ~ 45 수로 배열을 순차대로 초기화한다.
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		}
		
		// 배열안에 있는 수를 난수 를 이용해서 섞는다.
		for (int i = 0; i < 6; i++) {
			int n = (int) (Math.random() * 45);
			int tmp = balls[i];
			balls[i] = balls[n];
			balls[n] = tmp;
		}
		
		// 6개만 출력한다.
		for (int i = 0; i < 6; i++) {
			System.out.println("balls[" + (i + 1) + "] = " + balls[i]);
		}
		
	}

}
