abstract class Unit {
	abstract void move(int x, int y);
	
	void stop() {
		System.out.println("���� ��ġ���� ����ϴ�.");
	}
}

class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("Marine[x = " + x + ", y = " + y + "]�� �̵�");
	}
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("Tank[x = " + x + ", y = " + y + "]�� �̵�");
	}
}

class Dropship extends Unit {
	void move(int x, int y) {
		System.out.println("Dropship[x = " + x + ", y = " + y + "]�� �̵�");
	}
}



public class Ex7_10 {

	public static void main(String[] args) {

		Unit[] group = {new Marine(), new Tank(), new Dropship()};
		
		for (int i = 0; i < group.length; i++) {
			group[i].move(100, 150);
		}
		
	}

}
