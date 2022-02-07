import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Lesson07 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Table Prac.");
		JPanel panel = new JPanel();
		
		String[] headings = {"Id", "Name", "Country"};
		Object[][] data = {
			{"1", "Daniel", "Korea"},
			{"2", "Sunny", "France"},
			{"3", "John", "Japan"}
		};
		
		// Table 파라미터 2개(데이터, 제목)
		JTable table = new JTable(data, headings);
		// 원하는 사이즈 new dimension(W, H);
		table.setPreferredScrollableViewportSize(new Dimension(700, 600));
		
		// 볼 수 있도록 설정 == setVisible
		table.setFillsViewportHeight(true);
		
		// frame에 panel 추가
		frame.add(panel);
		
		// panel에 table 추가
		panel.add(new JScrollPane(table));	// 스크롤을 사용할 수 있게 지정
		
		
		frame.setVisible(true);
		frame.setSize(800, 640);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
