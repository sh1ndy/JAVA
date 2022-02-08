package ch11_JDialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyJDialog extends JDialog implements ActionListener {
	JButton button = new JButton();
	JTextField tf = new JTextField();
	
	MyJDialog(JFrame frame, String title) {
		super(frame, title);
		this.setSize(200, 200);
		this.setLayout(null);
		this.setVisible(false);
		this.add(button);
		this.add(tf);
		
		button.setText("OK");
		button.setBounds(50, 50, 60, 30);
		button.addActionListener(this);
		tf.setBounds(30, 30, 100, 20);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(tf.getText());
	}

}
