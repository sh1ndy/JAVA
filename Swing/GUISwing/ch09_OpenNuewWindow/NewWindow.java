package ch09_OpenNewWindow;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Hello!");
	
	// NewWindow 객체의 생성자 (객체가 생성 됨가 동시에 일어나는 일들)
	NewWindow() {
		label.setBounds(0, 0, 100, 50);		// label의 위치 크기 조절 (가로 위치, 세로 위치, 가로크기, 새로 크기)
		label.setFont(new Font(null, Font.PLAIN, 25));	// label 폰트 사이즈 조절 (글씨체, 글씨 두께, 글씨 크기)
		
		frame.add(label);	// frame에 label 추가
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그래 종료
		frame.setSize(420, 420);	// 프레임 사이즈 조절
		frame.setLayout(null); 	// 프레임 레이아웃 없음
		frame.setVisible(true); // 프레임 화면 출력
	}
	

}
