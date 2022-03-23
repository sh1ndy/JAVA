package day0323;

class Unit {
	int currentHP; 	// ������ ü��
	int x; 			// ������ ��ġ(x��ǥ)
	int y ; 		// ������ ��ġ(y��ǥ) 
}

interface Moveable {
	void move(int x, int y);
}

interface Attackable {
	void attack(Unit u);
}

interface Fightable extends Moveable, Attackable {
	
}

class Fighter extends Unit implements Fightable {

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		
	}
	
	
}

public class FighterTest {

	public static void main(String[] args) {

		Fighter f = new Fighter();
		
		if (f instanceof Unit) {
			System.out.println("f�� UnitŬ������ �ڼ��Դϴ�.");
		}
		
		if (f instanceof Fightable) {
			System.out.println("f�� Fightable�������̽��� �����߽��ϴ�.");
		}
		
		if (f instanceof Moveable) {
			System.out.println("f�� Moveable�������̽��� �����߽��ϴ�.");
		}
		
		if (f instanceof Attackable) {
			System.out.println("f�� Attackable�������̽��� �����߽��ϴ�.");
		}
		
		if (f instanceof Object) {
			System.out.println("f�� ObjectŬ������ �ڼ��Դϴ�.");
		}
		
	}

}
