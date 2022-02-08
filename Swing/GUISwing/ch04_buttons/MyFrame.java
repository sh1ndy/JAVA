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
		
		button = new JButton();		// ��ư ����
		button.setBounds(100, 100, 250, 100);	// ��ġ�� ������ ����
		button.addActionListener(this);		// �κ�Ʈ �߻��� ����ϰڴ�.
		button.setText("I'm a button!");	// ��ư�� ����
		button.setFocusable(false);		// �׵θ��� �����ش�.
		button.setIcon(icon);		// icon �̹����� ��ư�� ���� �Ѵ�.
		button.setHorizontalTextPosition(JButton.CENTER);	// ��ư�� �������� �ؽ�Ʈ�� ���� �߾ӿ� ��ġ.
		button.setVerticalTextPosition(JButton.BOTTOM);		// ��ư�� �������� �ؽ�Ʈ�� ���� �ٴڿ� ��ġ.
		button.setFont(new Font("Comic Sans", Font.BOLD, 25));	// Font��ü�� �۾�ü, �۾� �β�, �۾� ũ��
		button.setIconTextGap(4);	// �����ܰ� ���ڻ����� ����
		button.setForeground(Color.cyan);	// ���� ����
		button.setBackground(Color.LIGHT_GRAY);	// ��ư ��� ����
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
		// ���࿡ button�� Ŭ������ ���
		if (e.getSource() == button) {
			// �ش� ������ ����϶�
//			System.out.println("poo");
//			// �� �� Ŭ���ϸ� �� �̻� ��� ���ϰ� ����
//			button.setEnabled(false);	// ��� ���ϰ� ���� ���
			// label�� ȭ�鿡 ����ض�
			label.setVisible(true);
		}
		
	}
}
