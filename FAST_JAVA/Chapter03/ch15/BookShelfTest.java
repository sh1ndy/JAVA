package ch15;

public class BookShelfTest {

	public static void main(String[] args) {
		
		BookShelf bf = new BookShelf();
		System.out.println(bf.enQueue("����1"));
		System.out.println(bf.enQueue("����2"));
		System.out.println(bf.enQueue("����3"));
		System.out.println(bf.enQueue("����4"));
		System.out.println(bf.enQueue("����5"));
		
		int result = bf.getCount();
		System.out.println(result);
		
		System.out.println(bf.deQueue());
		System.out.println(bf.deQueue());
		System.out.println(bf.deQueue());
		System.out.println(bf.deQueue());
		System.out.println(bf.deQueue());
		
	}

}
