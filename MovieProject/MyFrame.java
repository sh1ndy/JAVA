package movieProject;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//import LoginPage;

public class MyFrame extends JFrame {
	// header ���� panel, label ��ü ����
	JPanel titlePanel = new JPanel();
	JLabel titleLabel = new JLabel();

	// menu ���� panel, button ��ü ����
	JPanel menuPanel = new JPanel();
	JComboBox genreButton;
	JButton gradeButton;
	JComboBox rankButton;

	// movieList ����
	JPanel moveiListPanel = new JPanel();
	JButton mList1 = new JButton();
	JButton mList2 = new JButton();
	JButton mList3 = new JButton();
	JButton mList4 = new JButton();
	JButton mList5 = new JButton();
	JButton mList6 = new JButton();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JLabel label4 = new JLabel();
	JLabel label5 = new JLabel();
	JLabel label6 = new JLabel();

	// movieList Image ����
	// ����
	ImageIcon icon1 = new ImageIcon("./images/1.jpg");
	Image img1 = icon1.getImage();
	Image changeImg1 = img1.getScaledInstance(145, 245, Image.SCALE_SMOOTH);
	ImageIcon changeIcon1 = new ImageIcon(changeImg1);

	// ŷ����Ŀ
	ImageIcon icon2 = new ImageIcon("./images/2.jpg");
	Image img2 = icon2.getImage();
	Image changeImg2 = img2.getScaledInstance(145, 245, Image.SCALE_SMOOTH);
	ImageIcon changeIcon2 = new ImageIcon(changeImg2);

	// �����̴���
	ImageIcon icon3 = new ImageIcon("./images/3.jpg");
	Image img3 = icon3.getImage();
	Image changeImg3 = img3.getScaledInstance(145, 245, Image.SCALE_SMOOTH);
	ImageIcon changeIcon3 = new ImageIcon(changeImg3);

	// ��2�Դ�
	ImageIcon icon4 = new ImageIcon("./images/4.jpg");
	Image img4 = icon4.getImage();
	Image changeImg4 = img4.getScaledInstance(145, 245, Image.SCALE_SMOOTH);
	ImageIcon changeIcon4 = new ImageIcon(changeImg4);

	// Ư��
	ImageIcon icon5 = new ImageIcon("./images/5.jpg");
	Image img5 = icon5.getImage();
	Image changeImg5 = img5.getScaledInstance(145, 245, Image.SCALE_SMOOTH);
	ImageIcon changeIcon5 = new ImageIcon(changeImg5);

	// ŷ����
	ImageIcon icon6 = new ImageIcon("./images/6.jpg");
	Image img6 = icon6.getImage();
	Image changeImg6 = img6.getScaledInstance(145, 245, Image.SCALE_SMOOTH);
	ImageIcon changeIcon6 = new ImageIcon(changeImg6);
	
	// Admin Login ����
	JPanel footerPanel = new JPanel();
	JButton adminLogin;

	MyFrame() {

		// ============ Start Frame ============
		super("Movie List");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 740);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		// ============ End Frame ============

		// ============ Start Header ============
		// �ش� ��
		titleLabel.setText("�츮���� �� ��ȭ ����Ʈ");
		titleLabel.setSize(400, 20);
		titleLabel.setLocation(10, 18);
		titleLabel.setFont(new Font("Courier", Font.BOLD, 15));

		// �ش� �г�
		titlePanel.setSize(500, 60);
		titlePanel.setLayout(null);
		titlePanel.setBackground(Color.WHITE);

		// �ش� �гο� �� �߰�
		titlePanel.add(titleLabel);
		// ============ End Header ============

		// ============ Start Menu ============
		// �帣�� ��ư
		String[] greneList = {"�帣�� ����", "����", "�׼�", "���", "�ڹ�", "�ִ�"};
		genreButton = new JComboBox(greneList);
		genreButton.setBounds(180, 5, 110, 20);
		genreButton.setFocusable(false);
		genreButton.setBackground(Color.WHITE);
		genreButton.setBorder(BorderFactory.createEmptyBorder());

		// ������ ��ư
		gradeButton = new JButton("������");
		gradeButton.setBounds(300, 5, 60, 20);
		gradeButton.setFocusable(false);
		gradeButton.setBackground(Color.WHITE);
		gradeButton.setBorder(BorderFactory.createEmptyBorder());

		// ��޺� ��ư
		String[] rankList = {"��޺�", "12�� ������", "15�� ������", "19�� ������"};
		rankButton = new JComboBox(rankList);
		rankButton.setBounds(380, 5, 110, 20);
		rankButton.setFocusable(false);
		rankButton.setBackground(Color.WHITE);
		rankButton.setBorder(BorderFactory.createEmptyBorder());

