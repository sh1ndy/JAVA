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
		super(150); // ��ũ�� HP�� 150�̴�.
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable {

	Dropship() {
		super(125); // ������� HP�� 125�̴�.
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Dropship";
	}
}

class Marine extends GroundUnit {

	Marine() {
		super(40); // ������ HP�� 40�̴�.
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
				// Unit�� HP�� �����Ѵ�.
				u.hitPoint++;
			}
			
			System.out.println(u.toString() + "�� ������ �������ϴ�.");
		}
	}
}

public class RepairableTest {

	public static void main(String[] args) {

		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		Scv scv = new Scv();
		
		scv.repair(tank); // SCV�� Tank�� �����ϵ��� �Ѵ�.
		scv.repair(dropship);
//		scv.repair(marine); // ����!. marine�� Repairable�� �����ϰ� ���� �ʱ� ������
		
	}

}
