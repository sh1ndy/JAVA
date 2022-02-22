package ch03;

public class BuilderAndBuffer {
	
	public static void main(String[] args) {
		// builder : ���� �����忡�� ���
		// buffer : ��Ƽ �����忡�� ���
		// ���ڿ��� ���� ����� + �� ��� ����ϸ� �޸� ���� ����
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder sb = new StringBuilder(java);
		System.out.println(System.identityHashCode(sb));
		
		sb = sb.append(android);
		System.out.println(System.identityHashCode(sb));
		
		System.out.println(sb);
	}

}
