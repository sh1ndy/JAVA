
public class Ex4_7 {

	public static void main(String[] args) {

		int num = 0;
		
		// {} 블럭 안의 내용을 20번 반복한다.
		// Quiz. 1 ~ 10사이의 난수를 20개 출력하시오.
//		for (int i = 0; i < 20; i++) {
//			num = (int)(Math.random() * 10) + 1;
//			System.out.println(i + 1 + "번의 난수 : " + num);
//		}
		
		// Quiz. -5 ~ 5사이의 난수를 20개 출력하시오.
		for (int i = 0; i < 20; i++) {
			num = (int)(Math.random() * 11) -5;
			System.out.println(num);
		}
		
	}

}
