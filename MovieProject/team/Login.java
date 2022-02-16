import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Login extends JFrame{

	private JPanel loginPanel = new JPanel();
	private JLabel idLabel = new JLabel("아이디 ");
	private JLabel pwLabel = new JLabel("비밀번호 ");
	private JTextField idText = new JTextField();
	private JPasswordField pwText = new JPasswordField();
	private JButton loginBtn = new JButton("로그인");
	private final JLabel lblNewLabel = new JLabel("관리자 로그인");
	
	private final String IDL ="admin";
	private final String PWDL ="admin1";


	
	public Login() {
	
	super("관리자 로그인");
	loginPanel.setBackground(SystemColor.text);
	
	
	this.setContentPane(loginPanel);
	loginPanel.setLayout(null);
	idLabel.setBounds(70, 83, 70, 40);
	
	loginPanel.add(idLabel);
	idText.setBackground(SystemColor.control);
	idText.setBounds(139, 83, 167, 40);
	
	loginPanel.add(idText);
	pwLabel.setBounds(70, 133, 70, 40);
	
	loginPanel.add(pwLabel);
	pwText.setBackground(SystemColor.control);
	pwText.setBounds(139, 134, 167, 40);
	
	loginPanel.add(pwText);
	loginBtn.setForeground(SystemColor.textHighlightText);
	loginBtn.setBackground(SystemColor.textHighlight);
	loginBtn.setBounds(0, 204, 373, 40);
	
	loginPanel.add(loginBtn);
	
	
	idLabel.setHorizontalAlignment(SwingConstants.LEFT);
	
	pwLabel.setHorizontalAlignment(SwingConstants.LEFT);
	lblNewLabel.setIcon(new ImageIcon("C:/Users/WINUSER/git/220209-Movie/220209-Movie/src/icon1.png"));
	lblNewLabel.setFont(new Font("HY헤드라인M", Font.BOLD, 18));
	lblNewLabel.setBounds(117, 24, 147, 30);
	loginPanel.add(lblNewLabel);
	
	
	setSize(389,283);
	this.setLocationRelativeTo(null);
	this.setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	//로그인 버튼을 눌렀을때
	
	loginBtn.addActionListener(new ActionListener() {
	
		public void actionPerformed(ActionEvent e) {
		
			//아이디 비번 확인 
			
			String id = idText.getText().trim();
			String pw = pwText.getText().trim();
			
				if(id.equals(IDL) && pw.equals(PWDL)) {
					JOptionPane.showMessageDialog(null, "로그인 성공", "로그인 확인!", JOptionPane.DEFAULT_OPTION);
					dispose();
					new MovieInfoList().setVisible(true);
				} else if(id.length() == 0 || pw.length() == 0) {
				
					JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호를 입력 하셔야 됩니다.", "아이디 또는 비밀번호를 입력 하셔야 됩니다.", JOptionPane.DEFAULT_OPTION);
					return;
				
				}  else {	
					JOptionPane.showMessageDialog(null, "로그인 실패", "로그인 확인!", JOptionPane.DEFAULT_OPTION);
				}
			}
		});
	
	}
	
	
	public static void main(String[] args) {
		new Login();	
	}

}
