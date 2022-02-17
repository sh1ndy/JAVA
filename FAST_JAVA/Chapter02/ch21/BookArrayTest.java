package ch21;

public class BookArrayTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
//		for (int i = 0; i < library.length; i++) {
//			System.out.println(library[i]);
//		}
		
		library[0] = new Book("코난1", "남도일");
		library[1] = new Book("코난2", "남도일");
		library[2] = new Book("코난3", "남도일");
		library[3] = new Book("코난4", "남도일");
		library[4] = new Book("코난5", "남도일");
		
		for (Book b : library) {
			System.out.println(b);
			b.showInfo();
		}
		
	}

}
