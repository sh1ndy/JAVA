package ch08;

public class Animal {
	
	public void move() {
		System.out.println("동물은 움직입니다.");
	}

}

class Human extends Animal {
	
	@Override
	public void move() {
		System.out.println("사람은 두발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람은 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	
	@Override
	public void move() {
		System.out.println("호랑이는 네발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이는 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	
	@Override
	public void move() {
		System.out.println("독수리는 하늘을 날아다닙니다.");
	}
	
	public void flaying() {
		System.out.println("독수리가 두 날개를 펴고 하늘로 날아올랐습니다.");
	}
}

