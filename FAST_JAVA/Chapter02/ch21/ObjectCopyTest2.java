package ch21;

public class ObjectCopyTest2 {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];

		library[0] = new Book("�ڳ�1", "������");
		library[1] = new Book("�ڳ�2", "������");
		library[2] = new Book("�ڳ�3", "������");
		library[3] = new Book("�ڳ�4", "������");
		library[4] = new Book("�ڳ�5", "������");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for (int i = 0; i < library.length; i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
		
		library[0].setAuthor("����");
		library[0].setTitle("���ǽ�");
		
		System.out.println("========== library ==========");
		for (Book b : library) {
			System.out.println(b);
			b.showInfo();
		}
		
		// �����Ѱ��� �ƴ϶� ������ �迭�� �����ּҰ��� ������.
		System.out.println("========== Copy library ==========");
		for (Book b : copyLibrary) {
			System.out.println(b);
			b.showInfo();
		}

	}

}
