import java.io.File;
import java.io.IOException;

public class MovieFileCreate {
	public void createFolder() {
//		// �ش� ��ο� ���� ����
//		File movieDir = new File("c:\\aaa\\movieFolder");
//		if (movieDir.mkdir()) {
//			System.out.println("���� ���� ����");
//		} else {
//			System.out.println("���� ���� ����");
//		}
//		
//		// ���� ���� �ȿ� ���� ����
//		// ������ ���� ����� ������ ������ �Ѵ�.
//		File movieRepo = new File("c:\\aaa\\movieFolder\\movieRepository.txt");
//		if (!movieRepo.exists()) { // ������ �ִ��� ������ Ȯ�� �۾�
//			try {
//				movieRepo.createNewFile();
//				
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			
//		}

		// �ѹ��� ����, ���� ���� �ҷ���
		File movieDir = new File("c:\\aaa\\movieFolder\\movieRepository.txt");

		File folder = new File(movieDir.getParent());
		if (!folder.exists()) {
			folder.mkdir();
		}
		if (!movieDir.exists()) {
			try {
				movieDir.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
