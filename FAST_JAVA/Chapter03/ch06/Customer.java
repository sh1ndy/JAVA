package ch06;

public class Customer {

	private String customerName;
	protected String customerGrade;
	private int customerId;

	int bonusPoint;
	double bonusRatio;
	double salesRatio;
	
	public Customer() {

	}

	public Customer(String customerName, int customerId) {
		this.customerName = customerName;
		this.customerId = customerId;

		customerGrade = "SILVER";
		bonusRatio = 0.01;

	}
	
	public int CalcPrice(int price) {
		bonusPoint = (int) (price * bonusRatio);
		return price;
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

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "점 입니다.";
	}

}
