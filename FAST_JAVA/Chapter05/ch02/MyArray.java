package ch02;

public class MyArray {
	
	int[] intArr;		// int array
	int count;			// 개수
	
	public int ARRAY_SIZE;  // 길이
	public static final int ERROR_NUM = -9999999;
	
	// 기본 생성자
	public MyArray() {
		// 개수 0개
		count = 0;
		// 기본 길이값이 10
		ARRAY_SIZE = 10;
		// 길이가 0인 생성자
		intArr = new int[ARRAY_SIZE];
	}
	
	// 매개변수 int 타입을 가진 생성자
	public MyArray(int size) {
		// 개수 0개
		count = 0;
		// 매개변수 값을 가진 길이값
		ARRAY_SIZE = size;
		// 매개변수를 가진 생성자
		intArr = new int[size];
	}
	
	// 요소추가 메서드 (매개변수 int형을 가진 메서드), 타입은 void
	public void addElement(int num) {
		// 개수가 길이값 보다 크거나 같으면 에러
		if (count >= ARRAY_SIZE) {
			// 에러 메세지
			System.out.println("not enough memonry");
			// 호출한곳으로 다시 리턴
			return;
		}
		// 인트배열 개수가하나씩 증가하면서 매개변수 값을 저장
		intArr[count++] = num;
	}
	
	public void insertElement(int position, int num) {
		// 개수가 길이값 보다 크거나 같으면 에러
		if (count >= ARRAY_SIZE) {
			// 에러 메세지
			System.out.println("not enough memonry");
			// 호출한곳으로 다시 리턴
			return;
		}
		
		// 매개변수 포지션값이 0보다 작거나 포지션값이 count보다 크거나
		if (position < 0 || position > count) {
			// 에러 메세지
			System.out.println("insert Error");
			// 호출한곳으로 다시 리턴
			return;
		}
		
		// 반복문을 통한 한칸씩 뒤로 이동
		for (int i = count-1; i >= position; i--) {
			// 추가될 경우 한칸씩 뒤로 intArr값들이 한 칸씩 뒤로 이동
			intArr[i + 1] = intArr[i];
		}
		
		// 포지션 값에 값을 저장
		intArr[position] = num;
		// 개수 증가
		count++;
	}
	
	// index 위치의 값 삭제
	public int removeElement(int position) {
		// 반환값 설정
		int ret = ERROR_NUM;
		
		// 배열의 값이 없다면 에러
		if (isEmpty()) {
			System.out.println("There is no element");
			return ret;
		}
		
		// 배열의 index값이 0보다 작거나 index값이 개수보다 크거나 같을때 에러
		if (position < 0 || position >= count) {
			System.out.println("remove Error");
			return ret;
		}
		
		// 배열의 index값을 반환값에 저장
		ret = intArr[position];
		
		// index값이 배열의 개수- 1 같거나 크기 전까지 반복하고 index값은 증가시켜라
		for (int i = position; i < count - 1; i++) {
			// 삭제될 경우 한칸씩 앞으로 intArr값들이 한 칸씩 앞으로 이동
			intArr[i] = intArr[i + 1];
		}
		
		// 개수 감소
		count--;
		return ret;
	}
	
	// int배열의 개수
	public int getSize() {
		return count;
	}
	
	// int배열의 개수가 0 이면 true, 하나라도 남아있으면 false
	public boolean isEmpty() {
		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// index 위치의 값을 반환
	public int getElement(int position) {
		// index 값이 0이거나 count-1 보다 클경우
		if (position < 0 || position > count-1) {
			System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count + "개 입니다.");
			return ERROR_NUM;
		}
		return intArr[position];
	}
	
	public void printAll() {
		if (count == 0) {
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		
		for (int i = 0; i < count; i++) {
			System.out.println(intArr[i]);
		}
	}
	
	public void removeAll() {
		for (int i = 0; i < count; i++) {
			intArr[i] = 0;
		}
		count = 0;
	}

}
