abstract class Unit2 {
	int x;
	int y;
	
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다.");}
}

interface Fightable {
	void move(int x, int y);
	void attack(Fightable f);
}

class Fighter extends Unit2 implements Fightable {

	@Override
	public void attack(Fightable f) {
		System.out.println(f + "를 공격했습니다.");
	}

	@Override
	public void move(int x, int y) {
		System.out.println("[" + x + "," + y + "] 로 이동");
	}
	
	Fightable getFightable() {
		Fighter f = new Fighter();
		return f;
	}
	
}


public class FighterTest {

	public static void main(String[] args) {

		Fighter f = new Fighter();
		Fightable f2 = f.getFightable();
		f2.attack(f2);
		f.attack(new Fighter());
		f.move(100, 200);
		
	}

}
