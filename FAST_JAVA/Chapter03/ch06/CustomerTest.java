package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<>();

		Customer customerT = new Customer("Tomas", 10010);
		Customer customerE = new Customer("Edward", 10020);
		Customer customerB = new GoldCustomer("Bob", 10030);
		Customer customerP = new GoldCustomer("Peris", 10040);
		Customer customerJ = new VipCustomer("James", 10050);
		
		customerList.add(customerT);
		customerList.add(customerE);
		customerList.add(customerB);
		customerList.add(customerP);
		customerList.add(customerJ);
		
		int price = 10000;
//		for (Customer c : customerList) {
//			System.out.println(c.showCustomerInfo());
//		}
//		
//		for (Customer c : customerList) {
//			int cost = c.CalcPrice(price);
//			System.out.println(c.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
//			System.out.println(c.getCustomerName() + "님의 현재 보너스 포인트는 " + c.bonusPoint + "점 입니다.");
//		}
//		
		for (int i = 0; i < customerList.size(); i++) {
			int cost = customerList.get(i).CalcPrice(price);
			System.out.println(customerList.get(i).getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customerList.get(i).getCustomerName() + "님의 현재 보너스 포인트는 " + customerList.get(i).bonusPoint + "점 입니다.");
		}
		
	}

}
