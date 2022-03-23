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
		System.out.println(name + "호랑이가 사냥을 했습니다.");
	}
	
}

class LionHunting implements Hunting {

	@Override
	public void hunting(String name) {
		System.out.println(name + "사자가 사냥을 했습니다.");
		
	}
	
}

public class HuntingTest {

	public static void main(String[] args) {

		Hunting h = Animal.getAnimal("tiger");
		h.hunting("아기");
		
		h = Animal.getAnimal("lion");
		h.hunting("큰");
		
	}

}
