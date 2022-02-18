package ch10;

public class Tank extends Unit {

	public Tank(String name) {
		super(name);
	}

	@Override
	public void skill() {
		System.out.println(name + "가 시즈모드 하였습니다.");
		
	}

}
