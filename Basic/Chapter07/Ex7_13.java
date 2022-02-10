package ex13;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ex7_13 {

	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occureed!!!");
			}
		});
	}

}
