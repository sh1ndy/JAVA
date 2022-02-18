package ch15;

public class BookShelf extends Shelf implements Queue {

	@Override
	public boolean enQueue(String title) {
		boolean b = shelf.add(title);
		return b;
		
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

}
