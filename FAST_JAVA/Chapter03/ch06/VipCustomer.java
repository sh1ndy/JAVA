package ch06;

public class VipCustomer extends Customer {
	
	private String agentId;
	
	public VipCustomer() {
		
	}
	
	public VipCustomer(String customerName, int customerId) {
		super(customerName, customerId);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	@Override
	public int CalcPrice(int price) {
		bonusPoint = (int) (price * bonusRatio);
		price -= (int) (price * salesRatio);
		return price;
	}
	
	public String getAgentId() {
		return agentId;
	}
	
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	
}
