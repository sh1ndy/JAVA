import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AdminMainPage extends JFrame {
	MyDriverInfo m = new MyDriverInfo();
	JButton insertBtn = new JButton();
	JPanel panel = new JPanel();
	
	private Vector<Vector> data;
	private Vector<String> in;
	private Vector<String> title;
	private Connection conn = null;
	private Statement stmt = null;
	

	private void getData() {
		try {
			Class.forName(m.getDriver());
			conn = DriverManager.getConnection(m.getUrl(), m.getUserName(), m.getPassword());
			stmt = conn.createStatement();
			String sql = "SELECT * FROM movie_list";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				in = new Vector<>();
				in.add(rs.getString(1));
				in.add(rs.getString(2));
				in.add(rs.getString(3));
				in.add(rs.getString(4));
				in.add(rs.getString(5));
				in.add(rs.getString(6));
				
				data.add(in);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public AdminMainPage() {
		super("관리자 페이지");
		data = new Vector<>();
		title = new Vector<>();

		title.add("id");
		title.add("movie_name");
		title.add("genre");
		title.add("grade");
		title.add("rating");
		title.add("image");

		getData();

		JTable table = new JTable(data, title);
		table.setSize(750, 200);
		table.setPreferredScrollableViewportSize(new Dimension(750, 280));
		JScrollPane sp = new JScrollPane(table);
		sp.setLocation(0, 50);

//		Container c = getContentPane();
//		c.setSize(1000, 1000);
		insertBtn.setText("등록");
		insertBtn.setBackground(Color.GRAY);
		insertBtn.setForeground(Color.WHITE);
		insertBtn.setFocusable(false);
		
//		this.add(insertBtn);
		panel.add(sp);
		panel.add(insertBtn);
		panel.setSize(10, 30);
		panel.setOpaque(true);
		panel.setBackground(Color.WHITE);
		this.add(panel);
		this.setLocation(300, 300);
		this.setSize(800, 400);

//		pack();

		this.setVisible(false);

	}

}
