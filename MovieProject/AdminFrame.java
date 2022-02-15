package movieProject;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.sql.Date;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;

public class AdminFrame extends JFrame {
	
	private MovieDAO dao;
	private Vector<String> col;  // 테이블 헤더
	private DefaultTableModel model;
	private MovieDTO dto;

	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfGenre;
	private JTextField tfGrade;
	private JTextField tfRating;
	private JTextField tfImage;
	private JTextField tfTime;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminFrame frame = new AdminFrame();
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
	public AdminFrame() { // 생성자
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 671);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		dao = new MovieDAO();
		col = new Vector<String>();
		col.add("제목");
		col.add("장르");
		col.add("연령등급");
		col.add("평점");
		col.add("이미지");
		col.add("시간");
		
		list();
		table = new JTable(model);
		
		JLabel lblNewLabel = new JLabel("\uC81C\uBAA9");
		lblNewLabel.setBounds(12, 33, 57, 15);
		contentPane.add(lblNewLabel);
		
		tfName = new JTextField();
		tfName.setBounds(87, 30, 144, 21);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		JButton btnSave = new JButton("\uC800\uC7A5");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input();
				int result = dao.insertMovie(dto);
				if (result == 1) {
					JOptionPane.showMessageDialog(AdminFrame.this, "저장되었습니다.");
					list();
					table.setModel(model);
					clear();
				}
			}
		});
		btnSave.setBounds(361, 30, 97, 23);
		contentPane.add(btnSave);
		
		JLabel label = new JLabel("\uC7A5\uB974");
		label.setBounds(12, 65, 57, 15);
		contentPane.add(label);
		
		tfGenre = new JTextField();
		tfGenre.setColumns(10);
		tfGenre.setBounds(87, 62, 144, 21);
		contentPane.add(tfGenre);
		
		JButton btnUpdate = new JButton("\uC218\uC815");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input();
				int result = dao.updateMovie(dto);
				if (result == 1) {
					JOptionPane.showMessageDialog(AdminFrame.this, "수정되었습니다.");
					list();
					table.setModel(model);
					clear();
				}
			}
		});
		btnUpdate.setBounds(361, 62, 97, 23);
		contentPane.add(btnUpdate);
		
		JLabel label_1 = new JLabel("\uC5F0\uB839\uB4F1\uAE09");
		label_1.setBounds(12, 94, 57, 15);
		contentPane.add(label_1);
		
		tfGrade = new JTextField();
		tfGrade.setColumns(10);
		tfGrade.setBounds(87, 91, 144, 21);
		contentPane.add(tfGrade);
		
		JButton btnDelete = new JButton("\uC0AD\uC81C");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = tfName.getText();
				int result = 0;
				int response = JOptionPane.showConfirmDialog(AdminFrame.this, "삭제하시겠습니까?");
				if (response == JOptionPane.YES_OPTION) {
					result = dao.deleteMovie(name);
				}
				if (result == 1) {
					JOptionPane.showMessageDialog(AdminFrame.this, "삭제되었습니다.");
					list();
					table.setModel(model);
					clear();
				}
			}
		});
		btnDelete.setBounds(361, 91, 97, 23);
		contentPane.add(btnDelete);
		
		JLabel label_2 = new JLabel("\uD3C9\uC810");
		label_2.setBounds(12, 125, 57, 15);
		contentPane.add(label_2);
		
		tfRating = new JTextField();
		tfRating.setColumns(10);
		tfRating.setBounds(87, 122, 144, 21);
		contentPane.add(tfRating);
		
		JLabel label_3 = new JLabel("\uC774\uBBF8\uC9C0");
		label_3.setBounds(12, 153, 57, 15);
		contentPane.add(label_3);
		
		tfImage = new JTextField();
		tfImage.setColumns(10);
		tfImage.setBounds(87, 150, 144, 21);
		contentPane.add(tfImage);
		
		JLabel label_4 = new JLabel("\uB4F1\uB85D\uC77C\uC790");
		label_4.setBounds(12, 185, 57, 15);
		contentPane.add(label_4);
		
		tfTime = new JTextField();
		tfTime.setColumns(10);
		tfTime.setBounds(87, 182, 144, 21);
		contentPane.add(tfTime);
		
//		JButton btnSearch = new JButton("\uCC3E\uAE30");
//		btnSearch.setBounds(361, 182, 97, 23);
//		contentPane.add(btnSearch);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 220, 457, 402);
		contentPane.add(scrollPane);
		
		table = new JTable(model);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int idx=table.getSelectedRow();
				tfName.setText(table.getValueAt(idx, 0) + "");
				tfGenre.setText(table.getValueAt(idx, 1) + "");
				tfGrade.setText(table.getValueAt(idx, 2) + "");
				tfRating.setText(table.getValueAt(idx, 3) + "");
				tfImage.setText(table.getValueAt(idx, 4) + "");
				tfTime.setText(table.getValueAt(idx, 5) + "");
			}
		});
		scrollPane.setViewportView(table);
		
		JButton btnFileChooser = new JButton("\uC774\uBBF8\uC9C0 \uCC3E\uAE30");
		btnFileChooser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f = chooser.getSelectedFile();
				String fileName = f.getAbsolutePath();
				tfImage.setText(fileName);
			}
		});
		btnFileChooser.setBounds(243, 149, 102, 23);
		contentPane.add(btnFileChooser);
	} // 생성자
	
	public void input() {
		String name = tfName.getText();
		String genre = tfGenre.getText();
		String grade = tfGrade.getText();
		Double rating = Double.parseDouble(tfRating.getText());
		File image = new File(tfImage.getText());
		Date time = Date.valueOf(tfTime.getText()); 
		
		
		dto = new MovieDTO(name, genre, grade, rating, image, time);
	}
	
	public void clear() {
		tfName.setText("");
		tfGenre.setText("");
		tfGrade.setText("");
		tfRating.setText("");
		tfImage.setText("");
		tfTime.setText("");
	}
	
	public void list() {
		model = new DefaultTableModel(dao.listMovie(), col) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
	}
} // class



























