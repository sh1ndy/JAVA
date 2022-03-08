class Data1 {
	int value;
	
	// 생성자가 하나도 없으면 컴파일러가 자동으로 만들어줌
}

class Data2 {
	int value;
	
	// 생성자가 하나이상 있을 경우 기본생성자는 직접 생성해줘야한다.
	Data2() {
		
	}
	
	// 매개변수가 있는 생성자 
	Data2(int x) {
		value = x;
	}
}

public class Ex6_11 {

	public static void main(String[] args) {

		Data1 d1 = new Data1();
		Data2 d2 = new Data2();
		
	}

}
