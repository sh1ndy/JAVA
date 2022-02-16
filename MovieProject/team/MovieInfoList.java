import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Label;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.awt.Font;
import javax.swing.ImageIcon;

public class MovieInfoList extends JFrame {

	private JPanel contentPane;
	static DefaultTableModel model1;
	private JPanel tablePnl;

	public MovieInfoList() {
		super("영화목록");

		JPanel top = new JPanel();
		JPanel list = new JPanel();
		JLabel movieList = new JLabel("영화목록");
		JButton enrollment = new JButton("영화 등록");

		// jtable
		Object ob[][] = new Object[0][2];
		String head[] = { "영화 제목", "등록일" };
		model1 = new DefaultTableModel(ob, head);
		JTable table = new JTable(model1);
		JScrollPane scroll = new JScrollPane(table);
		SelectTitleAndDate();

		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me) {
				movieRepository rs = new movieRepository();
				int clickBtn = me.getButton();
				if (clickBtn == 1) {
					int row = table.getSelectedRow();
					String grade = rs.selectMovie().get(row).getGrade();
					String genre = rs.selectMovie().get(row).getGenre();
					new ModAndDelFrame(row, genre, grade).setVisible(true);
				}
			}

		});

		// 영화 등록 이벤튼
		ActionListener enrollListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				InfoAdd inA = new InfoAdd(MovieInfoList.this);
				inA.setVisible(true);

				// 테이블 갱신
				model1.setRowCount(0);
				SelectTitleAndDate();
			}
		};
		enrollment.addActionListener(enrollListener);

		top.add(movieList);
		top.add(enrollment);

		list.add(scroll);

		add(list, "Center");
		add(top, "North");

		setSize(500, 500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	// 영화 제목, 날짜 조회 후 테이블로 주입
	public static void SelectTitleAndDate() {

		String query = "SELECT movie_name, time FROM movie";

		try (Connection conn = ConnectionProvider.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet re = stmt.executeQuery(query);) {

			while (re.next()) {
				String name = re.getString("movie_name");
				LocalDate date = re.getDate("time").toLocalDate();

				Object data[] = { name, date };
				model1.addRow(data);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// UI 변경하니 오류가 많이 떠서 다 주석처리했어요.

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MovieInfoList frame = new MovieInfoList();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
//	
//
//	public MovieInfoList() {
//		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//		setBounds(100, 100, 464, 452);
//		setLocation(450,0);
//		contentPane = new JPanel();
//		contentPane.setBackground(Color.WHITE);
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//		
//		Label labelTitle = new Label("LIST");
//		labelTitle.setAlignment(Label.CENTER);
//		labelTitle.setForeground(Color.WHITE);
//		labelTitle.setBackground(Color.BLACK);
//		labelTitle.setBounds(24, 53, 283, 31);
//		contentPane.add(labelTitle);
//		
//		Label labelDate = new Label("DATE");
//		labelDate.setForeground(Color.WHITE);
//		labelDate.setBackground(Color.BLACK);
//		labelDate.setAlignment(Label.CENTER);
//		labelDate.setBounds(313, 53, 111, 31);
//		contentPane.add(labelDate);
//		
//		JLayeredPane LP1 = new JLayeredPane();
//		LP1.setBounds(24, 93, 400, 31);
//		contentPane.add(LP1);
//		
//		// 제목 + 날짜 1
//		JButton btnTitle1 = new JButton("영화제목");
//		btnTitle1.setBackground(SystemColor.control);
//		btnTitle1.setHorizontalAlignment(SwingConstants.LEFT);
//		btnTitle1.setBounds(0, 0, 282, 30);
//		LP1.add(btnTitle1);
//		
//		Label date1 = new Label("2022-02-10");
//		date1.setBackground(SystemColor.controlHighlight);
//		date1.setAlignment(Label.CENTER);
//		date1.setBounds(288, 0, 112, 31);
//		LP1.add(date1);
//		
//		// 제목 + 날짜 2
//		JLayeredPane LP2 = new JLayeredPane();
//		LP2.setBounds(24, 130, 400, 31);
//		contentPane.add(LP2);
//		
//		JButton btnTitle2 = new JButton("영화제목");
//		btnTitle2.setHorizontalAlignment(SwingConstants.LEFT);
//		btnTitle2.setBackground(SystemColor.menu);
//		btnTitle2.setBounds(0, 0, 282, 30);
//		LP2.add(btnTitle2);
//		
//		Label date2 = new Label("2022-02-10");
//		date2.setBackground(SystemColor.controlHighlight);
//		date2.setAlignment(Label.CENTER);
//		date2.setBounds(288, 0, 112, 31);
//		LP2.add(date2);
//		
//		// 제목 + 날짜 3
//		JLayeredPane LP3 = new JLayeredPane();
//		LP3.setBounds(24, 167, 400, 31);
//		contentPane.add(LP3);
//		
//		JButton btnTitle3 = new JButton("영화제목");
//		btnTitle3.setHorizontalAlignment(SwingConstants.LEFT);
//		btnTitle3.setBackground(SystemColor.menu);
//		btnTitle3.setBounds(0, 0, 282, 30);
//		LP3.add(btnTitle3);
//		
//		Label date3 = new Label("2022-02-10");
//		date3.setBackground(SystemColor.controlHighlight);
//		date3.setAlignment(Label.CENTER);
//		date3.setBounds(288, 0, 112, 31);
//		LP3.add(date3);
//		
//		// 제목 + 날짜 4
//		JLayeredPane LP4 = new JLayeredPane();
//		LP4.setBounds(24, 204, 400, 31);
//		contentPane.add(LP4);
//		
//		JButton btnTitle4 = new JButton("영화제목");
//		btnTitle4.setHorizontalAlignment(SwingConstants.LEFT);
//		btnTitle4.setBackground(SystemColor.menu);
//		btnTitle4.setBounds(0, 0, 282, 30);
//		LP4.add(btnTitle4);
//		
//		Label date4 = new Label("2022-02-10");
//		date4.setBackground(SystemColor.controlHighlight);
//		date4.setAlignment(Label.CENTER);
//		date4.setBounds(288, 0, 112, 31);
//		LP4.add(date4);
//		
//		// 제목 + 날짜 5
//		JLayeredPane LP5 = new JLayeredPane();
//		LP5.setBounds(24, 240, 400, 31);
//		contentPane.add(LP5);
//		
//		JButton btnTitle5 = new JButton("영화제목");
//		btnTitle5.setHorizontalAlignment(SwingConstants.LEFT);
//		btnTitle5.setBackground(SystemColor.menu);
//		btnTitle5.setBounds(0, 0, 282, 30);
//		LP5.add(btnTitle5);
//		
//		Label date5 = new Label("2022-02-10");
//		date5.setBackground(SystemColor.controlHighlight);
//		date5.setAlignment(Label.CENTER);
//		date5.setBounds(288, 0, 112, 31);
//		LP5.add(date5);
//		
//		JButton applyBtn = new JButton(" 등록");
//		applyBtn.setIcon(new ImageIcon("C:/Users/WINUSER/git/220209-Movie/220209-Movie/src/plus.png"));
//		applyBtn.setForeground(Color.WHITE);
//		applyBtn.setBackground(new Color(65, 105, 225));
//		applyBtn.setBounds(313, 22, 111, 23);
//		contentPane.add(applyBtn);
//		
//		
//			applyBtn.addActionListener(new ActionListener() {
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						new InfoAdd().setVisible(true);
//						
//						
//					}
//				});
//		
//		
//		JLabel lblNewLabel = new JLabel("영화목록");
//		lblNewLabel.setFont(new Font("HY헤드라인M", Font.BOLD, 18));
//		lblNewLabel.setBounds(24, 10, 111, 37);
//		contentPane.add(lblNewLabel);
//		
//		
//	}
}