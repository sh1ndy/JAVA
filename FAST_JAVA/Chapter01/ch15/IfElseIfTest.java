package ch15;

public class IfElseIfTest {

	public static void main(String[] args) {

		int age = 12;
		int charge;
		
		if (age < 8) {
			charge = 1000;
			System.out.println("미 취학 아동힙니다.");
		} else if (age < 14) {
			charge = 1500;
			System.out.println("초등학생 입니다.");
		} else if (age < 20) {
			charge = 2000;
			System.out.println("중,고등학생 입니다.");
		} else {
			charge = 3000;
			System.out.println("성인입니다.");
		}
		System.out.println("요금은 " + charge + "원 입니다.");
		
	}

}
