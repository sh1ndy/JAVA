package scoresEx;

import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScoreList extends JFrame {

	private ScoreDAO dao;
	private Vector<String> col; // 테이블의 헤더
	private DefaultTableModel model;
	private ScoreDTO dto;

	private JPanel contentPane;
	private JTextField tfStudentNo;
	private JTextField tfName;
	private JTextField tfKor;
	private JTextField tfEng;
	private JTextField tfMat;
	private JTextField tfSearch;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScoreList frame = new ScoreList();
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
	public ScoreList() { // 생성자
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		dao = new ScoreDAO();
		col = new Vector<String>();
		col.add("학번");
		col.add("이름");
		col.add("국어");
		col.add("영어");
		col.add("수학");
		col.add("총점");
		col.add("평균");

		list();
		table = new JTable(model);

		JLabel lblNewLabel = new JLabel("\uD559\uBC88");
		lblNewLabel.setBounds(12, 32, 57, 15);
		contentPane.add(lblNewLabel);

		tfStudentNo = new JTextField();
		tfStudentNo.setBounds(81, 29, 147, 21);
		contentPane.add(tfStudentNo);
		tfStudentNo.setColumns(10);

		JButton btnSave = new JButton("\uC800\uC7A5");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input();
				int result = dao.insert_score(dto);
				if (result == 1) { // 추가된 레코드수가 1이면
					JOptionPane.showMessageDialog(ScoreList.this, "저장되었습니다."); // 다이얼로그 출력
					list(); // 테이블모델 갱신
					table.setModel(model); // 화면 반영
					clear(); // 텍스트필드 클리어
				}
			}
		});
		btnSave.setBounds(240, 28, 97, 23);
		contentPane.add(btnSave);

		JLabel label = new JLabel("\uC774\uB984");
		label.setBounds(12, 64, 57, 15);
		contentPane.add(label);

		tfName = new JTextField();
		tfName.setColumns(10);
		tfName.setBounds(81, 61, 147, 21);
		contentPane.add(tfName);

		JButton btnUpdate = new JButton("\uC218\uC815");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input();
				int result = dao.update_score(dto);
				if (result == 1) {
					JOptionPane.showMessageDialog(ScoreList.this, "수정되었습니다.");
					list();
					table.setModel(model);
					clear();
				}
			}
		});
		btnUpdate.setBounds(240, 60, 97, 23);
		contentPane.add(btnUpdate);

		JLabel label_1 = new JLabel("\uAD6D\uC5B4");
		label_1.setBounds(12, 103, 57, 15);
		contentPane.add(label_1);

		tfKor = new JTextField();
		tfKor.setColumns(10);
		tfKor.setBounds(81, 100, 147, 21);
		contentPane.add(tfKor);

		JButton dtnDelete = new JButton("\uC0AD\uC81C");
		dtnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String student_no = tfStudentNo.getText(); // 학번
				int result = 0;
				// yes, no 확인
				int response = JOptionPane.showConfirmDialog(ScoreList.this, "삭제하시겠습니까?");
				if (result == JOptionPane.YES_OPTION) { // yes 클릭
					result = dao.delete_score(student_no); // 레코드 삭제
				}
				if (result == 1) { // 삭제된 행이 1이면
					JOptionPane.showMessageDialog(ScoreList.this, "삭제되었습니다.");
					list();
					table.setModel(model);
					clear();
				}
			}
		});
		dtnDelete.setBounds(240, 99, 97, 23);
		contentPane.add(dtnDelete);

		JLabel label_2 = new JLabel("\uC601\uC5B4");
		label_2.setBounds(12, 147, 57, 15);
		contentPane.add(label_2);

		tfEng = new JTextField();
		tfEng.setColumns(10);
		tfEng.setBounds(81, 144, 147, 21);
		contentPane.add(tfEng);

		JLabel label_3 = new JLabel("\uC218\uD559");
		label_3.setBounds(12, 189, 57, 15);
		contentPane.add(label_3);

		tfMat = new JTextField();
		tfMat.setColumns(10);
		tfMat.setBounds(81, 186, 147, 21);
		contentPane.add(tfMat);

		JLabel lbll = new JLabel("\uC774\uB984\uCC3E\uAE30");
		lbll.setBounds(12, 233, 57, 15);
		contentPane.add(lbll);

		tfSearch = new JTextField();
		// 텍스트필드 엔터키 입력
		tfSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search();
			}
		});
		tfSearch.setColumns(10);
		tfSearch.setBounds(81, 230, 147, 21);
		contentPane.add(tfSearch);

		JButton btnSearch = new JButton("\uCC3E\uAE30");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search();
			}
		});
		btnSearch.setBounds(240, 229, 97, 23);
		contentPane.add(btnSearch);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 280, 507, 291);
		contentPane.add(scrollPane);

		table = new JTable(model);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// JTable 클릭한 행의 인덱스 값
				int idx = table.getSelectedRow();
				tfStudentNo.setEditable(false); // 편집 금지
				// getValueAt(row, col)
				tfStudentNo.setText(table.getValueAt(idx, 0) + "");
				tfName.setText(table.getValueAt(idx, 1) + "");
				tfKor.setText(table.getValueAt(idx, 2) + "");
				tfEng.setText(table.getValueAt(idx, 3) + "");
				tfMat.setText(table.getValueAt(idx, 4) + "");

			}
		});
		scrollPane.setViewportView(table);
	} // 생성자

	public void search() {
		String name = tfSearch.getText(); // 텍스트필드.getText() 입력한 텍스트
		model = new DefaultTableModel(dao.search_score(name), col) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table.setModel(model); // JTable에 모델 적용 => 화면 반영
	}

	public void input() {
		String student_no = tfStudentNo.getText();
		String name = tfName.getText();
		// Integer.parseInt(스트링) 스트링을 숫자로
		int kor = Integer.parseInt(tfKor.getText());
		int eng = Integer.parseInt(tfEng.getText());
		int mat = Integer.parseInt(tfMat.getText());
		dto = new ScoreDTO(student_no, name, kor, eng, mat);
	}

	public void clear() {
		tfStudentNo.setText(""); // 텍스트필드 초기화
		tfName.setText("");
		tfKor.setText("");
		tfEng.setText("");
		tfMat.setText("");
		tfStudentNo.requestFocus(); // 입력 포커스 설정
		tfStudentNo.setEditable(true); // 편집 가능 하도록
	}

	public void list() {
		model = new DefaultTableModel(dao.list_score(), col) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
	}

} // class
