
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.time.LocalDate;

import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class InfoReview extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField reText;
	private JPasswordField repwField;
	protected JLabel reviewT;
	private JTable table;

	public InfoReview(int a) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 497, 760);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
/////// 기본 레이블 변경 안함 ////////
		JLabel lblNewLabel = new JLabel("우리들이 본 영화 리스트");
		lblNewLabel.setFont(new Font("HY헤드라인M", Font.BOLD, 18));
		lblNewLabel.setBounds(22, 21, 294, 27);
		contentPane.add(lblNewLabel);

		JLabel reGenre = new JLabel("장르");
		reGenre.setFont(new Font("HY헤드라인M", Font.BOLD, 15));
		reGenre.setBounds(210, 110, 74, 27);
		contentPane.add(reGenre);

		JLabel gradelbl = new JLabel("관람등급");
		gradelbl.setFont(new Font("HY헤드라인M", Font.BOLD, 15));
		gradelbl.setBounds(210, 161, 74, 27);
		contentPane.add(gradelbl);

		JLabel genrelbl = new JLabel("평점");
		genrelbl.setFont(new Font("HY헤드라인M", Font.BOLD, 15));
		genrelbl.setBounds(210, 213, 74, 27);
		contentPane.add(genrelbl);

		movieRepository mr = new movieRepository();

		/// 선택 영화 제목
		JLabel mTitle = new JLabel();
		mTitle.setVerticalAlignment(SwingConstants.TOP);
		mTitle.setFont(new Font("HY헤드라인M", Font.BOLD, 16));
		mTitle.setBounds(210, 68, 234, 36);
		contentPane.add(mTitle);
		mTitle.setText(mr.selectMovie().get(a).getMovie_name());

		/// 선택 영화 포스터
		JLabel posterSet = new JLabel(new ImageIcon(mr.selectMovie().get(a).getFile().getAbsolutePath()));
		posterSet.setBounds(32, 60, 164, 183);
		contentPane.add(posterSet);

		/// 선택 영화 장르
		JLabel genreSet = new JLabel("");
		genreSet.setFont(new Font("HY헤드라인M", Font.PLAIN, 15));
		genreSet.setBounds(298, 110, 152, 27);
		contentPane.add(genreSet);
		genreSet.setText(mr.selectMovie().get(a).getGenre());
		// 선택 영화관람등급
		JLabel gradeSet = new JLabel("");
		gradeSet.setFont(new Font("HY헤드라인M", Font.PLAIN, 15));
		gradeSet.setBounds(302, 161, 163, 27);
		contentPane.add(gradeSet);
		gradeSet.setText(mr.selectMovie().get(a).getGrade());
		// 선택 영화 평점
		JLabel ratingSet = new JLabel("");
		ratingSet.setFont(new Font("HY헤드라인M", Font.PLAIN, 15));
		ratingSet.setBounds(302, 213, 152, 27);
		contentPane.add(ratingSet);
		ratingSet.setText("★" + String.valueOf(mr.selectMovie().get(a).getRating()));

		JPanel rePanel1_1_1 = new JPanel();
		rePanel1_1_1.setBackground(SystemColor.textHighlightText);
		rePanel1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		rePanel1_1_1.setLayout(null);
		rePanel1_1_1.setBounds(22, 273, 433, 90);
		contentPane.add(rePanel1_1_1);

		JLabel nickname = new JLabel("작성자");
		nickname.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 13));
		nickname.setBounds(12, 13, 57, 15);
		rePanel1_1_1.add(nickname);

		textField = new JTextField();
		textField.setBounds(70, 10, 104, 21);
		rePanel1_1_1.add(textField);
		textField.setColumns(10);
		textField.setText("");

		JLabel pwT = new JLabel("비밀번호");
		pwT.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 13));
		pwT.setBounds(186, 13, 68, 15);
		rePanel1_1_1.add(pwT);

		JButton confirmBtn = new JButton("등록");
		confirmBtn.setBounds(350, 10, 68, 23);
		rePanel1_1_1.add(confirmBtn);
		confirmBtn.setForeground(SystemColor.controlLtHighlight);
		confirmBtn.setBackground(SystemColor.controlShadow);

		reText = new JTextField();
		reText.setBounds(12, 45, 406, 30);
		rePanel1_1_1.add(reText);
		reText.setColumns(10);
		reText.setText("");

		repwField = new JPasswordField();
		repwField.setBounds(245, 11, 87, 21);
		rePanel1_1_1.add(repwField);
		repwField.setText("");

		table = new JTable();

		contentPane.add(table);

		JTable table = new JTable();
		table.setShowVerticalLines(false);

		table.setModel(new DefaultTableModel(

				new String[][] { { "김김김", "너무 재밌어용" }, { "최최최", "ㅇㅇㅇㄹ" }, { "ㅇㄹㄴㅇㄹ", "ㄴㅇㄹㄴㅇㄹㄴㅇㄹ" } },
				new String[] { "닉네임 ", "리뷰" }));

		JScrollPane scroll = new JScrollPane(table);
		scroll.setBounds(22, 387, 433, 285);
		getContentPane().add(scroll);

		confirmBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "작성자를 입력하세요", "작성자 확인", JOptionPane.DEFAULT_OPTION);
					return;
				} else if (repwField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호를입력하세요", "비밀번호 확인", JOptionPane.DEFAULT_OPTION);
					return;
				} else if (reText.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "리뷰를 입력하세요", "리뷰 확인", JOptionPane.DEFAULT_OPTION);
					return;
				} else {
					String rename = textField.getText();
					String rePW = repwField.getText();
					String reviewT = reText.getText();

					System.out.println(rename + rePW + reviewT);
					InputReview remt = new InputReview();

					remt.insert(new Review(rename, rePW, reviewT));

					JOptionPane.showMessageDialog(null, "리뷰를 등록했습니다.", "리뷰 등록", JOptionPane.DEFAULT_OPTION);
					textField.setText("");
					repwField.setText("");
					reText.setText("");
				}

			}
		});
	}
}
