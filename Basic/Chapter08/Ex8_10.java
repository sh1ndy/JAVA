import java.io.File;
import java.io.IOException;

public class Ex8_10 {

	public static void main(String[] args) {

		File f = createFile("");
		System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");

	}

	static File createFile(String fileName) {
		if (fileName == null || fileName.equals("")) {
			try {
				throw new Exception("파일의 이름이 유효하지 않습니다.");
			} catch (Exception e) {
				fileName = "제목없음.txt";
			}
		}
		File f = new File(fileName);

		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}

}
