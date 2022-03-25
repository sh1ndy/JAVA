
public class TryWithResourceEx {

	public static void main(String[] args) throws Exception {

		try (CloseableResource cr = new CloseableResource();) {
			cr.exceptionWork(false); // ���ܰ� �߻����� �ʴ´�. 
		} catch (WorkException e) {
			e.printStackTrace();
		} catch (CloseException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		try (CloseableResource cr = new CloseableResource();) {
			cr.exceptionWork(true); // ���ܰ� �߻����� �ʴ´�. 
		} catch (WorkException e) {
			e.printStackTrace();
		} catch (CloseException e) {
			e.printStackTrace();
		} 
	}
}

class CloseableResource implements AutoCloseable {
	
	public void exceptionWork(boolean exception) throws WorkException {
		System.out.println("exceptionWork(" + exception + ")�� ȣ���");
		
		if (exception) {
			throw new WorkException("WorkException�߻�!!!");
		}
	}

	@Override
	public void close() throws Exception {
		System.out.println("close()�� ȣ���");
		throw new CloseException("CloseException�߻�!!!");
	}
	
}

class WorkException extends Exception {
	WorkException(String msg) {
		super(msg);
	}
}

class CloseException extends Exception {
	CloseException(String msg) {
		super(msg);
	}
}