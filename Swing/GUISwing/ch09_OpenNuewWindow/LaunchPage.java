package ch09_OpenNewWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {
	
	JFrame frame = new JFrame();	// 프레임 생성
	JButton myButton = new JButton("New Window"); 	// 버튼 생성
	
	LaunchPage() {
		
		myButton.setBounds(100, 160, 200, 40);	// 버튼의 가로위치, 세로위치, 가로크기, 세로크기
		myButton.setFocusable(false);	// 버튼 테두리 제거
		myButton.addActionListener(this);
		
		frame.add(myButton);	// 버튼을 프레임에 추가 한다.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그래 종료
		frame.setSize(420, 420);	// 프레임 사이즈 조절
		frame.setLayout(null); 	// 프레임 레이아웃 없음
		frame.setVisible(true); // 프레임 화면 출력
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// myButton 클릭 시 발생하는 이벤트
		// myButton을 클릭을 했다면
		if (e.getSource() == myButton) {
			// myButton을 클릭 했을 시 frame을 사라지게 한다. == setVisible(false)
			frame.dispose();
			// myWindow 객체를 생성해라.
			NewWindow myWindow = new NewWindow();
		}
		
	}

}
