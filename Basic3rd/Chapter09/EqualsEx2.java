
class Person {
	long id;
	
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			return id == ((Person) obj).id; // obj�� ObjectŸ���̹Ƿ� id���� �����ϱ� ���ؼ��� PersonŸ������ ����ȯ�� �ʿ��ϴ�.
		} else {
			return false; // Ÿ���� Person�� �ƴϸ� ���� ���� �ʿ䵵 ����.
		}
	}
}

public class EqualsEx2 {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		if (p1 == p2) {
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		} else {
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
		}
		
		if (p1.equals(p2)) {
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		} else {
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
		}

	}

}
