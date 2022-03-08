
public class Ex6_2 {

	public static void main(String[] args) {

		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		t1.channel = 7;	// t1에 속성 channel 값을 7으로 한다.
		
		System.out.println("현재 Tv1채널은 " + t1.channel + "번 입니다.");
		System.out.println("현재 Tv2채널은 " + t2.channel + "번 입니다.");
		
		t2 = t1;	// t2에 t1의 주소값을 저장한다.
		System.out.println("현재 Tv1채널은 " + t1.channel + "번 입니다.");
		System.out.println("현재 Tv2채널은 " + t2.channel + "번 입니다.");
		
		// 길이가 3인 객체 배열 생성
		Tv[] tvArr = {new Tv(), new Tv(), new Tv()};
		
		tvArr[0].channel = 10;  // tvArr[0] 속성의 channel에 10 저장
		tvArr[1].channel = 20;  // tvArr[1] 속성의 channel에 20 저장
		tvArr[2].channel = 30;  // tvArr[2] 속성의 channel에 30 저장
		System.out.println("현재 tvArr[0]채널은 " + tvArr[0].channel + "번 입니다.");
		System.out.println("현재 tvArr[1]채널은 " + tvArr[1].channel + "번 입니다.");
		System.out.println("현재 tvArr[2]채널은 " + tvArr[2].channel + "번 입니다.");
		
		
		
	}

}
