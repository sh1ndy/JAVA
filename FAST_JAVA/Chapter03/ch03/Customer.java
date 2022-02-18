package ch03;

public class Customer {
	
	protected int customerNum;
	protected String customerName;
	protected String customerGrade;
	
	int bonusPoint;
	double bonusRatio;
	
	public Customer(int customerNum, String customerName) {
		this.customerNum = customerNum;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer(int, String) Call");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusPoint;
		return price;
	}

	public int getCustomerNum() {
		return customerNum;
	}

	public void setCustomerNum(int customerNum) {
		this.customerNum = customerNum;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade +"이며, 보너스 포인트는 " + bonusPoint + "점 입니다.";
	}
	
	

}
