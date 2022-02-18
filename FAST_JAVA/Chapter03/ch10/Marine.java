package ch10;

public class Marine extends Unit {

	public Marine(String name) {
		super(name);
	}

	@Override
	public void skill() {
		System.out.println(name + "스팀팩을 스킬을 사용하였습니다.");
	}

}
