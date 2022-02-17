package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];

		library[0] = new Book("�ڳ�1", "������");
		library[1] = new Book("�ڳ�2", "������");
		library[2] = new Book("�ڳ�3", "������");
		library[3] = new Book("�ڳ�4", "������");
		library[4] = new Book("�ڳ�5", "������");
		
		// ����������, n��°����, copy����������, n��°����, �����
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
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
