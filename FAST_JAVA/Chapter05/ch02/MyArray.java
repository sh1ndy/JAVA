package ch02;

public class MyArray {
	
	int[] intArr;		// int array
	int count;			// ����
	
	public int ARRAY_SIZE;  // ����
	public static final int ERROR_NUM = -9999999;
	
	// �⺻ ������
	public MyArray() {
		// ���� 0��
		count = 0;
		// �⺻ ���̰��� 10
		ARRAY_SIZE = 10;
		// ���̰� 0�� ������
		intArr = new int[ARRAY_SIZE];
	}
	
	// �Ű����� int Ÿ���� ���� ������
	public MyArray(int size) {
		// ���� 0��
		count = 0;
		// �Ű����� ���� ���� ���̰�
		ARRAY_SIZE = size;
		// �Ű������� ���� ������
		intArr = new int[size];
	}
	
	// ����߰� �޼��� (�Ű����� int���� ���� �޼���), Ÿ���� void
	public void addElement(int num) {
		// ������ ���̰� ���� ũ�ų� ������ ����
		if (count >= ARRAY_SIZE) {
			// ���� �޼���
			System.out.println("not enough memonry");
			// ȣ���Ѱ����� �ٽ� ����
			return;
		}
		// ��Ʈ�迭 �������ϳ��� �����ϸ鼭 �Ű����� ���� ����
		intArr[count++] = num;
	}
	
	public void insertElement(int position, int num) {
		// ������ ���̰� ���� ũ�ų� ������ ����
		if (count >= ARRAY_SIZE) {
			// ���� �޼���
			System.out.println("not enough memonry");
			// ȣ���Ѱ����� �ٽ� ����
			return;
		}
		
		// �Ű����� �����ǰ��� 0���� �۰ų� �����ǰ��� count���� ũ�ų�
		if (position < 0 || position > count) {
			// ���� �޼���
			System.out.println("insert Error");
			// ȣ���Ѱ����� �ٽ� ����
			return;
		}
		
		// �ݺ����� ���� ��ĭ�� �ڷ� �̵�
		for (int i = count-1; i >= position; i--) {
			// �߰��� ��� ��ĭ�� �ڷ� intArr������ �� ĭ�� �ڷ� �̵�
			intArr[i + 1] = intArr[i];
		}
		
		// ������ ���� ���� ����
		intArr[position] = num;
		// ���� ����
		count++;
	}
	
	// index ��ġ�� �� ����
	public int removeElement(int position) {
		// ��ȯ�� ����
		int ret = ERROR_NUM;
		
		// �迭�� ���� ���ٸ� ����
		if (isEmpty()) {
			System.out.println("There is no element");
			return ret;
		}
		
		// �迭�� index���� 0���� �۰ų� index���� �������� ũ�ų� ������ ����
		if (position < 0 || position >= count) {
			System.out.println("remove Error");
			return ret;
		}
		
		// �迭�� index���� ��ȯ���� ����
		ret = intArr[position];
		
		// index���� �迭�� ����- 1 ���ų� ũ�� ������ �ݺ��ϰ� index���� �������Ѷ�
		for (int i = position; i < count - 1; i++) {
			// ������ ��� ��ĭ�� ������ intArr������ �� ĭ�� ������ �̵�
			intArr[i] = intArr[i + 1];
		}
		
		// ���� ����
		count--;
		return ret;
	}
	
	// int�迭�� ����
	public int getSize() {
		return count;
	}
	
	// int�迭�� ������ 0 �̸� true, �ϳ��� ���������� false
	public boolean isEmpty() {
		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// index ��ġ�� ���� ��ȯ
	public int getElement(int position) {
		// index ���� 0�̰ų� count-1 ���� Ŭ���
		if (position < 0 || position > count-1) {
			System.out.println("�˻� ��ġ ����. ���� ����Ʈ�� ������ " + count + "�� �Դϴ�.");
			return ERROR_NUM;
		}
		return intArr[position];
	}
	
	public void printAll() {
		if (count == 0) {
			System.out.println("����� ������ �����ϴ�.");
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
