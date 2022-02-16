import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import java.awt.Label;
import javax.swing.JEditorPane;

public class InfoAdd extends JDialog {
	
	private MovieInfoList mvList;
	private JPanel contentPane;
	private File selected;
	
	// JFrame�� --> JDialog�� �ٲ�. ���̺� ������ ���ؼ�
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					InfoAdd frame = new InfoAdd();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public InfoAdd(MovieInfoList mvList) {
		super(mvList, "��ȭ���â", true);
		this.mvList = mvList;
		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 535);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("��ȭ���");
		lblNewLabel.setFont(new Font("HY������M", Font.BOLD, 20));
		lblNewLabel.setBounds(22, 0, 157, 43);
		contentPane.add(lblNewLabel);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(22, 47, 448, 72);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JLabel mname = new JLabel("��ȭ�̸�");
		mname.setFont(new Font("HY������M", Font.PLAIN, 12));
		mname.setBounds(12, 10, 57, 15);
		panel1.add(mname);
		
		JTextField movie_name = new JTextField();
		movie_name.setBounds(12, 30, 420, 32);
		panel1.add(movie_name);
		movie_name.setColumns(10);
		movie_name.setText("");
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(22, 129, 448, 64);
		contentPane.add(panel2);
		
		JLabel movie_genre = new JLabel("�帣");
		movie_genre.setFont(new Font("HY������M", Font.PLAIN, 12));
		movie_genre.setBounds(12, 10, 57, 15);
		panel2.add(movie_genre);
		
		// ��ư �׷�ȭ
		ButtonGroup genreGroup = new ButtonGroup(); 
	      
		JRadioButton genre1 = new JRadioButton("����");
		genre1.setBounds(22, 30, 57, 23);
		panel2.add(genre1);
		
		JRadioButton genre2 = new JRadioButton("�׼�");
		genre2.setBounds(86, 30, 57, 23);
		panel2.add(genre2);
		
		JRadioButton genre3 = new JRadioButton("���");
		genre3.setBounds(153, 30, 57, 23);
		panel2.add(genre3);
		
		JRadioButton genre4 = new JRadioButton("�ڹ�");
		genre4.setBounds(223, 30, 57, 23);
		panel2.add(genre4);
		
		JRadioButton genre5 = new JRadioButton("�ִ�");
		genre5.setBounds(293, 30, 57, 23);
		panel2.add(genre5);
		
		// �׷� ��ư �߰�
		genreGroup.add(genre1);
		genreGroup.add(genre2);
		genreGroup.add(genre3);
		genreGroup.add(genre4);
		genreGroup.add(genre5);
		

		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBounds(22, 203, 448, 72);
		contentPane.add(panel3);
		
		JLabel movie_rating = new JLabel("����");
		movie_rating.setFont(new Font("HY������M", Font.PLAIN, 12));
		movie_rating.setBounds(12, 10, 57, 15);
		panel3.add(movie_rating);
		
		JTextField mvRating = new JTextField();
		mvRating.setColumns(10);
		mvRating.setBounds(12, 30, 420, 32);
		panel3.add(mvRating);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBounds(22, 284, 448, 63);
		contentPane.add(panel4);
		
		JLabel movie_grade = new JLabel("���");
		movie_grade.setFont(new Font("HY������M", Font.PLAIN, 12));
		movie_grade.setBounds(12, 10, 57, 15);
		panel4.add(movie_grade);
		
		ButtonGroup gradeGroup = new ButtonGroup(); 
		
		JRadioButton grade1 = new JRadioButton("��ü ������");
		grade1.setBounds(8, 31, 94, 23);
		panel4.add(grade1);
		
		JRadioButton grade2 = new JRadioButton("12�� ������");
		grade2.setBounds(106, 31, 97, 23);
		panel4.add(grade2);
		
		JRadioButton grade3 = new JRadioButton("15�� ������");
		grade3.setBounds(207, 31, 94, 23);
		panel4.add(grade3);
		
		JRadioButton grade4 = new JRadioButton("û�ҳ� �����Ұ�");
		grade4.setBounds(305, 31, 135, 23);
		panel4.add(grade4);
		
		gradeGroup.add(grade1);
		gradeGroup.add(grade2);
		gradeGroup.add(grade3);
		gradeGroup.add(grade4);

		
		JPanel panel5 = new JPanel();
		panel5.setLayout(null);
		panel5.setBounds(22, 355, 448, 72);
		contentPane.add(panel5);
		
		JLabel movie_ratring_1 = new JLabel("�̹���");
		movie_ratring_1.setFont(new Font("HY������M", Font.PLAIN, 12));
		movie_ratring_1.setBounds(12, 10, 57, 15);
		panel5.add(movie_ratring_1);
		
		JButton fileBtn = new JButton("÷������");
		fileBtn.setBounds(12, 35, 92, 23);
		panel5.add(fileBtn);
		
