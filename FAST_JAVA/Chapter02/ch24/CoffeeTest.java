package ch24;

public class CoffeeTest {
	
	public static void main(String[] args) {
		
		Customer lee = new Customer(1000, 25000);
		lee.orderCoffe("아메리카노", 4500, 2);
		lee.orderCoffe("카페라떼", 5000, 1);
		
		Customer kim = new Customer(1001, 50000);
		kim.orderCoffe("아메리카노", 4500, 1);
		kim.orderCoffe("카페라떼", 5000, 1);
		kim.orderCoffe("에스프레소", 3000, 1);
		kim.orderCoffe("골든브루", 8000, 1);
		
		lee.orderShowInfo();
		System.out.println("======================");
		kim.orderShowInfo();
	}

}
