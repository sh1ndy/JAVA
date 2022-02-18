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
//			System.out.println(c.getCustomerName() + "���� " + cost + "�� �����ϼ̽��ϴ�.");
//			System.out.println(c.getCustomerName() + "���� ���� ���ʽ� ����Ʈ�� " + c.bonusPoint + "�� �Դϴ�.");
//		}
//		
		for (int i = 0; i < customerList.size(); i++) {
			int cost = customerList.get(i).CalcPrice(price);
			System.out.println(customerList.get(i).getCustomerName() + "���� " + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customerList.get(i).getCustomerName() + "���� ���� ���ʽ� ����Ʈ�� " + customerList.get(i).bonusPoint + "�� �Դϴ�.");
		}
		
	}

}
