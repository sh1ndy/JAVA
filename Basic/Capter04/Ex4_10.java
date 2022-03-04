
public class Ex4_10 {

	public static void main(String[] args) {

		// 반복문을 통한 1 ~ 10까지의 총합을 계산
		// 몇번째 수까지를  더했을 때 total이 30 넘는지 찾아냄
		
		int total = 0;
		int count = 0;
		
		for (int i = 0; i <= 10; i++) {
			total += i;
			
			if (total <= 30) {
				count++;
			}
		}
		System.out.println("총 합 : " + total);
		System.out.println("카운트 : " + count);
		
	}

}
