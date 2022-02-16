import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class MainGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI frame = new MainGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// ����
	public MainGUI() {
		movieRepository mr = new movieRepository();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 667);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		// contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("�츮���� �� ��ȭ ����Ʈ");
		lblNewLabel.setFont(new Font("HY�︪��B", Font.BOLD, 22));
		lblNewLabel.setBounds(22, 10, 273, 51);
		contentPane.add(lblNewLabel);
		contentPane.setLayout(null);

		// ������ ��ư
		JButton btnGrade = new JButton("������");
		btnGrade.setFont(new Font("�������", Font.PLAIN, 12));
		btnGrade.setBackground(Color.WHITE);
		btnGrade.setBounds(308, 64, 69, 23);
		contentPane.add(btnGrade);

		// ������ �α���
		JButton adminBtn = new JButton("������ �α���");
		adminBtn.setForeground(Color.GRAY);
		adminBtn.setFont(new Font("����", Font.PLAIN, 12));
		adminBtn.setIcon(new ImageIcon("C:/Users/WINUSER/git/220209-Movie/220209-Movie/src/icon1.png"));
		adminBtn.setBackground(Color.WHITE);
		adminBtn.setBounds(308, 572, 146, 30);
		contentPane.add(adminBtn);

		// ���� ��ȭ ����Ʈ
		JPanel panel = new JPanel(new GridLayout(0, 2));
		panel.setBounds(22, 102, 429, 458);
		contentPane.add(panel);
		JScrollPane scroll = new JScrollPane(panel);
		scroll.setBounds(22, 102, 429, 458);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		contentPane.add(scroll);

		for (int i = 0; i < mr.selectMovie().size(); i++) {
			int k = i;
			JPanel sub = new JPanel();
			sub.setLayout(new BoxLayout(sub, BoxLayout.Y_AXIS));
			ImageIcon iIcon = new ImageIcon(mr.selectMovie().get(i).getFile().getAbsolutePath());
			Image ximg = iIcon.getImage();
			Image yimg = ximg.getScaledInstance(170, 200, java.awt.Image.SCALE_SMOOTH);
			ImageIcon xyimg = new ImageIcon(yimg);
			JButton poster = new JButton(xyimg);
			poster.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					InfoReview infoReview = new InfoReview(k);
					infoReview.setVisible(true);
				}
				
			});
			JLabel rating = new JLabel(String.valueOf(mr.selectMovie().get(i).getRating()));
			sub.add(poster);
			sub.add(rating);
			panel.add(sub);

		}
		// ���� ��ȭ ����Ʈ

		// ������ �α���
		adminBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Login();
			}
		});

		String[] genres = { "�帣��", "����", "�׼�", "���", "�ڹ�", "�ִ�" };
		JComboBox gradecomboBox = new JComboBox(genres);
		gradecomboBox.setBackground(Color.WHITE);
		gradecomboBox.setBounds(240, 64, 69, 23);
		contentPane.add(gradecomboBox);

		String[] ratings = { "��޺� ", "��ü ������", "12�� ������", "15�� ������", "û�ҳ� �����Ұ�" };
		JComboBox ratingcomboBox = new JComboBox(ratings);
		gradecomboBox.setBackground(Color.WHITE);
		ratingcomboBox.setBounds(376, 64, 78, 23);
		contentPane.add(ratingcomboBox);

	}
}