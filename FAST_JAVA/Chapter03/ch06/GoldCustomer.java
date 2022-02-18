package ch06;

public class GoldCustomer extends Customer {
	
	public GoldCustomer() {
		
	}
	
	public GoldCustomer(String customerName, int customerId) {
		super(customerName, customerId);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;
	}
	
	@Override
	public int CalcPrice(int price) {
		bonusPoint = (int) (price * bonusRatio);
		price -= (int) (price * salesRatio);
		return price;
	}
	
}
