package ch08;

public class Animal {
	
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}

}

class Human extends Animal {
	
	@Override
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal {
	
	@Override
	public void move() {
		System.out.println("ȣ���̴� �׹߷� �ݴϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̴� ����� �մϴ�.");
	}
}

class Eagle extends Animal {
	
	@Override
	public void move() {
		System.out.println("�������� �ϴ��� ���ƴٴմϴ�.");
	}
	
	public void flaying() {
		System.out.println("�������� �� ������ ��� �ϴ÷� ���ƿö����ϴ�.");
	}
}

