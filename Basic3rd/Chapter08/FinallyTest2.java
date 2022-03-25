
public class FinallyTest2 {

	public static void main(String[] args) {

		try {
			startInstall(); // ���α׷� ��ġ�� �ʿ��� �غ� �Ѵ�.
			copyFiles(); // ���ϵ��� �����Ѵ�.
			deleteTempFiles(); // ���α׷� ��ġ�� �翵�� �ӽ����ϵ��� �����Ѵ�.
		} catch (Exception e) {
			e.printStackTrace();
		} finally {  // ���ܰ� �߻��ϵ� ���ϵ� ������ �����
			deleteTempFiles(); // ���α׷� ��ġ�� �翵�� �ӽ����ϵ��� �����Ѵ�.
		}
	
	}
	
	static void startInstall() {
		// ���α׷� ��ġ�� �ʿ��� �غ� �ϴ� �ڵ带 ���´�.
	}
	
	static void copyFiles() {
		// ���ϵ��� �����ϴ� �ڵ带 ���´�.
	}
	
	static void deleteTempFiles() {
		// �ӽ����ϵ��� �����ϴ� �ڵ带 ���´�.
	}
	

}
