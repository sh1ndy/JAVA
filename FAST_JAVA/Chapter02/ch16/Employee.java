package ch16;

public class Employee {
	
	static int serialNum = 1000;
	
	private String name;
	private int number;
	
	Employee(String name) {
		this.name = name;
		serialNum++;
		number = serialNum;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	

}
