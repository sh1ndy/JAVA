package ch04_buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {
	JButton button;
	JLabel label;
	
	public MyFrame() {
		
		ImageIcon icon = new ImageIcon("./images/like.png");
		ImageIcon icon2 = new ImageIcon("./images/star.png");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150, 250, 150, 150);
		label.setVisible(false);
		
		button = new JButton();		// 버튼 생성
		button.setBounds(100, 100, 250, 100);	// 위치와 사이즈 조절
		button.addActionListener(this);		// 인벤트 발생을 사용하겠다.
		button.setText("I'm a button!");	// 버튼의 글자
		button.setFocusable(false);		// 테두리를 없애준다.
		button.setIcon(icon);		// icon 이미지를 버튼에 삽입 한다.
		button.setHorizontalTextPosition(JButton.CENTER);	// 버튼을 기준으로 텍스트를 가로 중앙에 위치.
		button.setVerticalTextPosition(JButton.BOTTOM);		// 버튼을 기준으로 텍스트를 세로 바닥에 위치.
		button.setFont(new Font("Comic Sans", Font.BOLD, 25));	// Font객체로 글씨체, 글씨 두께, 글씨 크기
		button.setIconTextGap(4);	// 아이콘과 글자사이의 간격
		button.setForeground(Color.cyan);	// 글자 색깔
		button.setBackground(Color.LIGHT_GRAY);	// 버튼 배경 색깔
		button.setBorder(BorderFactory.createEtchedBorder());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 만약에 button을 클릭했을 경우
		if (e.getSource() == button) {
			// 해당 내용을 출력하라
//			System.out.println("poo");
//			// 한 번 클릭하면 더 이상 사용 못하게 막음
//			button.setEnabled(false);	// 사용 못하게 막는 기능
			// label을 화면에 출력해라
			label.setVisible(true);
		}
		
	}
}
