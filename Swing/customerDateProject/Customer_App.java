import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class Customer_App {

	private JFrame frame;
	private JTextField id;
	private JPasswordField password;
	private JLabel lblPassword;
	private JButton btnLogIn;
	private JPanel mainPanel;
	private JLabel lblNewLabel_2;
	private JTextField name;
	private JTextField phone;
	private JTextField age;
	private JTextField birthday;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_App window = new Customer_App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Customer_App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		ImagePanel welcomePanel = new ImagePanel(new ImageIcon("C:/Help_JAVA/Lesson/image/welcome.jpg").getImage());
		welcomePanel.setBounds(0, 0, 634, 376);
		frame.setSize(welcomePanel.getWidth(), welcomePanel.getHeight());
		
		mainPanel = new JPanel();
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setBounds(0, 0, 634, 376);
		frame.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		mainPanel.setVisible(false);
		
		lblNewLabel_2 = new JLabel("Welcome This is Main Panel");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 23));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(60, 24, 477, 39);
		mainPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(43, 73, 122, 39);
		mainPanel.add(lblNewLabel_3);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("Arial", Font.PLAIN, 18));
		lblAge.setBounds(43, 137, 122, 39);
		mainPanel.add(lblAge);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setFont(new Font("Arial", Font.PLAIN, 18));
		lblGender.setBounds(43, 202, 122, 39);
		mainPanel.add(lblGender);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhone.setFont(new Font("Arial", Font.PLAIN, 18));
		lblPhone.setBounds(309, 73, 122, 39);
		mainPanel.add(lblPhone);
		
		JLabel lblBirthday = new JLabel("Birthday");
		lblBirthday.setHorizontalAlignment(SwingConstants.CENTER);
		lblBirthday.setFont(new Font("Arial", Font.PLAIN, 18));
		lblBirthday.setBounds(309, 137, 122, 39);
		mainPanel.add(lblBirthday);
		
		JLabel lblNote = new JLabel("Note");
		lblNote.setHorizontalAlignment(SwingConstants.CENTER);
		lblNote.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNote.setBounds(309, 202, 122, 39);
		mainPanel.add(lblNote);
		
		name = new JTextField();
		name.setFont(new Font("Arial", Font.PLAIN, 18));
		name.setBounds(146, 73, 170, 39);
		mainPanel.add(name);
		name.setColumns(10);
		
		phone = new JTextField();
		phone.setFont(new Font("Arial", Font.PLAIN, 18));
		phone.setColumns(10);
		phone.setBounds(408, 73, 170, 39);
		mainPanel.add(phone);
		
		age = new JTextField();
		age.setFont(new Font("Arial", Font.PLAIN, 18));
		age.setColumns(10);
		age.setBounds(146, 137, 170, 39);
		mainPanel.add(age);
		
		birthday = new JTextField();
		birthday.setFont(new Font("Arial", Font.PLAIN, 18));
		birthday.setColumns(10);
		birthday.setBounds(408, 137, 170, 39);
		mainPanel.add(birthday);
		
		JComboBox gender = new JComboBox(new String[] {"Male", "Female"});
		gender.setFont(new Font("Arial", Font.PLAIN, 18));
		gender.setBackground(Color.WHITE);
		gender.setBounds(146, 203, 170, 39);
		mainPanel.add(gender);
		
		JTextArea note = new JTextArea();
		note.setBounds(406, 202, 172, 95);
		mainPanel.add(note);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nameTxt = name.getText();
				String ageTxt = age.getText();
				String phoneTxt = phone.getText();
				String bTxt = birthday.getText();
				// 콤보 박스 받는 법
				String genderTxt = gender.getSelectedItem().toString();
				String noteTxt = note.getText();
				
			}
			
		});
		btnNewButton.setBounds(219, 322, 181, 33);
		mainPanel.add(btnNewButton);
		frame.getContentPane().add(welcomePanel);
		
		JLabel lblNewLabel = new JLabel("Log In");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(246, 43, 102, 47);
		welcomePanel.add(lblNewLabel);
		
		id = new JTextField();
		id.setFont(new Font("Arial", Font.PLAIN, 20));
		id.setForeground(Color.BLACK);
		id.setToolTipText("");
		id.setBounds(190, 129, 238, 32);
		welcomePanel.add(id);
		id.setColumns(10);
		
		password = new JPasswordField();
		password.setFont(new Font("Arial", Font.PLAIN, 20));
		password.setBounds(190, 212, 238, 32);
		welcomePanel.add(password);
		
		JLabel lblNewLabel_1 = new JLabel("ID :");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(190, 93, 44, 33);
		welcomePanel.add(lblNewLabel_1);
		
		lblPassword = new JLabel("Password :");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Arial", Font.BOLD, 20));
		lblPassword.setBounds(190, 179, 121, 33);
		welcomePanel.add(lblPassword);
		
		btnLogIn = new JButton("");
		btnLogIn.setIcon(new ImageIcon("C:\\Help_JAVA\\Lesson\\image\\loginbutton.jpg"));
		// 버튼이 눌렸을 때 이미지 바뀌는 효과
		btnLogIn.setPressedIcon(new ImageIcon("C:\\Help_JAVA\\Lesson\\image\\loginbutton_click.jpg"));
		btnLogIn.setBounds(197, 269, 231, 47);
		btnLogIn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (id.getText().equals("Danny") && Arrays.equals(password.getPassword(), "hello".toCharArray())) {
					System.out.println("welcome Danny");
					welcomePanel.setVisible(false);
					mainPanel.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "You failed to log in");
				}
				// 아이디가 맞는지 확인 하는 조건
//				if (id.getText().equals("Danny")) {
//					System.out.println("Hey Danny");
//				}
				
				// 비밀번호가 hello가 맞는지 확인
				// password는 char[] 이라서 Arrays eqauls 연산자 사용
//				if (Arrays.equals(password.getPassword(), "hello".toCharArray())) {
//					System.out.println("You are right");
//				}
			}
			
		});
		
		
		welcomePanel.add(btnLogIn);
		// 메튜바 추가
		frame.setJMenuBar(menuBar());
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	// 메뉴타 메서드
	public JMenuBar menuBar() {
		// 메뉴바 생성
		JMenuBar bar = new JMenuBar();
		
		// file 메뉴 만들기
		JMenu fileMenu = new JMenu("File");
		// about 메뉴 만들기
		JMenu aboutMenu = new JMenu("About");
		
		// bar에 fileMenu, aboutMenu 추가
		bar.add(fileMenu);
		bar.add(aboutMenu);
		
		// 아이템 추가
		JMenuItem openFile = new JMenuItem("Open");
		JMenuItem exit = new JMenuItem("Exit");
		
		// fileMenu에 openFile, exit 아이템 추가
		fileMenu.add(openFile);
		fileMenu.addSeparator();	// 사이에 줄 생성;
		fileMenu.add(exit);
		
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 프로그램 종료;
				System.exit(0);
			}
			
		});
		
		return bar;
	}
}

//나만의 JPanel 생성
class ImagePanel extends JPanel {
	// 이미지 불러 오기
	private Image img;
	
	// 이미지 객체 생성
	public ImagePanel(Image img) {
		this.img = img;
		// 이미지 사이즈 자동
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		// 레이아웃 우리가 원하는 위치 가능
		setLayout(null);
	}
	
	public int getWidth() {
		// 이미지의 가로넓이를 받을 수 있음
		return img.getWidth(null);
	}
	
	public int getHeight() {
		// 이미지의 높이를 받을 수 있음
		return img.getHeight(null);
	}
	
	// 백그라운드 이미지 넣는 메서드
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}
