package ch11_JDialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	JButton button = new JButton();
	MyJDialog jdl;

	public MyFrame() {
		super("여기가 타이틀이다!");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setLayout(null);
		this.add(button);
		this.setVisible(true);
		
		button.setText("Click Me!");
		button.setBounds(90, 60, 100, 50);
		
		 jdl = new MyJDialog(this, "dialog title");
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jdl.setVisible(true);
				
			}
			
		});
		
		
		
	}
	
}
