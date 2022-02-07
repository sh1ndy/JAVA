import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogIn extends JFrame {
	public LogIn() {
		// �г� �����
		JPanel panel = new JPanel();
		// ���ھ���뵵
		JLabel label = new JLabel("ID : ");
		JLabel paswrd = new JLabel("Password : ");
		// ���ٿ� ���ڸ� ������ ���� ���
		JTextField txtID = new JTextField(10);
		// �ڵ����� ��ȣȭ ��� (�н����忡���� ���)
		JPasswordField txtPass = new JPasswordField(10);
		// ��ư �߰�
		JButton logBtn = new JButton("Log In");
		
		// �гξȿ� label, txtID, paswrd, txtPass �߰�
		panel.add(label);
		panel.add(txtID);
		panel.add(paswrd);
		panel.add(txtPass);
		panel.add(logBtn);
		
		// �����ӿ� �г� �߰�
		add(panel);
		
		// ��ư Ŭ���� ��� �߰�
		logBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ���̵�, ��й�ȣ ����
				String id = "Dan";
				String pass = "1234";
				
				// 1. ���ǽ� ���̵�� �Է� ���� ���� �н������ �Է��� ���� ������
				if (id.equals(txtID.getText()) && pass.equals(txtPass.getText())) {
					// 2. �ش� �޼����� ���̾�α� â���� �پ����.
					JOptionPane.showMessageDialog(null, "You have logged in successfully");
				} else {
					JOptionPane.showMessageDialog(null, "You failed to log in");
				}
			}
		});
		
		// ȭ�鿡 ������ ���
		setVisible(true);
		// ������ ũ��
		setSize(600,400);
		// ������ ȭ�� ���Ϳ� ���
		setLocationRelativeTo(null);
		// ������ ũ�� ���� �Ұ���
		setResizable(false);
		// ���� ������ ���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new LogIn();
	}

}
