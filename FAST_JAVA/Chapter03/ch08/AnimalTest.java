package ch08;

import java.util.ArrayList;

public class AnimalTest {

	public static void main(String[] args) {
		
		ArrayList<Animal> animalList = new ArrayList<>();

		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		moveAll(hAnimal);
		moveAll(tAnimal);
		moveAll(eAnimal);
		
		testDownCasting(animalList);
		
	}
	
	static void moveAll(Animal animal) {
		animal.move();
	}
	
	static void testDownCasting(ArrayList<Animal> list) {
//		for (int i = 0; i < list.size(); i++) {
//			Animal animal = list.get(i);
//			
//			if (animal instanceof Human) {
//				Human h = (Human)animal;
//				h.readBook();
//			} else if (animal instanceof Tiger) {
//				Tiger t = (Tiger)animal;
//				t.hunting();
//			} else if (animal instanceof Eagle) {
//				Eagle e = (Eagle)animal;
//				e.flaying();
//			} else {
//				System.out.println("unsuppoerted type");
//			}
//		}
		
		for (Animal a : list) {
			if (a instanceof Human) {
				Human h = (Human) a;
				h.readBook();
			} else if (a instanceof Tiger) {
				Tiger t = (Tiger) a;
				t.hunting();
			} else if (a instanceof Eagle) {
				Eagle e = (Eagle) a;
				e.flaying();
			}
		}
	}

}
