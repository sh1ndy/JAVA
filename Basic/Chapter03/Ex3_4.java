
public class Ex3_4 {

	public static void main(String[] args) {

		int i = -10;
		i = i;
		System.out.println(i);
		
		i = -i;
		System.out.println(i);
		
		double d = 85.4;
		int score = (int) d;
		System.out.println(d); // d의 값이 변경되지는 않음
		System.out.println(score); // d의 값을 들고와서 score값에 값을 새로 저장
		
		
	}

}
