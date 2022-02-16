package ch08;

public class PersonTest {

	public static void main(String[] args) {

		Person p = new Person(180, 78, "³²¼º", "Tomas", 37);
		String pInfo = p.personShowInfo();
		System.out.println(pInfo);
		
	}

}
