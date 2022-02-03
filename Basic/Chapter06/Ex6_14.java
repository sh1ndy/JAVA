package ex14;

class MyMath {
	// 매개변수 int, int
	int add(int x, int y) {
		return x + y;
	}

	// 매개변수 long, long
	long add(long x, long y) {
		return x + y;
	}
	
	// 매개변수 int, long
	long add(int x, long y) {
		return x + y;
	}
	
	// 매개변수 long, int
	long add(long x, int y) {
		return x + y;
	}
	
	// 매개변수 int[] 배열
	int add(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
}

public class Ex6_14 {

	public static void main(String[] args) {
		
		
		int[] arr = {100, 200, 300};
		
		MyMath mm = new MyMath();
		System.out.println("mm.add(3, 3) 결과 : " + mm.add(3, 3));
		System.out.println("mm.add(3L, 3L) 결과 : " + mm.add(3L, 3L));
		System.out.println("mm.add(3, 3L) 결과 : " + mm.add(3, 3L));
		System.out.println("mm.add(3L, 3) 결과 : " + mm.add(3L, 3));
		
		
		int total = mm.add(arr);
		System.out.println("mm.add(arr) 결과 : " + total);

	}

}
