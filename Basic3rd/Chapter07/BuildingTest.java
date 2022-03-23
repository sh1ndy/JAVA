package day0323;

interface Repairable2 {
	
}

interface Liftable {
	// 건물을 들어 올린다.
	void liftOff();
	// 건물을 이동한다.
	void liftMove(int x, int y);
	// 건물을 정지시킨다.
	void liftStop();
	// 건물을 착륙시킨다.
	void liftland();
}

class LiftableImpl implements Liftable {

	@Override
	public void liftOff() {
		System.out.println("건물을 들어올렸습니다.");
	}

	@Override
	public void liftMove(int x, int y) {
		System.out.println("[" + x + ", " + y + "] 만큼 이동시켰습니다.");		
	}

	@Override
	public void liftStop() {
		System.out.println("이동을 멈췄습니다.");
	}

	@Override
	public void liftland() {
		System.out.println("건물을 착륙시켯습니다.");
	}
	
}

class Building {
	int currentHP;   // 현재 HP
	final int MAX_HP; // 최대 HP
	
	Building(int currentHP) {
		MAX_HP = currentHP; // 최대 HP는 생성할때 HP
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
			System.out.println(r.toString() + "을 수리 완료하였습니다.");
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
