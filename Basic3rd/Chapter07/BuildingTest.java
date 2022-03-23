package day0323;

interface Repairable2 {
	
}

interface Liftable {
	// �ǹ��� ��� �ø���.
	void liftOff();
	// �ǹ��� �̵��Ѵ�.
	void liftMove(int x, int y);
	// �ǹ��� ������Ų��.
	void liftStop();
	// �ǹ��� ������Ų��.
	void liftland();
}

class LiftableImpl implements Liftable {

	@Override
	public void liftOff() {
		System.out.println("�ǹ��� ���÷Ƚ��ϴ�.");
	}

	@Override
	public void liftMove(int x, int y) {
		System.out.println("[" + x + ", " + y + "] ��ŭ �̵����׽��ϴ�.");		
	}

	@Override
	public void liftStop() {
		System.out.println("�̵��� ������ϴ�.");
	}

	@Override
	public void liftland() {
		System.out.println("�ǹ��� �������ֽ��ϴ�.");
	}
	
}

class Building {
	int currentHP;   // ���� HP
	final int MAX_HP; // �ִ� HP
	
	Building(int currentHP) {
		MAX_HP = currentHP; // �ִ� HP�� �����Ҷ� HP
	}
}

class Bunker extends Building implements Repairable2 {

	Bunker() {
		super(100);
	}
	
	public String toString() {
		return "Bunker";
	}
}

class Arcademy extends Building implements Repairable2 {
	
	Arcademy() {
		super(500);
	}
	
	public String toString() {
		return "Arcademy";
	}
}

class Barruck extends Building implements Repairable2, Liftable {
	
	LiftableImpl l = new LiftableImpl();
	
	Barruck() {
		super(1500);
	}
	
	public String toString() {
		return "Barruck";
	}

	@Override
	public void liftOff() {
		l.liftOff();
	}

	@Override
	public void liftMove(int x, int y) {
		l.liftMove(x, y);
	}

	@Override
	public void liftStop() {
		l.liftStop();
	}

	@Override
	public void liftland() {
		l.liftland();
	}
	
	
}

class Factory extends Building implements Repairable2, Liftable {
	
	LiftableImpl l = new LiftableImpl();
	
	Factory() {
		super(2000);
	}
	
	public String toString() {
		return "Factory";
	}

	@Override
	public void liftOff() {
		l.liftOff();
	}

	@Override
	public void liftMove(int x, int y) {
		l.liftMove(x, y);
	}

	@Override
	public void liftStop() {
		l.liftStop();
	}

	@Override
	public void liftland() {
		l.liftland();
	}
	
}

class Scv2 {
	void repair(Repairable2 r) {
		if (r instanceof Building) {
			Building b = (Building) r;
			
			while (b.currentHP != b.MAX_HP) {
				b.currentHP++;
			}
			System.out.println(r.toString() + "�� ���� �Ϸ��Ͽ����ϴ�.");
		}
	}
}



public class BuildingTest {

	public static void main(String[] args) {

		Scv2 scv = new Scv2();
		
		Arcademy arcademy = new Arcademy();
		Bunker bunker = new Bunker();
		Barruck barruck = new Barruck();
		Factory factory = new Factory();
		
		scv.repair(arcademy);
		scv.repair(bunker);
		scv.repair(barruck);
		scv.repair(factory);
		System.out.println();
		barruck.liftOff();
		barruck.liftMove(100, 40);
		barruck.liftStop();
		barruck.liftland();
	}

}
