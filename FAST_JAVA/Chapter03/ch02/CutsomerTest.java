package ch02;

public class CutsomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer();
		customerLee.setCustomerName("Lee");
		customerLee.setCustomerId("10001");
		customerLee.bonusPoint = 1000;
		String result = customerLee.customerShowInfo();
		System.out.println(result);
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("Kim");
		customerKim.setCustomerId("10002");
		customerKim.bonusPoint = 10000;
		String VipResult = customerKim.customerShowInfo();
		System.out.println(VipResult);
		
	}

}
