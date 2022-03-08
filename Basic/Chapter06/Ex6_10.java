class MyMath3 {
	
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a + b;
	}
	
	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a + b;
	}
	
	long add(long a, int b) {
		System.out.print("long add(long a, int b) - ");
		return a + b;
	}
	
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a + b;
	}
	
	int add(int[] a) {
		System.out.print("int[] add(int[] a) - ");
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		
		return total;
	}
	
}

public class Ex6_10 {

	public static void main(String[] args) {

		MyMath3 mm = new MyMath3();
		System.out.println(mm.add(10, 20));
		System.out.println(mm.add(20, 30L));
		System.out.println(mm.add(30L, 40));
		System.out.println(mm.add(40L, 40L));
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(mm.add(arr));
		
	}

}
