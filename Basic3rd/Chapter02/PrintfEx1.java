
public class PrintfEx1 {

	public static void main(String[] args) {

		int age = 14;
		System.out.printf("age = %d%n", age);
		System.out.printf("%d x %d = %d%n", 3, 4, 3 * 4);
		
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000L; // long big = 100000000L;  동일
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010; // 8진수 10, 10진수로는 8
		int hexNum = 0x10; // 16진수 10, 10진수로는 16
		int binNum = 0b10; // 2진수 10, 10진수로는 2
		
		System.out.printf("b = %d%n", b);
		System.out.printf("s = %d%n", s);
		System.out.printf("c = %c, %d %n", c, (int) c); // %d = c를 int형 변환 꼭해서 사용
		System.out.printf("finger = [%5d]%n", finger); // 5칸 사용 오른쪽 붙임
		System.out.printf("finger = [%-5d]%n", finger); // 5칸 사용 왼쪽 붙임
		System.out.printf("finger = [%05d]%n", finger); // 5칸 사용 빈칸을 0으로 채
		System.out.printf("big = %d%n", big);
		System.out.printf("hex = %x%n", hex);
		System.out.printf("hex = %#x%n", hex);  // #은 접두사(16진수 0x 8진수 0)
		System.out.printf("octNum = %o %d %n", octNum, octNum);
		System.out.printf("hexNum = %x %d %n", hexNum, hexNum);
		System.out.printf("binNum = %s %d %n", Integer.toBinaryString(binNum), binNum); // 2진수 문자열로 변
		 
		
	}

}
