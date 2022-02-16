import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class ModAndDelFrame extends JDialog {
	private JTextField movienameSet;
	private JTextField movieratingSet;
	static JTextField moviefileSet;
	private static Frame owner;
	private JTextField moviedateSet;

	public ModAndDelFrame(int a, String genre, String grade) {

		super(owner, "선택 영화  수정 삭제", true);
		movieRepository mr = new movieRepository();
		setSize(600, 487);

		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("영화제목");
		lblNewLabel.setBounds(94, 24, 62, 18);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("영화장르");
		lblNewLabel_1.setBounds(94, 78, 62, 18);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("영화관람등급");
		lblNewLabel_2.setBounds(90, 195, 91, 18);
		getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("영화평점");
		lblNewLabel_3.setBounds(94, 129, 62, 18);
		getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("포스터 파일");
		lblNewLabel_4.setBounds(90, 292, 91, 18);
		getContentPane().add(lblNewLabel_4);

		movienameSet = new JTextField();
		movienameSet.setBounds(94, 42, 370, 24);
		getContentPane().add(movienameSet);
		movienameSet.setColumns(10);
		movienameSet.setText(mr.selectMovie().get(a).getMovie_name());

		movieratingSet = new JTextField();
		movieratingSet.setBounds(94, 159, 375, 24);
		getContentPane().add(movieratingSet);
		movieratingSet.setColumns(10);
		movieratingSet.setText(String.valueOf(mr.selectMovie().get(a).getRating()));

		moviedateSet = new JTextField();
		moviedateSet.setBounds(94, 267, 370, 24);
		getContentPane().add(moviedateSet);
		moviedateSet.setColumns(10);
		moviedateSet.setText(mr.selectMovie().get(a).getDate().toString());

		moviefileSet = new JTextField();
		moviefileSet.setBounds(94, 322, 258, 24);
		getContentPane().add(moviefileSet);
		moviefileSet.setColumns(10);
		moviefileSet.setText(mr.selectMovie().get(a).getFile().getAbsolutePath());

		JButton addPoster = new JButton("사진 첨부");
		addPoster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new UpdateFileOpener().setVisible(true);
			}
		});
		addPoster.setBounds(364, 321, 105, 27);
		getContentPane().add(addPoster);

		JLabel genreString = new JLabel("장르 값 저장하는 곳");
		JLabel gradeString = new JLabel("등급 값 저장하는 곳");

		JButton modMovie = new JButton("수정하기");
		modMovie.setBounds(131, 380, 105, 27);
		getContentPane().add(modMovie);
		ButtonGroup genrebtngroup = new ButtonGroup();

		JButton deleteMovie = new JButton("삭제하기");
		deleteMovie.setBounds(349, 380, 105, 27);
		getContentPane().add(deleteMovie);
		deleteMovie.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				movieRepository mr = new movieRepository();
				mr.deleteMovie(movienameSet.getText());
				MovieInfoList.model1.setRowCount(0);
				MovieInfoList.SelectTitleAndDate();
				dispose();

			}
		});

		JLabel moviedate = new JLabel("등록일자");
		moviedate.setBounds(94, 245, 62, 18);
		getContentPane().add(moviedate);

		genrebtngroup = new ButtonGroup();
		JRadioButton genrnbtn1 = new JRadioButton("공포");
		genrnbtn1.setBounds(94, 94, 62, 27);
		getContentPane().add(genrnbtn1);

		JRadioButton genrnbtn2 = new JRadioButton("액션");
		genrnbtn2.setBounds(166, 94, 62, 27);
		getContentPane().add(genrnbtn2);

		JRadioButton genrnbtn3 = new JRadioButton("멜로");
		genrnbtn3.setBounds(234, 94, 62, 27);
		getContentPane().add(genrnbtn3);

		JRadioButton genrnbtn4 = new JRadioButton("코믹");
		genrnbtn4.setBounds(311, 94, 62, 27);
		getContentPane().add(genrnbtn4);

		JRadioButton genrnbtn5 = new JRadioButton("애니");
		genrnbtn5.setBounds(392, 94, 62, 27);
		getContentPane().add(genrnbtn5);

		ArrayList<JRadioButton> btnarr = new ArrayList<>();
		btnarr.add(genrnbtn1);
		btnarr.add(genrnbtn2);
		btnarr.add(genrnbtn3);
		btnarr.add(genrnbtn4);
		btnarr.add(genrnbtn5);

		genrebtngroup.add(genrnbtn1);
		genrebtngroup.add(genrnbtn2);
		genrebtngroup.add(genrnbtn3);
		genrebtngroup.add(genrnbtn4);
		genrebtngroup.add(genrnbtn5);

		ButtonGroup gradebtngroup = new ButtonGroup();
		JRadioButton gradebtn1 = new JRadioButton("전체 관람가");
		gradebtn1.setBounds(94, 210, 62, 27);
		getContentPane().add(gradebtn1);

		JRadioButton gradebtn2 = new JRadioButton("12세 관람가");
		gradebtn2.setBounds(191, 210, 62, 27);
		getContentPane().add(gradebtn2);

		JRadioButton gradebtn3 = new JRadioButton("15세 관람가");
		gradebtn3.setBounds(289, 210, 62, 27);
		getContentPane().add(gradebtn3);

		JRadioButton gradebtn4 = new JRadioButton("청소년 관람불가");
		gradebtn4.setBounds(394, 210, 62, 27);
		getContentPane().add(gradebtn4);
		ArrayList<JRadioButton> btnarr2 = new ArrayList<>();
		btnarr2.add(gradebtn1);
		btnarr2.add(gradebtn2);
		btnarr2.add(gradebtn3);
		btnarr2.add(gradebtn4);
		gradebtngroup.add(gradebtn1);
		gradebtngroup.add(gradebtn2);
		gradebtngroup.add(gradebtn3);
		gradebtngroup.add(gradebtn4);

		// 영화 정보에 맞게 뜨는 것
		if (genre.equals(genrnbtn1.getText())) {
			genrnbtn1.setSelected(true);
		} else if (genre.equals(genrnbtn2.getText())) {
			genrnbtn2.setSelected(true);
		} else if (genre.equals(genrnbtn3.getText())) {
			genrnbtn3.setSelected(true);
		} else if (genre.equals(genrnbtn4.getText())) {
			genrnbtn4.setSelected(true);
		} else if (genre.equals(genrnbtn5.getText())) {
			genrnbtn5.setSelected(true);
		}

		if (grade.equals(gradebtn1.getText())) {
			gradebtn1.setSelected(true);
		} else if (grade.equals(gradebtn2.getText())) {
			gradebtn2.setSelected(true);
		} else if (grade.equals(gradebtn3.getText())) {
			gradebtn3.setSelected(true);
		} else if (grade.equals(gradebtn4.getText())) {
			gradebtn4.setSelected(true);
		}

		modMovie.addActionListener(new ActionListener() {
			movieRepository mr = new movieRepository();

			@Override
			public void actionPerformed(ActionEvent e) {

				if (genrnbtn1.isSelected()) {
					genreString.setText(genrnbtn1.getText());
				} else if (genrnbtn2.isSelected()) {
					genreString.setText(genrnbtn2.getText());
				} else if (genrnbtn3.isSelected()) {
					genreString.setText(genrnbtn3.getText());
				} else if (genrnbtn4.isSelected()) {
					genreString.setText(genrnbtn4.getText());
				} else if (genrnbtn5.isSelected()) {
					genreString.setText(genrnbtn5.getText());
				}

				if (gradebtn1.isSelected()) {
					gradeString.setText(gradebtn1.getText());
				} else if (gradebtn2.isSelected()) {
					gradeString.setText(gradebtn2.getText());
				} else if (gradebtn3.isSelected()) {
					gradeString.setText(gradebtn3.getText());
				} else if (gradebtn4.isSelected()) {
					gradeString.setText(gradebtn4.getText());
				}

				Movie modMovie = new Movie(movienameSet.getText(), genreString.getText(), gradeString.getText(),
						Double.valueOf(movieratingSet.getText()), new File(moviefileSet.getText()),
						LocalDate.parse(moviedateSet.getText()));
				int k = mr.getMovieId(mr.selectMovie().get(a).getMovie_name());
				mr.updatedMovie(modMovie, k);
				MovieInfoList.model1.setRowCount(0);
				MovieInfoList.SelectTitleAndDate();
				dispose();

			}
		});

	}
}
