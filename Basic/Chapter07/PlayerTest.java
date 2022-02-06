
abstract class Player { // �߻� Ŭ���� (�̿ϼ� Ŭ����, �̿ϼ� ���赵)
	abstract void play(int pos); // �߻� �޼���(�̿ϼ� �޼���)

	abstract void stop(); // �߻� �޼���(����θ� �ְ� ������{}�� ���� �޼���);
}

// �߻� Ŭ������ ����� ���� �ϼ��ؾ� ��ü ���� ����
class AudioPlayer extends Player {
	void play(int pos) {
		System.out.println(pos + "���� ����� �����մϴ�.");
	}

	void stop() {
		System.out.println("����� ����ϴ�.");
	}
}

public class PlayerTest {

	public static void main(String[] args) {

//		Player p = new Player();	// �߻�Ŭ������ ��ü�� ����
		AudioPlayer ap = new AudioPlayer();
		Player p = new AudioPlayer(); // ������

		p.play(50);
		p.stop();

	}

}
