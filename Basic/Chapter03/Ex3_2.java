
public class Ex3_2 {

	public static void main(String[] args) {
		int i = 5;
		int j = 0;

		// 후위형
		j = i;
		i++;
		System.out.println("j = i++; 실행 후, i =" + i + ", j = " + j);
		
		// 겶과 비교를 위한 i와 j값 다시 초기화
		i = 5;
		j = 0;
		
		// 전위형
		++i;
		j = i;
		System.out.println("j = ++i; 실행 후, i =" + i + ", j = " + j);
		
	}

}
