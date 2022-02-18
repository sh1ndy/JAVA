package ch02;

public class Customer {

	protected String CustomerName;
	protected String CustomerGrade;
	protected String customerId;

	int bonusPoint;

	Customer() {
		CustomerGrade = "SILVER";
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getCustomerGrade() {
		return CustomerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		CustomerGrade = customerGrade;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	public String customerShowInfo() {
		return CustomerName + "님의 등급은 " + CustomerGrade + " 이고, 보너스포인트는 " + bonusPoint + "점 입니다.";
	}

}
