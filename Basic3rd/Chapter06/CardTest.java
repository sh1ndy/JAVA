package exCard;

public class CardTest {

	public static void main(String[] args) {

		// cv의 경우 객체생성 없이도 클래스이름으로 직접 사용가능하다.
		System.out.println("Card.WIDTH = " + Card.WIDTH);
		System.out.println("Card.HEIGHT = " + Card.HEIGHT);
		
		Card c1 = new Card();
		c1.kind = "HEART";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "SPACE";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + Card.WIDTH + ", " + Card.HEIGHT + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + Card.WIDTH + ", " + Card.HEIGHT + ")");
		
//		c1.WIDTH = 50; // 에러나지는 않지만 혼동을 줄 수있어서 안좋은 코드
		Card.WIDTH = 50; // WIDTH는 cv이므로 클래스명으로 사용하는것이 적절함
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + Card.WIDTH + ", " + Card.HEIGHT + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + Card.WIDTH + ", " + Card.HEIGHT + ")");
		
	}

}
