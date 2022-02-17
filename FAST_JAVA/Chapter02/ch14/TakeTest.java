package ch14;

public class TakeTest {

	public static void main(String[] args) {

		Student j = new Student("James", 5000);
		Student t = new Student("Tomas", 10000);
		Student k = new Student("Kim", 4000);
		Student b = new Student("Bob", 5000);
		Student p = new Student("Peris", 70000);
		
		Bus b100 = new Bus(100);
		Bus b200 = new Bus(200);
		Subway greenSubway = new Subway(2);
		Subway redSubway = new Subway(1);
		Subway brownSubway = new Subway(3);
		
		
		j.takeBus(b100);		
		t.takeSubway(greenSubway);
		k.takeSubway(greenSubway);
		b.takeSubway(redSubway);
		p.takeSubway(brownSubway);
		
		j.showInfo();
		t.showInfo();
		k.showInfo();
		b.showInfo();
		p.showInfo();
		
		b100.showInfo();
		b200.showInfo();
		greenSubway.showInfo();
		redSubway.showInfo();
		brownSubway.showInfo();
		
	}

}
