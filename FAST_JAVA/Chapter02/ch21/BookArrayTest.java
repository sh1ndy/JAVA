package ch21;

public class BookArrayTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
//		for (int i = 0; i < library.length; i++) {
//			System.out.println(library[i]);
//		}
		
		library[0] = new Book("�ڳ�1", "������");
		library[1] = new Book("�ڳ�2", "������");
		library[2] = new Book("�ڳ�3", "������");
		library[3] = new Book("�ڳ�4", "������");
		library[4] = new Book("�ڳ�5", "������");
		
		for (Book b : library) {
			System.out.println(b);
			b.showInfo();
		}
		
	}

}
