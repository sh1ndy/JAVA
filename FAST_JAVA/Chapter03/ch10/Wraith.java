package ch10;

public class Wraith extends Unit {

	public Wraith(String name) {
		super(name);
	}

	@Override
	public void skill() {
		System.out.println(name + "�� Ŭ��ŷ �Ͽ����ϴ�.");
	}
	
}
