package ch24;

public class CoffeeTest {
	
	public static void main(String[] args) {
		
		Customer lee = new Customer(1000, 25000);
		lee.orderCoffe("�Ƹ޸�ī��", 4500, 2);
		lee.orderCoffe("ī���", 5000, 1);
		
		Customer kim = new Customer(1001, 50000);
		kim.orderCoffe("�Ƹ޸�ī��", 4500, 1);
		kim.orderCoffe("ī���", 5000, 1);
		kim.orderCoffe("����������", 3000, 1);
		kim.orderCoffe("�����", 8000, 1);
		
		lee.orderShowInfo();
		System.out.println("======================");
		kim.orderShowInfo();
	}

}
