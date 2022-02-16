import java.io.File;
import java.io.IOException;

public class MovieFileCreate {
	public void createFolder() {
//		// 해당 경로에 폴더 생성
//		File movieDir = new File("c:\\aaa\\movieFolder");
//		if (movieDir.mkdir()) {
//			System.out.println("폴더 생성 성공");
//		} else {
//			System.out.println("폴더 생성 실패");
//		}
//		
//		// 만든 폴더 안에 파일 생성
//		// 폴더를 먼저 만들고 파일을 만들어야 한다.
//		File movieRepo = new File("c:\\aaa\\movieFolder\\movieRepository.txt");
//		if (!movieRepo.exists()) { // 파일이 있는지 없는지 확인 작업
//			try {
//				movieRepo.createNewFile();
//				
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			
//		}

		// 한번에 폴더, 파일 생성 할려고
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
