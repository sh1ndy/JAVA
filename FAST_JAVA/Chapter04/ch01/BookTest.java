package ch01;

class Book {
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public String toString() {
		return title + ", " + author;
	}
}

public class BookTest {

	public static void main(String[] args) {
		
		Book book = new Book("���̾�", "�켼");
		System.out.println(book.toString());
		
		String str = new String("test");
		System.out.println(str.toString());

	}

}
