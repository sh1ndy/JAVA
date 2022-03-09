import java.util.Objects;

class Person {
	long id;
	
	Person(long id) {
		this.id = id;
	}
	
	public int hashCode() {
		return Objects.hash(id);
	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) return false;
		
		Person p = (Person) obj;
		return this.id == p.id;
	}
	
	
}
public class Ex9_2 {

	public static void main(String[] args) {

		Person p1 = new Person(8812121112412L);
		Person p2 = new Person(8812121112412L);
		
		if (p1.equals(p2)) {
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
			System.out.println(p1.hashCode());
			System.out.println(p2.hashCode());
		} else {
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
			System.out.println(p1.hashCode());
			System.out.println(p2.hashCode());
		}
		
	}

}
