package day0323;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EventHandle implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!!!");
	}
	
}

public class InnerEx7 {

	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new EventHandle());
	}

}
