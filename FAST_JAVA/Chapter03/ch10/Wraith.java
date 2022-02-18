package ch10;

public class Wraith extends Unit {

	public Wraith(String name) {
		super(name);
	}

	@Override
	public void skill() {
		System.out.println(name + "가 클로킹 하였습니다.");
	}
	
}
