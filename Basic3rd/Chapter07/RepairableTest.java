package day0323;

interface Repairable {
	
}

class Unit2 {
	int hitPoint;
	final int MAX_HP;
	
	Unit2(int hp) {
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit2 {

	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit2 {

	AirUnit(int hp) {
		super(hp);
	}
	
}

class Tank extends GroundUnit implements Repairable {

	Tank() {
		super(150); // 탱크의 HP는 150이다.
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable {

	Dropship() {
		super(125); // 드랍쉽의 HP는 125이다.
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Dropship";
	}
}

class Marine extends GroundUnit {

	Marine() {
		super(40); // 마린의 HP는 40이다.
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Marine";
	}
}

class Scv extends GroundUnit implements Repairable {
	
	Scv() {
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		if (r instanceof Unit2) {
			Unit2 u = (Unit2) r;
			
			while (u.hitPoint != u.MAX_HP) {
				// Unit의 HP를 증가한다.
				u.hitPoint++;
			}
			
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}
}

public class RepairableTest {

	public static void main(String[] args) {

		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		Scv scv = new Scv();
		
		scv.repair(tank); // SCV가 Tank를 수리하도록 한다.
		scv.repair(dropship);
//		scv.repair(marine); // 에러!. marine은 Repairable을 구현하고 있지 않기 떄문에
		
	}

}
