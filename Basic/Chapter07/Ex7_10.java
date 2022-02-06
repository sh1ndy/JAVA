package ex10;

abstract class Unit {
	int x;
	int y;

	abstract void move(int x, int y);

	void stop() {
		System.out.println("������ ����ϴ�.");
	}
}

class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("Marin[x: " + x + ", y: " + y + "]");
	}

	void stimpack() {
		System.out.println("���ݼӵ� ����");
	}
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("Tank[x: " + x + ", y: " + y + "]");
	}

	void sizemode() {
		System.out.println("�����Ÿ� ����, ���ݷ� ����");
	}
}

class Dropship extends Unit {
	void move(int x, int y) {
		System.out.println("Dropship[x: " + x + ", y: " + y + "]");
	}

	void load() {
		System.out.println("������ �¿�ϴ�.");
	}

	void unLoad() {
		System.out.println("������ �����ϴ�.");
	}
}

public class Ex7_10 {

	public static void main(String[] args) {

		Unit[] u = { new Marine(), new Tank(), new Dropship() };

		for (int i = 0; i < u.length; i++) {
			u[i].move(100, 200);
		}

	}

}
