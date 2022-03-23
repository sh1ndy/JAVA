package day0323;

interface Hunting {
	public abstract void hunting(String name);
}

class Animal {
	public static Hunting getAnimal(String animal) {
		if (animal.equals("tiger")) {
			return new TigerHunting();
		} else {
			LionHunting lh = new LionHunting();
			return lh;
		}
	}
}

class TigerHunting implements Hunting {

	@Override
	public void hunting(String name) {
		System.out.println(name + "ȣ���̰� ����� �߽��ϴ�.");
	}
	
}

class LionHunting implements Hunting {

	@Override
	public void hunting(String name) {
		System.out.println(name + "���ڰ� ����� �߽��ϴ�.");
		
	}
	
}

public class HuntingTest {

	public static void main(String[] args) {

		Hunting h = Animal.getAnimal("tiger");
		h.hunting("�Ʊ�");
		
		h = Animal.getAnimal("lion");
		h.hunting("ū");
		
	}

}
