package ch09_OpenNewWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {
	
	JFrame frame = new JFrame();	// ������ ����
	JButton myButton = new JButton("New Window"); 	// ��ư ����
	
	LaunchPage() {
		
		myButton.setBounds(100, 160, 200, 40);	// ��ư�� ������ġ, ������ġ, ����ũ��, ����ũ��
		myButton.setFocusable(false);	// ��ư �׵θ� ����
		myButton.addActionListener(this);
		
		frame.add(myButton);	// ��ư�� �����ӿ� �߰� �Ѵ�.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���α׷� ����
		frame.setSize(420, 420);	// ������ ������ ����
		frame.setLayout(null); 	// ������ ���̾ƿ� ����
		frame.setVisible(true); // ������ ȭ�� ���
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// myButton Ŭ�� �� �߻��ϴ� �̺�Ʈ
		// myButton�� Ŭ���� �ߴٸ�
		if (e.getSource() == myButton) {
			// myButton�� Ŭ�� ���� �� frame�� ������� �Ѵ�. == setVisible(false)
			frame.dispose();
			// myWindow ��ü�� �����ض�.
			NewWindow myWindow = new NewWindow();
		}
		
	}

}
