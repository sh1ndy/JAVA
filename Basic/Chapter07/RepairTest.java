abstract class StarCraftUnit {
	int name;
	int hp;

	abstract void move(int x, int y);

	void stop() {
		System.out.println("멈췄습니다.");
	}
}

interface Repairable {
	void repair(Repairable r);
}

class Scv extends StarCraftUnit implements Repairable {
	void move(int x, int y) {
		System.out.println("[" + x + ", " + y + "]");
	}

	public void repair(Repairable r) {
		System.out.println("scv가 " + r + "를 체력을 고쳤습니다.");
	}

	public String toString() {
		return "Scv";
	}
}

class Marine extends StarCraftUnit {
	void move(int x, int y) {
		System.out.println("[" + x + ", " + y + "]");
	}

	public String toString() {
		return "Marine";
	}
}

class Tank extends StarCraftUnit implements Repairable {
	void move(int x, int y) {
		System.out.println("[" + x + ", " + y + "]");
	}

	public void repair(Repairable r) {
		System.out.println("scv가 " + r + "를 체력을 고쳤습니다.");
	}

	public String toString() {
		return "Tank";
	}
}

class Dropship extends StarCraftUnit implements Repairable {
	void move(int x, int y) {
		System.out.println("[" + x + ", " + y + "]");
	}

	public void repair(Repairable r) {
		System.out.println("scv가 " + r + "를 체력을 고쳤습니다.");
	}

	public String toString() {
		return "Dropship";
	}
}

public class RepairTest {

	public static void main(String[] args) {

		Scv scv = new Scv();
		Marine marine = new Marine();
		Tank tank = new Tank();
		Dropship dropship = new Dropship();

		scv.repair(scv); // repair()는 repairable을 구현한 클래스만 매개변수로 사용 가능
//		scv.repair(marine);		// marine은 repairable를 구현 하고 있지 않아서 고칠 수 없음.
		scv.repair(tank); // repair()는 repairable을 구현한 클래스만 매개변수로 사용 가능
		scv.repair(dropship); // repair()는 repairable을 구현한 클래스만 매개변수로 사용 가능

	}

}
