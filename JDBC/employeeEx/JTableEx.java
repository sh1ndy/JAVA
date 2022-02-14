package employeeEx;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import scoresEx.ScoreDAO;

public class JTableEx extends JFrame {

	private JPanel contentPane;
	private JTable table;
	
	private Vector data, cols; //������, �����ʵ�

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTableEx frame = new JTableEx();
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
	public JTableEx() { //������
		cols = new Vector(); //���� ����
		cols.add("�й�"); //����.add(������)
		cols.add("�̸�");
		cols.add("����");
		cols.add("����");
		cols.add("����");
		cols.add("����");
		cols.add("���");
		ScoreDAO dao = new ScoreDAO();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		DefaultTableModel model = new DefaultTableModel(dao.list_score(), cols) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false; //�� ������ ���� �ɼ�
			}
		};
		table = new JTable(model); //���̺� ������ ����
		scrollPane.setViewportView(table);
	}

}






















