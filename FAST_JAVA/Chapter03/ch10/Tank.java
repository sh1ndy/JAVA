package ch10;

public class Tank extends Unit {

	public Tank(String name) {
		super(name);
	}

	@Override
	public void skill() {
		System.out.println(name + "�� ������ �Ͽ����ϴ�.");
		
	}

}
