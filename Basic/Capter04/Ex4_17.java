
public class Ex4_17 {

	public static void main(String[] args) {

		// 0 ~ 10까지의 수 중에 3의 배수만 제외하고 출력해라.
		for (int i = 0; i <= 10; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
