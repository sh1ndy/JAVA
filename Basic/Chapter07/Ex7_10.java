package ex10;

abstract class Unit {
	int x;
	int y;

	abstract void move(int x, int y);

	void stop() {
		System.out.println("병력을 멈춥니다.");
	}
}

class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("Marin[x: " + x + ", y: " + y + "]");
	}

	void stimpack() {
		System.out.println("공격속도 증가");
	}
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("Tank[x: " + x + ", y: " + y + "]");
	}

	void sizemode() {
		System.out.println("사정거리 증가, 공격력 증가");
	}
}

class Dropship extends Unit {
	void move(int x, int y) {
		System.out.println("Dropship[x: " + x + ", y: " + y + "]");
	}

	void load() {
		System.out.println("병력을 태웁니다.");
	}

	void unLoad() {
		System.out.println("병력을 내립니다.");
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
