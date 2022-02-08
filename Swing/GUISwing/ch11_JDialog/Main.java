package ch11_JDialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyDialog extends JDialog {
	JButton button = new JButton("OK!!");
	JTextField tf = new JTextField();

	MyDialog(JFrame frame, String title) {
		super(frame, title);
		this.setLayout(null);
		this.setSize(400, 200);
		this.add(button);
		this.add(tf);
		
		tf.setBounds(20, 20, 100, 20);
		button.setBounds(50, 50, 100, 20);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}

		});
		
	}
}

class DialogEx extends JFrame {
	MyDialog dialog;

	DialogEx() {
		super("DialogEx 예제 프레임");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton button = new JButton("show dialog");

		dialog = new MyDialog(this, "Test Dialog");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}

		});

		this.add(button);
		this.setSize(250, 200);
		this.setVisible(true);

	}
}

public class Main {

	public static void main(String[] args) {

		new DialogEx();

	}

}
