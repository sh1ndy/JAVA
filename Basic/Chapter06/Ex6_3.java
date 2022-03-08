
class Card {
	// IV : 인스턴스 생성 후 사용 가능
	String kind;
	int number;
	
	// CV - 메모리에 올라가면 사용 가능 (인스턴스 생성 없이 사용 가능)
	static int width = 100;
	static int height = 250;
}

public class Ex6_3 {

	public static void main(String[] args) {
		
		// static 변수는 객체 생성 없이 사용 가능
		System.out.printf("Card.width = %d, Card.height = %d%n", Card.width, Card.height);
		
		// 참조변수 c1을 만들고 새로운 카드 객체생성 후 c1이 객체주소를 가르킨다.
		Card c1 = new Card();
		c1.kind = "Heart"; // c1 card객체에 속성 사용
		c1.number = 7; // c1 card객체에 속성 사용
		
		// 참조변수 c2을 만들고 새로운 카드 객체생성 후 c2가 객체주소를 가르킨다.
		Card c2 = new Card();
		c2.kind = "Spade";  // c2 card객체에 속성 사용
		c2.number = 5;  // c2 card객체에 속성 사용
		
		System.out.println("c1의 모양은 " + c1.kind + "이며, 번호는 " + c1.kind + "이고, (가로길이 : " + Card.width + ", 세로길이 : " + Card.height + ") 입니다.");
		System.out.println("c2의 모양은 " + c2.kind + "이며, 번호는 " + c2.kind + "이고, (가로길이 : " + Card.width + ", 세로길이 : " + Card.height + ") 입니다.");
		
		// c1의 가로세로 길이 변경 (80, 200)
		c1.width = 80;
		c1.height = 200;
		// c1 가로 세로를 변경하더라도 static 변수의 경우 모든 객체의 가로 세로 값이 변경된다.
		// 참조변수를 사용하는것 보다 클래스 명으로 공통이란것을 보여주는것이 좋다.
		System.out.println();
		System.out.println("c1의 가로 세로 변경 후");
		System.out.println("c1의 모양은 " + c1.kind + "이며, 번호는 " + c1.kind + "이고, (가로길이 : " + Card.width + ", 세로길이 : " + Card.height + ") 입니다.");
		System.out.println("c2의 모양은 " + c2.kind + "이며, 번호는 " + c2.kind + "이고, (가로길이 : " + Card.width + ", 세로길이 : " + Card.height + ") 입니다.");
		
		// 카드의 길이가 다시 원상 복구 되었습니다.
		System.out.println();
		Card.width = 100;
		Card.height = 250;
		System.out.println("카드 가로 세로 변경 후");
		System.out.println("c1의 모양은 " + c1.kind + "이며, 번호는 " + c1.kind + "이고, (가로길이 : " + Card.width + ", 세로길이 : " + Card.height + ") 입니다.");
		System.out.println("c2의 모양은 " + c2.kind + "이며, 번호는 " + c2.kind + "이고, (가로길이 : " + Card.width + ", 세로길이 : " + Card.height + ") 입니다.");

		
		
	}

}
