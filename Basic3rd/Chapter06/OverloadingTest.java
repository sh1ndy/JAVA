package exOverloading;

public class OverloadingTest {

	public static void main(String[] args) {

		MyMath mm = new MyMath();
		System.out.println(mm.add(5, 3));
		System.out.println(mm.add(5, 3L));
		System.out.println(mm.add(5L, 3));
		System.out.println(mm.add(5L, 3L));
		
		int[] a = {1, 2, 3, 4, 5};
		System.out.println(mm.add(a));
		
	}

}
