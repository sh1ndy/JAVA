import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame {

	public static void main(String[] args) {

		// 프레임 만들기 (시작할 때 툴)
		JFrame frame = new JFrame();
		
		// 패널 만들기 (툴 안에 무엇인가를 넣고 싶을 때 이미지, 기능 등등)
		JPanel panel = new JPanel();
		JPanel btnPanel = new JPanel();
		
		// 글자를 표시
		JLabel label = new JLabel("Some text");
		
		// 버튼 추가
		JButton btn1 = new JButton("Click me!!");
		JButton btn2 = new JButton("Exit!!");
		
		// 많은 글자 쓰기 기능
		JTextArea txtArea = new JTextArea();
		
		// 한줄 글자 쓰기에 많이 씀 (최대 글자 길이)
		JTextField txtField = new JTextField(200);
		
		// 내가 원하는 위치에 나두는 기능
		panel.setLayout(new BorderLayout());
		
		
		// 버튼을 눌렀을 때 기능 추가
		btn1.addActionListener(new ActionListener() {
			 
			@Override
			public void actionPerformed(ActionEvent e) {
				// txtArea에 적은 것을 btn1을 클릭했을 시 label이 수정되게 함
				label.setText(txtArea.getText());
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// exit를 눌렀을 때 프로그램 종료
				System.exit(0);
			}
		});
		
		
		// 프레임에 패널을 집어 넣어줌
		frame.add(panel);
		
		// 패널안에 라벨을 집어 넣어줌
		panel.add(label, BorderLayout.NORTH); // <-- 북쪽에 위치
		panel.add(txtArea, BorderLayout.CENTER); // <-- 센터에 위치
		panel.add(btnPanel, BorderLayout.WEST);	  // <-- 서쪽에 위치
		
		// 버튼 패널안에 버튼 2개 추가
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		
		// 프레임을 보이게 해줌
		frame.setVisible(true);
		
		// 프레임 크기 조절 기능 여부
		frame.setResizable(false);
		
		// 사이즈 조절 (dimension 사용)
		frame.setPreferredSize(new Dimension(840, 840 / 12 * 9));
		frame.setSize(840, 840 / 12 * 9);
		
		// 컴퓨터 화면 가운데에서 프레임 출력
		frame.setLocationRelativeTo(null);
		
		// 프로그램 종료했을 때 모든게 종료
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
