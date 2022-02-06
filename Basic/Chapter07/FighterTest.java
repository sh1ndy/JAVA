abstract class Unit {
	int x;
	int y;

	abstract void move(int x, int y);

	void stop() {
		System.out.println("����ϴ�.");
	}
}

interface Fightable { // �������̽��� ��� �޼���� public abstract. ���� ����
	void move(int x, int y); // public abstract ����

	void attack(Fightable f); // public abstract ����
}

class Fighter extends Unit implements Fightable {
	// �������̵� ��Ģ: ����(public)���� ���������� ������ ������ �ȵȴ�.
	public void move(int x, int y) {
		System.out.println("[" + x + "," + y + "]");
	}

	public void attack(Fightable f) {
		System.out.println(f + "�� ����");
	}

	// �ο� �� �ִ� ��븦 �ҷ��´�.
	Fightable getFightable() { // ���� Ÿ���� Fightable �� ���� Fightable�� ������ ��ü�� ��ȯ�Ѵ�.
		Fighter f = new Fighter(); // Fighter�� �����ؼ� ��ȯ
		return f;
	}
}

public class FighterTest {

	public static void main(String[] args) {

		Fighter f = new Fighter();
		Fightable fe = f.getFightable();

		f.move(10, 20);
		f.attack(new Fighter());

		Unit u = new Fighter();
		u.stop();
		u.move(30, 40);
//		u.attack(new Fighter);	// Unit���� attack()�� ��� ȣ�� �Ұ�

		Fightable f2 = new Fighter();
		f2.move(50, 60);
		f2.attack(new Fighter());
//		f2.stop();			// Fightable���� stop()�� ��� ȣ�� �Ұ�

	}

}
