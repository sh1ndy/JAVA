package ch10;

public abstract class Unit {
	
	protected String name;
	
	public Unit(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void move() {
		System.out.println(name + "이/가 움직입니다.");
	}
	
	public void attack() {
		System.out.println(name + "이/가 공격을 합니다.");
	}
	
	public void stop() {
		System.out.println(name + "이/가 멈춥니다.");
	}
	
	public abstract void skill();
	
	final public void action() {
		move();
		attack();
		skill();
		stop();
		System.out.println("=================");
	}

}
