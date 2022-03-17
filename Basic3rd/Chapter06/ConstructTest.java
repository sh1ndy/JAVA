package exConstructor;

class Data1 {
	int value;
}

class Data2 {
	int value;
	
	Data2(int x) { // 매개변수가 있는 생성자
		value = x;
	}
}

public class ConstructTest {

	public static void main(String[] args) {

		Data1 d1 = new Data1(); // 컴파일러가 기본생성자 만들어줌.
//		Data2 d2 = new Data2(); // 하나의 생성자가 존재하기 때문에 해당 기본생성자를 찾을 수 없어서 컴파일 에러가 뜸.
		Data2 d2 = new Data2(10); // 매개변수를 가지고있는 생성자가 존재하기 때문에 에러가 발생하지 않음
		
		
	}

}
