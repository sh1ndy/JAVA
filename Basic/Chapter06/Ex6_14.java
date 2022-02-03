package ex14;

class MyMath {
	// �Ű����� int, int
	int add(int x, int y) {
		return x + y;
	}

	// �Ű����� long, long
	long add(long x, long y) {
		return x + y;
	}
	
	// �Ű����� int, long
	long add(int x, long y) {
		return x + y;
	}
	
	// �Ű����� long, int
	long add(long x, int y) {
		return x + y;
	}
	
	// �Ű����� int[] �迭
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
		System.out.println("mm.add(3, 3) ��� : " + mm.add(3, 3));
		System.out.println("mm.add(3L, 3L) ��� : " + mm.add(3L, 3L));
		System.out.println("mm.add(3, 3L) ��� : " + mm.add(3, 3L));
		System.out.println("mm.add(3L, 3) ��� : " + mm.add(3L, 3));
		
		
		int total = mm.add(arr);
		System.out.println("mm.add(arr) ��� : " + total);

	}

}
