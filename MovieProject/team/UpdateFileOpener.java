
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UpdateFileOpener extends JDialog {

	private static Frame owner;
	File selectedFile;

	public UpdateFileOpener() {
		super(owner, "포스터 수정하기", true);

		JPanel textpnl = new JPanel();
		JTextField imageFileName2 = new JTextField(10);

		JPanel btnpnl = new JPanel();
		JButton open2 = new JButton("파일 열기");
		JButton save2 = new JButton("포스터 저장");

		textpnl.add(imageFileName2);
		btnpnl.add(open2);
		btnpnl.add(save2);
		add(btnpnl, "North");
		add(textpnl, "Center");
		pack();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		ActionListener li = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Object o = e.getSource();
				if (o == open2) {
					JFileChooser chooser = new JFileChooser();
					chooser.setCurrentDirectory(new File("C:/"));

					chooser.showOpenDialog(getParent());
					selectedFile = chooser.getSelectedFile();
					imageFileName2.setText(selectedFile.toString());

				} else if (o == save2) {
					ModAndDelFrame.moviefileSet.setText(imageFileName2.getText());
					UpdateFileOpener.this.setVisible(false);
				}
			}
		};

		open2.addActionListener(li);
		save2.addActionListener(li);

	}

}