		// �޴� �г�
		menuPanel.setBounds(0, 60, 500, 30);
		menuPanel.setBackground(Color.WHITE);
		menuPanel.setLayout(null);

		// �޴� �гο� ��ư �߰�
		menuPanel.add(genreButton);
		menuPanel.add(gradeButton);
		menuPanel.add(rankButton);
		// ============ End Menu ============

		// ============ Start Movie List ============
		
		// ��ġ [] = 0, 0
		label1.setText("15��");
		label1.setFont(new Font(null, Font.BOLD, 11));
		label1.setForeground(Color.BLACK);
		label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setBounds(105, 5, 35, 35);
		label1.setOpaque(true);
		label1.setBackground(Color.ORANGE);
		
		// ��ġ [] = 0, 1
		label2.setText("15��");
		label2.setFont(new Font(null, Font.BOLD, 11));
		label2.setForeground(Color.BLACK);
		label2.setHorizontalAlignment(JLabel.CENTER);
		label2.setBounds(105, 5, 35, 35);
		label2.setOpaque(true);
		label2.setBackground(Color.ORANGE);
		
		// ��ġ [] = 0, 2
		label3.setText("15��");
		label3.setFont(new Font(null, Font.BOLD, 11));
		label3.setForeground(Color.BLACK);
		label3.setHorizontalAlignment(JLabel.CENTER);
		label3.setBounds(105, 5, 35, 35);
		label3.setOpaque(true);
		label3.setBackground(Color.ORANGE);
		
		// ��ġ [] = 1, 0
		label4.setText("12��");
		label4.setFont(new Font(null, Font.BOLD, 11));
		label4.setForeground(Color.BLACK);
		label4.setHorizontalAlignment(JLabel.CENTER);
		label4.setBounds(105, 5, 35, 35);
		label4.setOpaque(true);
		label4.setBackground(Color.CYAN);
		
		// ��ġ [] = 1, 1
		label5.setText("15��");
		label5.setFont(new Font(null, Font.BOLD, 11));
		label5.setForeground(Color.BLACK);
		label5.setHorizontalAlignment(JLabel.CENTER);
		label5.setBounds(105, 5, 35, 35);
		label5.setOpaque(true);
		label5.setBackground(Color.ORANGE);
		
		// ��ġ [] = 1, 2
		label6.setText("19��");
		label6.setFont(new Font(null, Font.BOLD, 11));
		label6.setForeground(Color.BLACK);
		label6.setHorizontalAlignment(JLabel.CENTER);
		label6.setBounds(105, 5, 35, 35);
		label6.setOpaque(true);
		label6.setBackground(Color.RED);
		
		// ��ġ [] = 1, 3
		mList1.setLayout(null);
		mList2.setLayout(null);
		mList3.setLayout(null);
		mList4.setLayout(null);
		mList5.setLayout(null);
		mList6.setLayout(null);
		
		mList1.add(label1);
		mList2.add(label2);
		mList3.add(label3);
		mList4.add(label4);
		mList5.add(label5);
		mList6.add(label6);
		

		mList1.setIcon(changeIcon1);
		mList2.setIcon(changeIcon2);
		mList3.setIcon(changeIcon3);
		mList4.setIcon(changeIcon4);
		mList5.setIcon(changeIcon5);
		mList6.setIcon(changeIcon6);
		
		mList1.add(label1);

		moveiListPanel.setBounds(20, 110, 462, 500);
		moveiListPanel.setBackground(Color.WHITE);
		moveiListPanel.setLayout(new GridLayout(2, 3, 10, 40));

		moveiListPanel.add(mList1);
		moveiListPanel.add(mList2);
		moveiListPanel.add(mList3);
		moveiListPanel.add(mList4);
		moveiListPanel.add(mList5);
		moveiListPanel.add(mList6);

		// ============ End Movie List ============

		// ============ Start Admin Login ============
		adminLogin = new JButton("������ �α���");
		adminLogin.setBounds(340, 5, 140, 30);
		adminLogin.setFocusable(false);
		adminLogin.setBackground(Color.WHITE);
		adminLogin.setBorder(BorderFactory.createEmptyBorder());
		
		adminLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				LoginPage lp = new LoginPage();
				lp.setVisible(true);
			}
			
		});
		
		
		footerPanel.setBounds(0, 641, 500, 40);
		footerPanel.setBackground(Color.WHITE);
		footerPanel.setLayout(null);
		
		footerPanel.add(adminLogin);
		// ============ End Admin Login ============

		// �����ӿ� �߰�
		this.add(footerPanel);
		this.add(moveiListPanel);
		this.add(menuPanel);
		this.add(titlePanel);
		this.getContentPane().setBackground(Color.WHITE);
		this.setVisible(true);

	}

}
