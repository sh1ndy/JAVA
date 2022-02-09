package ch14_radioButtons;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener {
	
	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotdogButton;
	ImageIcon pizzaIcon;
	ImageIcon hamburgerIcon;
	ImageIcon hotdogIcon;
	
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		// 이미지 객체 생성
		pizzaIcon = new ImageIcon("./images/pizza.png");
		hamburgerIcon = new ImageIcon("./images/hamburger.png");
		hotdogIcon = new ImageIcon("./images/hotdog.png");
		
		// 버튼 객체 생성
		pizzaButton = new JRadioButton("pizza");
		hamburgerButton = new JRadioButton("hamburger");
		hotdogButton = new JRadioButton("hotdog");
		
		// 버튼 그룹 객체를 생성하면 하나의 버튼만 체크 가능
		ButtonGroup group = new ButtonGroup();	// 버튼 그룹 객체 생성
		group.add(pizzaButton);
		group.add(hamburgerButton);
		group.add(hotdogButton);
		
		pizzaButton.addActionListener(this);
		hamburgerButton.addActionListener(this);
		hotdogButton.addActionListener(this);
		
		// 이미지 삽입
		pizzaButton.setIcon(pizzaIcon);
		hamburgerButton.setIcon(hamburgerIcon);
		hotdogButton.setIcon(hotdogIcon);
		
		this.add(pizzaButton);
		this.add(hamburgerButton);
		this.add(hotdogButton);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == pizzaButton) {
			System.out.println("You ordered Pizza!!");
		} else if (e.getSource() == hamburgerButton) {
			System.out.println("You ordered Hamburger!!");
		} else if (e.getSource() == hotdogButton) {
			System.out.println("You ordered Hotdog!!");
		}
		
	}

}
