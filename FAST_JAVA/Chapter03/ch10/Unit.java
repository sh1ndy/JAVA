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
		System.out.println(name + "��/�� �����Դϴ�.");
	}
	
	public void attack() {
		System.out.println(name + "��/�� ������ �մϴ�.");
	}
	
	public void stop() {
		System.out.println(name + "��/�� ����ϴ�.");
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
