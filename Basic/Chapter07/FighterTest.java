abstract class Unit {
	int x;
	int y;

	abstract void move(int x, int y);

	void stop() {
		System.out.println("멈춥니다.");
	}
}

interface Fightable { // 인터페이스의 모든 메서드는 public abstract. 예외 없이
	void move(int x, int y); // public abstract 생략

	void attack(Fightable f); // public abstract 생략
}

class Fighter extends Unit implements Fightable {
	// 오버라이딩 규칙: 조상(public)보다 접근제어자 범위가 좁으면 안된다.
	public void move(int x, int y) {
		System.out.println("[" + x + "," + y + "]");
	}

	public void attack(Fightable f) {
		System.out.println(f + "를 공격");
	}

	// 싸울 수 있는 상대를 불러온다.
	Fightable getFightable() { // 리턴 타입이 Fightable 일 때는 Fightable을 구현한 객체를 반환한다.
		Fighter f = new Fighter(); // Fighter를 생성해서 반환
		return f;
	}
}

public class FighterTest {

	public static void main(String[] args) {

		Fighter f = new Fighter();
		Fightable fe = f.getFightable();

		f.move(10, 20);
		f.attack(new Fighter());

		Unit u = new Fighter();
		u.stop();
		u.move(30, 40);
//		u.attack(new Fighter);	// Unit에는 attack()이 없어서 호출 불가

		Fightable f2 = new Fighter();
		f2.move(50, 60);
		f2.attack(new Fighter());
//		f2.stop();			// Fightable에는 stop()이 없어서 호출 불가

	}

}
