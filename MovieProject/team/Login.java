import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Login extends JFrame{

	private JPanel loginPanel = new JPanel();
	private JLabel idLabel = new JLabel("���̵� ");
	private JLabel pwLabel = new JLabel("��й�ȣ ");
	private JTextField idText = new JTextField();
	private JPasswordField pwText = new JPasswordField();
	private JButton loginBtn = new JButton("�α���");
	private final JLabel lblNewLabel = new JLabel("������ �α���");
	
	private final String IDL ="admin";
	private final String PWDL ="admin1";


	
	public Login() {
	
	super("������ �α���");
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
	lblNewLabel.setFont(new Font("HY������M", Font.BOLD, 18));
	lblNewLabel.setBounds(117, 24, 147, 30);
	loginPanel.add(lblNewLabel);
	
	
	setSize(389,283);
	this.setLocationRelativeTo(null);
	this.setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	//�α��� ��ư�� ��������
	
	loginBtn.addActionListener(new ActionListener() {
	
		public void actionPerformed(ActionEvent e) {
		
			//���̵� ��� Ȯ�� 
			
			String id = idText.getText().trim();
			String pw = pwText.getText().trim();
			
				if(id.equals(IDL) && pw.equals(PWDL)) {
					JOptionPane.showMessageDialog(null, "�α��� ����", "�α��� Ȯ��!", JOptionPane.DEFAULT_OPTION);
					dispose();
					new MovieInfoList().setVisible(true);
				} else if(id.length() == 0 || pw.length() == 0) {
				
					JOptionPane.showMessageDialog(null, "���̵� �Ǵ� ��й�ȣ�� �Է� �ϼž� �˴ϴ�.", "���̵� �Ǵ� ��й�ȣ�� �Է� �ϼž� �˴ϴ�.", JOptionPane.DEFAULT_OPTION);
					return;
				
				}  else {	
					JOptionPane.showMessageDialog(null, "�α��� ����", "�α��� Ȯ��!", JOptionPane.DEFAULT_OPTION);
				}
			}
		});
	
	}
	
	
	public static void main(String[] args) {
		new Login();	
	}

}
