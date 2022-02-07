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
		// 타이틀
		frame.setTitle("Lesson06");
		// 프레임 사이즈 조절
		frame.setBounds(100, 100, 800, 600);
		// 프레임 화면 중앙에서 출력
		frame.setLocationRelativeTo(null);
		// 프레임 사이즈 수정 불가
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
		
		// endpage 첫 화면에 보이지 않게 하기
		endPage.setVisible(false);
		
		// btnNext 버튼 기능 (버튼 클릭 시 endPage로 화면 이동)
		btnNext.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				endPage.setVisible(true);
				startPage.setVisible(false);
			}
			
		});
		
		// btnBefore 버튼 기능 (버튼 클릭 시 startPage로 화면 이동)
		btnBefore.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				endPage.setVisible(false);
				startPage.setVisible(true);
			}
			
		});
	}
}
