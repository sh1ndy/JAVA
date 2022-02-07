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
		
		// Table �Ķ���� 2��(������, ����)
		JTable table = new JTable(data, headings);
		// ���ϴ� ������ new dimension(W, H);
		table.setPreferredScrollableViewportSize(new Dimension(700, 600));
		
		// �� �� �ֵ��� ���� == setVisible
		table.setFillsViewportHeight(true);
		
		// frame�� panel �߰�
		frame.add(panel);
		
		// panel�� table �߰�
		panel.add(new JScrollPane(table));	// ��ũ���� ����� �� �ְ� ����
		
		
		frame.setVisible(true);
		frame.setSize(800, 640);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
