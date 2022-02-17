package ch15;

public class TakeTaxiTest {

	public static void main(String[] args) {

		Student e = new Student("Edward", 20000);
		Student f = new Student("feri", 10000);
		Taxi t = new Taxi("잘나간다 운수", 0);
		
		e.takeTaxi(t);
		f.takeTaxi(t);
		
		e.showInfo();
		f.showInfo();
		t.showInfo();
		
	}

}
