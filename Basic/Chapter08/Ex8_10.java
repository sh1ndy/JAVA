import java.io.File;
import java.io.IOException;

public class Ex8_10 {

	public static void main(String[] args) {

		File f = createFile("");
		System.out.println(f.getName() + "������ ���������� �����Ǿ����ϴ�.");

	}

	static File createFile(String fileName) {
		if (fileName == null || fileName.equals("")) {
			try {
				throw new Exception("������ �̸��� ��ȿ���� �ʽ��ϴ�.");
			} catch (Exception e) {
				fileName = "�������.txt";
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
