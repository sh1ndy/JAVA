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
	
	// JFrame을 --> JDialog로 바꿈. 테이블 갱신을 위해서
	
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
		super(mvList, "영화등록창", true);
		this.mvList = mvList;
		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 535);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("영화등록");
		lblNewLabel.setFont(new Font("HY헤드라인M", Font.BOLD, 20));
		lblNewLabel.setBounds(22, 0, 157, 43);
		contentPane.add(lblNewLabel);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(22, 47, 448, 72);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JLabel mname = new JLabel("영화이름");
		mname.setFont(new Font("HY헤드라인M", Font.PLAIN, 12));
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
		
		JLabel movie_genre = new JLabel("장르");
		movie_genre.setFont(new Font("HY헤드라인M", Font.PLAIN, 12));
		movie_genre.setBounds(12, 10, 57, 15);
		panel2.add(movie_genre);
		
		// 버튼 그룹화
		ButtonGroup genreGroup = new ButtonGroup(); 
	      
		JRadioButton genre1 = new JRadioButton("공포");
		genre1.setBounds(22, 30, 57, 23);
		panel2.add(genre1);
		
		JRadioButton genre2 = new JRadioButton("액션");
		genre2.setBounds(86, 30, 57, 23);
		panel2.add(genre2);
		
		JRadioButton genre3 = new JRadioButton("멜로");
		genre3.setBounds(153, 30, 57, 23);
		panel2.add(genre3);
		
		JRadioButton genre4 = new JRadioButton("코믹");
		genre4.setBounds(223, 30, 57, 23);
		panel2.add(genre4);
		
		JRadioButton genre5 = new JRadioButton("애니");
		genre5.setBounds(293, 30, 57, 23);
		panel2.add(genre5);
		
		// 그룹 버튼 추가
		genreGroup.add(genre1);
		genreGroup.add(genre2);
		genreGroup.add(genre3);
		genreGroup.add(genre4);
		genreGroup.add(genre5);
		

		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBounds(22, 203, 448, 72);
		contentPane.add(panel3);
		
		JLabel movie_rating = new JLabel("평점");
		movie_rating.setFont(new Font("HY헤드라인M", Font.PLAIN, 12));
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
		
		JLabel movie_grade = new JLabel("등급");
		movie_grade.setFont(new Font("HY헤드라인M", Font.PLAIN, 12));
		movie_grade.setBounds(12, 10, 57, 15);
		panel4.add(movie_grade);
		
		ButtonGroup gradeGroup = new ButtonGroup(); 
		
		JRadioButton grade1 = new JRadioButton("전체 관람가");
		grade1.setBounds(8, 31, 94, 23);
		panel4.add(grade1);
		
		JRadioButton grade2 = new JRadioButton("12세 관람가");
		grade2.setBounds(106, 31, 97, 23);
		panel4.add(grade2);
		
		JRadioButton grade3 = new JRadioButton("15세 관람가");
		grade3.setBounds(207, 31, 94, 23);
		panel4.add(grade3);
		
		JRadioButton grade4 = new JRadioButton("청소년 관람불가");
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
		
		JLabel movie_ratring_1 = new JLabel("이미지");
		movie_ratring_1.setFont(new Font("HY헤드라인M", Font.PLAIN, 12));
		movie_ratring_1.setBounds(12, 10, 57, 15);
		panel5.add(movie_ratring_1);
		
		JButton fileBtn = new JButton("첨부파일");
		fileBtn.setBounds(12, 35, 92, 23);
		panel5.add(fileBtn);
		
		JLabel imgFileName = new JLabel("");
		imgFileName.setBackground(new Color(255, 255, 255));
		imgFileName.setBounds(110, 35, 311, 23);
		panel5.add(imgFileName);
		
		
		fileBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// 은영씨 코드인데 일단 안 건들겠어요~
//				JFileChooser chooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory()); // 디렉토리 설정
//		        chooser.setCurrentDirectory(new File("/")); // 현재 사용 디렉토리를 지정
//		        chooser.setAcceptAllFileFilterUsed(true);   // Fileter 모든 파일 적용 
//		        chooser.setDialogTitle("타이틀"); // 창의 제목
//		        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); // 파일 선택 모드
//		        
//		        FileNameExtensionFilter filter = new FileNameExtensionFilter("Binary File", "cd11"); // filter 확장자 추가
//		        chooser.setFileFilter(filter); // 파일 필터를 추가
//		        
//		        int returnVal = chooser.showOpenDialog(null); // 열기용 창 오픈
//		        
//		        if(returnVal == JFileChooser.APPROVE_OPTION) { // 열기를 클릭 
//		            folderPath = chooser.getSelectedFile().toString();
//		            setName("imgRoute");
//		            if (getName() == "imgRoute") {
//		            	imgFileName.setText(folderPath);
//					}
//		        } else if(returnVal == JFileChooser.CANCEL_OPTION){ // 취소를 클릭
//		            System.out.println("cancel"); 
//		            folderPath = "";
//		        }
		        
				// 사진 선택 후 좀 기다려야지 텍스쳐 나옴
				selected = openFileChooser();
				
				if (selected != null) {
					
					imgFileName.setText(selected.getAbsolutePath());
					imageCopy(selected);
				}
				
			}
			
			// ??? 용도를 모르겠음
//			private void getText(String folderPath) {
//				// TODO Auto-generated method stub
//				
//			}
			
		});
		
		JButton btnAdd = new JButton("영화등록");
		btnAdd.setForeground(SystemColor.text);
		btnAdd.setBackground(SystemColor.textHighlight);
		btnAdd.setBounds(268, 441, 97, 33);
		contentPane.add(btnAdd);
		
		JLabel genreValue = new JLabel("장르 값 저장하는 곳");
		JLabel gradeValue = new JLabel("등급 값 저장하는 곳");
		
		// 영화등록 이벤트
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
		
		// 장르 버튼 이벤트
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
		
		// 등급 버튼 이벤트
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
		
		JButton btnclose = new JButton("취소");
		btnclose.setForeground(Color.WHITE);
		btnclose.setBackground(SystemColor.controlShadow);
		btnclose.setBounds(374, 441, 97, 33);
		contentPane.add(btnclose);
		
		// 등록취소
		btnclose.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						 dispose();
					}
				});
		
	}
	
	// 파일 열기
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
	
	// 선택 이미지 파일 읽어서 아웃풋 경로에 복사 후 리턴
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

