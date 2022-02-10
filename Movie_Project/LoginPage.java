import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage extends JFrame {
	JLabel titleLabel = new JLabel();
	JLabel idLabel = new JLabel();
	JLabel pwLabel = new JLabel();
	JTextField idTextField = new JTextField();
	JPasswordField pwTextField = new JPasswordField();
	JButton summitBtn = new JButton();
	
	LoginPage() {
		// ============ Start Title Label ============
		titleLabel.setText("로그인");
		titleLabel.setFont(new Font(null, Font.BOLD, 25));
		titleLabel.setBounds(100, 5, 80, 50);
		// ============ End Title Label ============
		
		// ============ Start ID Label, TextField ============
		idLabel.setText("ID ");
		idLabel.setFont(new Font("Consolas", Font.BOLD, 16));
		idLabel.setBounds(10, 60, 70, 30);
		
		idTextField.setBounds(40, 60, 150, 30);
		idTextField.setBackground(Color.LIGHT_GRAY);
		idTextField.setBorder(BorderFactory.createEmptyBorder());
		// ============ End ID Label, TextField ============
		
		// ============ Start PW Label, TextField ============
		pwLabel.setText("PW ");
		pwLabel.setFont(new Font("Consolas", Font.BOLD, 16));
		pwLabel.setBounds(10, 100, 70, 30);
		
		pwTextField.setBounds(40, 100, 150, 30);
		pwTextField.setBackground(Color.LIGHT_GRAY);
		pwTextField.setBorder(BorderFactory.createEmptyBorder());
		// ============ End PW Label, TextField ============
		
		// ============ Start Login Summit Button ============
		summitBtn.setBounds(195, 60, 80, 70);
		summitBtn.setText("로그인");
		summitBtn.setFocusable(false);
		
		summitBtn.addActionListener(new ActionListener() {
			String id = "admin";
			String pw = "admin";
			@Override
			public void actionPerformed(ActionEvent e) {
				if (id.equals(idTextField.getText()) && Arrays.equals(pwTextField.getPassword(), pw.toCharArray())) {
					System.out.println("welcome");
					setVisible(false);
					AdminMainPage adminPage = new AdminMainPage();
					adminPage.setVisible(true);
				}
			}
			
		});
		// ============ Start Login Summit Button ============
		
		this.add(summitBtn);
		this.add(pwLabel);
		this.add(pwTextField);
		this.add(idTextField);
		this.add(titleLabel);
		this.add(idLabel);		
		
		this.setSize(300, 200);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setTitle("관리자 로그인");
		this.setVisible(false);
		this.getContentPane().setBackground(Color.WHITE);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 사용안함
	}

}
