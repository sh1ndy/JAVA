package ch08;

public class Delivery {

	long orderNumber;
	long phoneNumber;
	String address;
	String date;
	String time;
	int price;
	String menuNumber;
	
	Delivery() {
		
	}
	
	Delivery(long orderNumber, long phoneNumber, String address, String date, String time, int price, String menuNumber) {
		this.orderNumber = orderNumber;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.date = date;
		this.time = time;
		this.price = price;
		this.menuNumber = menuNumber;
	}
	
	void deliveryInfo() {
		System.out.println("�ֹ� ���� ��ȣ : " + orderNumber);
		System.out.println("�ֹ� �ڵ��� ��ȣ : " + phoneNumber);
		System.out.println("�ֹ� �� �ּ� : " + address);
		System.out.println("�ֹ� ��¥ : " + date);
		System.out.println("�ֹ� �ð� : " + time);
		System.out.println("�ֹ� ���� : " + price);
		System.out.println("�޴� ��ȣ : " + menuNumber);
	}
	
}
