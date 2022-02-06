abstract class StarCraftUnit {
	int name;
	int hp;

	abstract void move(int x, int y);

	void stop() {
		System.out.println("������ϴ�.");
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
		System.out.println("scv�� " + r + "�� ü���� ���ƽ��ϴ�.");
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
		System.out.println("scv�� " + r + "�� ü���� ���ƽ��ϴ�.");
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
		System.out.println("scv�� " + r + "�� ü���� ���ƽ��ϴ�.");
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

		scv.repair(scv); // repair()�� repairable�� ������ Ŭ������ �Ű������� ��� ����
//		scv.repair(marine);		// marine�� repairable�� ���� �ϰ� ���� �ʾƼ� ��ĥ �� ����.
		scv.repair(tank); // repair()�� repairable�� ������ Ŭ������ �Ű������� ��� ����
		scv.repair(dropship); // repair()�� repairable�� ������ Ŭ������ �Ű������� ��� ����

	}

}
