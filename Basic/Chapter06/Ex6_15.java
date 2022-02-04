package ex15;

class Data {
	// 생성자가 하나도 없을 때는 컴파일러 자동 생성
	int value;
}

class Data2 {
	int value;
	
	// 기본 생성자 명시적 생성
	Data2() {
	}
	
	// 매개변수가 있는 생성자
	Data2(int x) {
		value = x;
	}
}

public class Ex6_15 {

	public static void main(String[] args) {
		
		Data d = new Data();
		Data2 d2 = new Data2(10);
		
		// compile error발생 : 기본 생성자가 존재하지않음
		// 기본 생성자를 사용할려면 하나의 생성자가 이미 존재하기 때문에 기본생성자를 명시적으로 작성해줘야함
//		Data2 dd2 = new Data2();	

	}

}
