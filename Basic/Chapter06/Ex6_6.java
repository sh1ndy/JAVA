package ex06;

class Card {
	static int width = 150;
	static int height = 200;
	
	String kind;
	int number;
}

public class Ex6_6 {

	public static void main(String[] args) {
		
		// CV : 객체 생성 없이 바로 사용 가능
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		// IV : 객체를 생성해야지만 사용 가능
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 4;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 8;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ") 입니다.");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ") 입니다.");
		System.out.println("카드의 크기 폭과 넓이가 수정되었습니다.");
		
		// cv(공통, 공유)의 경우 앞에 객체의 이름으로 사용하는 것이 Best
		Card.width = 100;
		Card.height = 170;
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ") 입니다.");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ") 입니다.");
		
	}

}
