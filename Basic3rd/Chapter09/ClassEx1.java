package study0329;

class Card {
	String kind;
	int num;
	
	Card() {
		this("SPADE", 1);
	}
	
	Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	
	@Override
	public String toString() {
		return kind + " : " + num;
	}
}

public class ClassEx1 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {

		Card c = new Card("HEART", 3); // new �����ڷ� ��ü ����
		Card c2 = Card.class.newInstance(); // Class��ü�� ���ؼ� ��ü ����
		
		Class cObj = c.getClass();
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());
		
	}

}
