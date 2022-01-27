
class Ex5_11 {

	public static void main(String[] args) {
		
		// 자바에서 커맨드라인으로 입력할려면 run -> run configurations // tap -> Arguments 에서 입력 (,)대신 띄어쓰기로 입력
		System.out.println("매개변수 개수 : " + args.length);
		
		for (int i = 0; i <args.length; i++) {
			System.out.println("args[" + i + "] = \"" + args[i] + "\"");
		}
		
		// 윈도우 커맨드창에서 입력 받기
		// 클래스파일 위치로 가야하므로 alt + enter 창이 뜨면 주소 옆에 아이콘 클릭
		// class 파일 위치로 이동 class 파일은 bin 폴더에 있음
		// cmd 창에서 cd C:\Help_JAVA\ch05\bin
		// dir <--- 파일안에 뭐가 있는지 보여줌
		// java Ex5_11 <-- 결과 값
		// java Ex5_11 abc 123 "Hello World" <-- 새로운 결과 값
		
		
	}

}


