import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Lesson09 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lesson09 window = new Lesson09();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Lesson09() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 687, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 671, 441);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Help_JAVA\\Lesson\\image\\button.jpg"));
		btnNewButton.setSelectedIcon(new ImageIcon("C:\\Help_JAVA\\Lesson\\image\\button.jpg"));
		btnNewButton.setBounds(201, 210, 241, 68);
		// btn을 눌렀을 때 이미지 바뀌는 효과
		btnNewButton.setPressedIcon(new ImageIcon("C:\\Help_JAVA\\Lesson\\image\\button_clicked.jpg"));
		panel.add(btnNewButton);
	}

}
