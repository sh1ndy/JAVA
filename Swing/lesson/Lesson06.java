import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Lesson06 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lesson06 window = new Lesson06();
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
	public Lesson06() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		// Ÿ��Ʋ
		frame.setTitle("Lesson06");
		// ������ ������ ����
		frame.setBounds(100, 100, 800, 600);
		// ������ ȭ�� �߾ӿ��� ���
		frame.setLocationRelativeTo(null);
		// ������ ������ ���� �Ұ�
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel endPage = new JPanel();
		endPage.setBounds(0, 0, 794, 571);
		frame.getContentPane().add(endPage);
		endPage.setLayout(null);
		
		JButton btnBefore = new JButton("Go to Last");
		btnBefore.setBounds(559, 122, 168, 244);
		endPage.add(btnBefore);
		
		JPanel startPage = new JPanel();
		startPage.setBounds(0, 0, 794, 571);
		frame.getContentPane().add(startPage);
		startPage.setLayout(null);
		
		JButton btnNext = new JButton("Go to Next");
		btnNext.setBounds(0, 0, 186, 310);
		startPage.add(btnNext);
		
		// endpage ù ȭ�鿡 ������ �ʰ� �ϱ�
		endPage.setVisible(false);
		
		// btnNext ��ư ��� (��ư Ŭ�� �� endPage�� ȭ�� �̵�)
		btnNext.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				endPage.setVisible(true);
				startPage.setVisible(false);
			}
			
		});
		
		// btnBefore ��ư ��� (��ư Ŭ�� �� startPage�� ȭ�� �̵�)
		btnBefore.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				endPage.setVisible(false);
				startPage.setVisible(true);
			}
			
		});
	}
}
