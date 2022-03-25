
public class ChangeExceptionEx {

	public static void main(String[] args) throws InstallException {

		try {
			startInstall();
			copyFiles();
		} catch (SpaceException se) {
			InstallException ie = new InstallException("설치 중 예외발생");
			ie.initCause(se);
			throw ie;
		} catch (MemoryException me) {
			InstallException ie = new InstallException("설치 중 예외발생");
			ie.initCause(me);
			throw ie;
		} finally {
			deleteTempFiles();
		}
		
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if (!enoughSpace()) {	// 충분한 설치 공간이 없으면...
			throw new SpaceException("설치할 공간이 부족합니다.");
		}
		
		if (!enoughMemory()) {	// 충분한 메모리가 없으면...
			throw new MemoryException("메모리가 부족합니다.");
		}
	}
	
	static void copyFiles() {
		
	}
	
	static void deleteTempFiles() {
		
	}
	
	static boolean enoughSpace() {
		// 설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다.
		return false;
	}
	
	static boolean enoughMemory() {
		// 설치하는데 필요한 메모리 공간이 있는지 확인하는 코드를 적는다.
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
