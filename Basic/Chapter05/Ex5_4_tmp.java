
public class Ex5_4_tmp {

	public static void main(String[] args) {

		String[] strArr = { "가위", "바위", "보" };
		
		for (int i = 0; i < 10; i++) {
			int n = (int) (Math.random() * 3);
			System.out.println(strArr[n]);
		}
		
	}

}
