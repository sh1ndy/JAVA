package ch10;

public class Marine extends Unit {

	public Marine(String name) {
		super(name);
	}

	@Override
	public void skill() {
		System.out.println(name + "�������� ��ų�� ����Ͽ����ϴ�.");
	}

}
