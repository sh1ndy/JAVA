package exReturn;

public class ReferenceReturnEx {

	public static void main(String[] args) {

		Data d = new Data();
		d.x = 10;
		
		System.out.println("main() x = " + d.x);
		Data copy = d.copy(d);
		copy.x = 100;
		System.out.println("main() x = " + d.x);
		System.out.println("main() copy.x = " + copy.x);
		
		d.name = "코코";
		System.out.println("main() name = " + d.name);
		
		Data newName = d.copy2(d);
		newName.name = "나비";
		
		System.out.println(d.name);
		System.out.println(newName.name);
		
		Data d2 = new Data();
		
		d2.name = "레옹";
		d2.x = 3;
		
		Data newD2 = d2.copy3(d2);
		
//		System.out.println(newD2.name);
//		System.out.println(newD2.x);
		
		newD2.name = "마틸다";
		newD2.x = 2;
		
		System.out.println(d2.name);
		System.out.println(d2.x);
		System.out.println(newD2.name);
		System.out.println(newD2.x);
	}

}