		JLabel imgFileName = new JLabel("");
		imgFileName.setBackground(new Color(255, 255, 255));
		imgFileName.setBounds(110, 35, 311, 23);
		panel5.add(imgFileName);
		
		
		fileBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// ������ �ڵ��ε� �ϴ� �� �ǵ�ھ��~
//				JFileChooser chooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory()); // ���丮 ����
//		        chooser.setCurrentDirectory(new File("/")); // ���� ��� ���丮�� ����
//		        chooser.setAcceptAllFileFilterUsed(true);   // Fileter ��� ���� ���� 
//		        chooser.setDialogTitle("Ÿ��Ʋ"); // â�� ����
//		        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); // ���� ���� ���
//		        
//		        FileNameExtensionFilter filter = new FileNameExtensionFilter("Binary File", "cd11"); // filter Ȯ���� �߰�
//		        chooser.setFileFilter(filter); // ���� ���͸� �߰�
//		        
//		        int returnVal = chooser.showOpenDialog(null); // ����� â ����
//		        
//		        if(returnVal == JFileChooser.APPROVE_OPTION) { // ���⸦ Ŭ�� 
//		            folderPath = chooser.getSelectedFile().toString();
//		            setName("imgRoute");
//		            if (getName() == "imgRoute") {
//		            	imgFileName.setText(folderPath);
//					}
//		        } else if(returnVal == JFileChooser.CANCEL_OPTION){ // ��Ҹ� Ŭ��
//		            System.out.println("cancel"); 
//		            folderPath = "";
//		        }
		        
				// ���� ���� �� �� ��ٷ����� �ؽ��� ����
				selected = openFileChooser();
				
				if (selected != null) {
					
					imgFileName.setText(selected.getAbsolutePath());
					imageCopy(selected);
				}
				
			}
			
			// ??? �뵵�� �𸣰���
//			private void getText(String folderPath) {
//				// TODO Auto-generated method stub
//				
//			}
			
		});
		
		JButton btnAdd = new JButton("��ȭ���");
		btnAdd.setForeground(SystemColor.text);
		btnAdd.setBackground(SystemColor.textHighlight);
		btnAdd.setBounds(268, 441, 97, 33);
		contentPane.add(btnAdd);
		
		JLabel genreValue = new JLabel("�帣 �� �����ϴ� ��");
		JLabel gradeValue = new JLabel("��� �� �����ϴ� ��");
		
		// ��ȭ��� �̺�Ʈ
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				movieRepository mr = new movieRepository();
				
				String name = movie_name.getText();
				String genre = genreValue.getText();
				String grade = gradeValue.getText();
				double rating = Double.valueOf(mvRating.getText());
				File image = imageCopy(selected);
				LocalDate date = LocalDate.now();
				
				mr.insert(new Movie(name, genre, grade, rating, image, date));
				
				dispose();
			}
		});
		
		// �帣 ��ư �̺�Ʈ
		ActionListener genreListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Object check = e.getSource();
				if (genre1 == check) {
					genreValue.setText(genre1.getText());
				} else if (genre2 == check) {
					genreValue.setText(genre2.getText());
				} else if (genre3 == check) {
					genreValue.setText(genre3.getText());
				} else if (genre4 == check) {
					genreValue.setText(genre4.getText());
				} else if (genre5 == check) {
					genreValue.setText(genre5.getText());
				}
			}
		};
		genre1.addActionListener(genreListener);
		genre2.addActionListener(genreListener);
		genre3.addActionListener(genreListener);
		genre4.addActionListener(genreListener);
		genre5.addActionListener(genreListener);
		
		// ��� ��ư �̺�Ʈ
		ActionListener gradeListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Object check = e.getSource();
				if (grade1 == check) {
					gradeValue.setText(grade1.getText());
				} else if (grade2 == check) {
					gradeValue.setText(grade2.getText());
				} else if (grade3 == check) {
					gradeValue.setText(grade3.getText());
				} else if (grade4 == check) {
					gradeValue.setText(grade4.getText());
				}
			}
		};
		grade1.addActionListener(gradeListener);
		grade2.addActionListener(gradeListener);
		grade3.addActionListener(gradeListener);
		grade4.addActionListener(gradeListener);
		
		JButton btnclose = new JButton("���");
		btnclose.setForeground(Color.WHITE);
		btnclose.setBackground(SystemColor.controlShadow);
		btnclose.setBounds(374, 441, 97, 33);
		contentPane.add(btnclose);
		
		// ������
		btnclose.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						 dispose();
					}
				});
		
	}
	
	// ���� ����
	private File openFileChooser() {
		JFileChooser chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File("c:\\"));
		
		int result = chooser.showOpenDialog(this);
		
		if (result == JFileChooser.APPROVE_OPTION) {
			File selected = chooser.getSelectedFile();
			return selected;
		}
		return null;
		
	}
	
	// ���� �̹��� ���� �о �ƿ�ǲ ��ο� ���� �� ����
		private File imageCopy(File selected) {
			FileInputStream in = null;
			FileOutputStream out = null;
			
			try {
				in = new FileInputStream(selected);
				out = new FileOutputStream("c:\\aaa\\movieFolder\\" + selected.getName());
				
				int copy;
				while ((copy = in.read()) != -1) {
					out.write(copy);
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				 e.printStackTrace();
			} finally {
				if (in != null) {
					try {
						in.close();
					} catch (IOException e) {
						
					}
				}
				if (out != null) {
					try {
						out.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			File fileCopy = new File("c:\\aaa\\movieFolder\\" + selected.getName());
			return fileCopy;
			
		}
}

