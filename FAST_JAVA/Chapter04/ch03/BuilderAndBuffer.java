package ch03;

public class BuilderAndBuffer {
	
	public static void main(String[] args) {
		// builder : 단일 스레드에서 사용
		// buffer : 멀티 스레드에서 사용
		// 문자열을 더할 때사용 + 를 계속 사용하면 메모리 낭비가 심함
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder sb = new StringBuilder(java);
		System.out.println(System.identityHashCode(sb));
		
		sb = sb.append(android);
		System.out.println(System.identityHashCode(sb));
		
		System.out.println(sb);
	}

}
