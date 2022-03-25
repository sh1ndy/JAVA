
public class ChangeExceptionEx {

	public static void main(String[] args) throws InstallException {

		try {
			startInstall();
			copyFiles();
		} catch (SpaceException se) {
			InstallException ie = new InstallException("��ġ �� ���ܹ߻�");
			ie.initCause(se);
			throw ie;
		} catch (MemoryException me) {
			InstallException ie = new InstallException("��ġ �� ���ܹ߻�");
			ie.initCause(me);
			throw ie;
		} finally {
			deleteTempFiles();
		}
		
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if (!enoughSpace()) {	// ����� ��ġ ������ ������...
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
		}
		
		if (!enoughMemory()) {	// ����� �޸𸮰� ������...
			throw new MemoryException("�޸𸮰� �����մϴ�.");
		}
	}
	
	static void copyFiles() {
		
	}
	
	static void deleteTempFiles() {
		
	}
	
	static boolean enoughSpace() {
		// ��ġ�ϴµ� �ʿ��� ������ �ִ��� Ȯ���ϴ� �ڵ带 ���´�.
		return false;
	}
	
	static boolean enoughMemory() {
		// ��ġ�ϴµ� �ʿ��� �޸� ������ �ִ��� Ȯ���ϴ� �ڵ带 ���´�.
		return true;
	}

}

class InstallException extends Exception {
	InstallException(String msg) {
		super(msg);
	}
}

class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg);
	}
}

class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}
