package ch11;

public class MakeReport {
	StringBuffer sb = new StringBuffer();
	
	private String line = "==========================================\n";
	private String title = "  이름\t 주소\t\t 전화번호   \n";
	
	private void makeHeader() {
		sb.append(line);
		sb.append(title);
		sb.append(line);
	}
	
	private void makeBody() {
		sb.append("James \t");
		sb.append("Paris \t\t");
		sb.append("010-7777-7778\n");
		
		sb.append("Tomas \t");
		sb.append("NewYork \t");
		sb.append("010-5555-5577\n");
	}
	
	private void makeFooter() {
		sb.append(line);
	}
	
	public String getReport() {
		makeHeader();
		makeBody();
		makeFooter();
		return sb.toString();
	}
	

}
