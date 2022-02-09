package ch12_textfields;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	JButton button;
	JTextField textField;

	MyFrame() {
		super("I Love Dasol");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		button = new JButton("Summit");

		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250, 40));
		textField.setFont(new Font("Consolas", Font.PLAIN, 20));
		textField.setForeground(new Color(0x00FF00));
		textField.setBackground(Color.BLACK);
		textField.setCaretColor(Color.RED); // cursor Color
		textField.setText("username");
//		textField.setEditable(false);	// setText default result;

		button.addActionListener(this);

		this.add(textField);
		this.add(button);
		// pack()은 프레임내에 서브컴포넌트들의 레이아웃과 Prefered Size에 맞도록 윈도우의 사이즈를 맞추는 작업
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == button) {
			System.out.println("Welcome " + textField.getText());
		}

	}

}
