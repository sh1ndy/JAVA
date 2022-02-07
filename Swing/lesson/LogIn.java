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
		// 패널 만들기
		JPanel panel = new JPanel();
		// 글자쓰기용도
		JLabel label = new JLabel("ID : ");
		JLabel paswrd = new JLabel("Password : ");
		// 한줄에 글자를 넣을때 자주 사용
		JTextField txtID = new JTextField(10);
		// 자동으로 암호화 출력 (패스워드에서만 사용)
		JPasswordField txtPass = new JPasswordField(10);
		// 버튼 추가
		JButton logBtn = new JButton("Log In");
		
		// 패널안에 label, txtID, paswrd, txtPass 추가
		panel.add(label);
		panel.add(txtID);
		panel.add(paswrd);
		panel.add(txtPass);
		panel.add(logBtn);
		
		// 프레임에 패널 추가
		add(panel);
		
		// 버튼 클릭시 기능 추가
		logBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 아이디, 비밀번호 설정
				String id = "Dan";
				String pass = "1234";
				
				// 1. 조건식 아이디와 입력 값이 같고 패스워드와 입력한 값이 같으면
				if (id.equals(txtID.getText()) && pass.equals(txtPass.getText())) {
					// 2. 해당 메세지를 다이어로그 창으로 뛰어줘라.
					JOptionPane.showMessageDialog(null, "You have logged in successfully");
				} else {
					JOptionPane.showMessageDialog(null, "You failed to log in");
				}
			}
		});
		
		// 화면에 프레임 출력
		setVisible(true);
		// 프레임 크기
		setSize(600,400);
		// 프레임 화면 센터에 출력
		setLocationRelativeTo(null);
		// 프레임 크기 조절 불가능
		setResizable(false);
		// 종료 했을때 모든걸 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new LogIn();
	}

}
