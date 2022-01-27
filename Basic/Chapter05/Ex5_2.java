
public class Ex5_2 {

	public static void main(String[] args) {

		// index 범위 : 0 ~ 9
		int[] arr = new int[10]; // 길이가 10인 배열 생성
		int tmp = arr.length; // score.length의 길이 10의 값을 tmp 10을 저장한다.

		System.out.println("tmp = " + arr.length);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		
		// index 요소의 총합을 구하라
		int sum = 0;
		int[] arr1 = new int[3];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for (int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
		}
		
		System.out.println("sum = " + sum);
		
		// index 요소의 총합을 구하고 평균 값을 구함
		int total = 0;
		int avg = 0;
		int[] numArr = new int[10];
		numArr[0] = 10;
		numArr[1] = 20;
		numArr[2] = 30;
		numArr[3] = 40;
		numArr[4] = 50;
		numArr[5] = 60;
		numArr[6] = 70;
		numArr[7] = 80;
		numArr[8] = 90;
		numArr[9] = 100;
		
		for (int i = 0; i < numArr.length; i++) {
			total += numArr[i];
		}
		avg = total / numArr.length;
		
		System.out.println("element total = " + total);
		System.out.println("element avg = " + avg);

	}

}
