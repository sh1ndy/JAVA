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
		System.out.println("주문 접수 번호 : " + orderNumber);
		System.out.println("주문 핸드폰 번호 : " + phoneNumber);
		System.out.println("주문 집 주소 : " + address);
		System.out.println("주문 날짜 : " + date);
		System.out.println("주문 시간 : " + time);
		System.out.println("주문 가격 : " + price);
		System.out.println("메뉴 번호 : " + menuNumber);
	}
	
}
