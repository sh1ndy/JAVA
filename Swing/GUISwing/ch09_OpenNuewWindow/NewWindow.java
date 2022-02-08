package ch09_OpenNewWindow;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Hello!");
	
	// NewWindow ��ü�� ������ (��ü�� ���� �ʰ� ���ÿ� �Ͼ�� �ϵ�)
	NewWindow() {
		label.setBounds(0, 0, 100, 50);		// label�� ��ġ ũ�� ���� (���� ��ġ, ���� ��ġ, ����ũ��, ���� ũ��)
		label.setFont(new Font(null, Font.PLAIN, 25));	// label ��Ʈ ������ ���� (�۾�ü, �۾� �β�, �۾� ũ��)
		
		frame.add(label);	// frame�� label �߰�
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���α׷� ����
		frame.setSize(420, 420);	// ������ ������ ����
		frame.setLayout(null); 	// ������ ���̾ƿ� ����
		frame.setVisible(true); // ������ ȭ�� ���
	}
	

}
