package ch21;

public class ObjectCopyTest2 {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];

		library[0] = new Book("코난1", "남도일");
		library[1] = new Book("코난2", "남도일");
		library[2] = new Book("코난3", "남도일");
		library[3] = new Book("코난4", "남도일");
		library[4] = new Book("코난5", "남도일");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for (int i = 0; i < library.length; i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
		
		library[0].setAuthor("루피");
		library[0].setTitle("원피스");
		
		System.out.println("========== library ==========");
		for (Book b : library) {
			System.out.println(b);
			b.showInfo();
		}
		
		// 복사한것이 아니라 기존의 배열의 참조주소값을 가진다.
		System.out.println("========== Copy library ==========");
		for (Book b : copyLibrary) {
			System.out.println(b);
			b.showInfo();
		}

	}

}
