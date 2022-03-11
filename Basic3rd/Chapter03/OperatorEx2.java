
public class OperatorEx2 {

	public static void main(String[] args) {

		int i = 5;
		int j = 0;
		
		j = i++; // 후위형 값이 먼저 대입되고 난 후 증가 
		System.out.println("j = i++; 실행 후, i = " + i + ", j = " + j);
		
		i = 5;
		j = 0;
		
		j = ++i; // 전위형 증가 먼저 되고 값에 대
		System.out.println("j = ++i; 실행 후, i = " + i + ", j = " + j);
		
	}

}
