package ch15;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("Customer Sell!!");
	}

	@Override
	public void buy() {
		System.out.println("Customer Sell!!!");
	}
	
	@Override
	public void order() {
		System.out.println("customer Order!!!");
	}

}
