
public class ArrayEx10 {

	public static void main(String[] args) {

		// 배열10개짜리 생
		int[] numArr = new int[10];

		// 임의 수 배열에 저
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int) (Math.random() * numArr.length));
		}
		
		System.out.println();
		
		// 배열의 크기-1 만큼 루프 돌
		for (int i = 0; i < numArr.length - 1; i++) {
			// 자리바꿈이 발생했는지를 체크한다.
			boolean changed = false;
			
			// 현재 값과 다음 값을 비교해서 크면 현재값에 다음값을 담
			for (int j = 0; j < numArr.length - 1 - i; j++) {
				// 옆의 값이 작으면 서로 바꾼다.
				if (numArr[j] > numArr[j + 1]) {
					int temp = numArr[j];
					numArr[j]  = numArr[j + 1];
					numArr[j + 1] = temp;
					
					// 자리바꿈이 발생하였으니 changed를 true로.
					changed = true;
				}
			}
			
			// 자리바꿈이 없으면 반복문을 벗어난다.
			if (!changed) {
				break;
			}
			
			// 정렬된 결과를 출력한다.
			for (int k = 0; k < numArr.length; k++) {
				System.out.print(numArr[k]);
				
			}
			System.out.println();
		}



	}

}
