package jdbc;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginEx extends JFrame {

	private JPanel contentPane;
	private JTextField userid;
	private JPasswordField pwd;
	private JLabel lblResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginEx frame = new LoginEx();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setBounds(12, 30, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1.setBounds(12, 78, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		lblResult = new JLabel("");
		lblResult.setBounds(12, 141, 305, 15);
		contentPane.add(lblResult);
		
		JButton btnLogin = new JButton("\uB85C\uADF8\uC778");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 데이터베이스에 있는 userid
				String strUserId = userid.getText();
				// 데이터베이스에 있는 pwd, String.valueOf(char[]) 문자배열을 스트링으로 변환
				String strPwd = String.valueOf(pwd.getPassword());
				Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				
				try {
					// 프로퍼티 파일 로딩
					FileInputStream fis = new FileInputStream("C:\\Help_JAVA\\java_mysql\\db.prop");
					Properties prop = new Properties();
					prop.load(fis);
					String url = prop.getProperty("url");
					String id = prop.getProperty("id");
					String password = prop.getProperty("password");
					
					// DB 접속
					conn = DriverManager.getConnection(url, id, password);
					// 아이디와 패스워드가 정확한지
					String sql = "SELECT * FROM member WHERE userid=? and pwd=?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, strUserId);	// 1번 물음표
					pstmt.setString(2, strPwd);		// 2번 물음표
					rs = pstmt.executeQuery();	// 실행

					if (rs.next()) {	// 레코드 1개를 읽음, 있으면 true, 없으면 false
						// 레이블 입력
						lblResult.setText(rs.getString("name") + "님 환영합니다.");
					} else { // 로그인 실패
						lblResult.setText("아이디 또는 비밀번호가 일치하지 않습니다.");
					}
					
				} catch (Exception e2) {
					e2.printStackTrace();
				} finally {
					try {
						if (rs != null) {
							rs.close();
						}
					} catch (Exception e3) {
						e3.printStackTrace();
					}
					
					try {
						if (pstmt != null) {
							pstmt.close();
						}
					} catch (Exception e3) {
						e3.printStackTrace();
					}
					
					try {
						if (conn != null) {
							conn.close();
						}
					} catch (Exception e3) {
						e3.printStackTrace();
					}
				}
			}
		});
		btnLogin.setBounds(245, 74, 97, 23);
		contentPane.add(btnLogin);
		
		userid = new JTextField();
		userid.setBounds(81, 27, 116, 21);
		contentPane.add(userid);
		userid.setColumns(10);
		
		pwd = new JPasswordField();
		pwd.setBounds(81, 75, 116, 21);
		contentPane.add(pwd);
	}
}
