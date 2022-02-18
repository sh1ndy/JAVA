package ch03;

public class VIPCustomer extends Customer {
	
	private String agentId;
	double salesRatio;
	
	public VIPCustomer(int customerNum, String customerName) {
		super(customerNum, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) Call");
	}
	
	
	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	

}
