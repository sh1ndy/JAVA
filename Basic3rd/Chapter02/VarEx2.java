
public class VarEx2 {
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		int tmp = 0;
		
		System.out.println("x : " + x + ", y : " + y);
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x : " + x + ", y : " + y);
		
		// 대소문자가 구분되며 길이에 제한이 없다.
		int number = 10;
		int Number = 20;
		System.out.println("number : " + number + ", Number = " + Number);
		
		
		// 예약어 (키워드 사용불가))
//		int true;
//		int if;
//		int boolean;
//		int default;   
		
//		int 1number = 10; // 변수명앞에 숫자는 올수 없
		int number1 = 20;
		int num1ber = 30;
		
		System.out.println("number1 : " + number1 + ", num1ber : " + num1ber);
		
		// 특수문자는 _, $만 허용을 한다.
		int _number = 10;
		int _rank = 20;
		int $rank = 20;
		int $number = 30;
		int S$arp = 40;
		System.out.println(S$arp);
		System.out.println(_rank);
		
		char ch1 = 'A';
		char ch2 = 'B';
		char cTmp = ' ';
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println((char) (40 + 25));
		System.out.println();
		System.out.println("ch1 = " + ch1 + ", ch2 = " + ch2);
		cTmp = ch1;
		ch1 = ch2;
		ch2 = cTmp;
		System.out.println("ch1 = " + ch1 + ", ch2 = " + ch2);
		
		char c = 'A';
		System.out.println((int) c);
		
		char c2 = 70;
		System.out.println((int) c2);
		
		final int MAX_NUMBER = 100;
		final int MIN_NUMBER = 0;
		
		System.out.println(MAX_NUMBER);
		System.out.println(MIN_NUMBER);
		
		int curPos = 0; // 현재위치
		int lastPos = -1; // 마지막 위치
		
		
		
		
	}

}
