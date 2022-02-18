package ch15;

public class BookShelfTest {

	public static void main(String[] args) {
		
		BookShelf bf = new BookShelf();
		System.out.println(bf.enQueue("토지1"));
		System.out.println(bf.enQueue("토지2"));
		System.out.println(bf.enQueue("토지3"));
		System.out.println(bf.enQueue("토지4"));
		System.out.println(bf.enQueue("토지5"));
		
		int result = bf.getCount();
		System.out.println(result);
		
		System.out.println(bf.deQueue());
		System.out.println(bf.deQueue());
		System.out.println(bf.deQueue());
		System.out.println(bf.deQueue());
		System.out.println(bf.deQueue());
		
	}

}
