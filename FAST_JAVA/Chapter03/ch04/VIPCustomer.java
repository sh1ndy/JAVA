package ch04;

public class VIPCustomer extends Customer {
	
	private String agentId;
	double salesRatio;
	
	public VIPCustomer(int customerNum, String customerName) {
		super(customerNum, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}
	
	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	

}
