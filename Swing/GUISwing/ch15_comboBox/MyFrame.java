package ch15_comboBoxes;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	JComboBox comboBox;
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);
		
		// String 배열의 객체 생성
		String[] animals = {
				"dog", "cat", "bird"
		};
		
		// int 배열로 객체 생성 할때는 Wrapper 클래스로 생성
		Integer[] numbers = {
				1, 2, 3, 4, 5
		};
		
		// double 배열로 객체 생성 할때는 Wrapper 클래스로 생성
		Double[] doubles = {
				1.1, 2.2, 3.3, 4.4
		};
		
		// 콤보박스 객체 생성
		comboBox = new JComboBox(doubles);	// animals배열의 값들을 넣겠다.
		comboBox.addActionListener(this);
		
		// 콤보박스 메소드
//		System.out.println(comboBox.getItemCount());	// comboBox안에 요소가 몇개 있는지 갯수 반환
//		comboBox.addItem("horse");	// comboBox item 추가
//		comboBox.insertItemAt("pig", 0);  // 아이템, index몇번째에 추가
//		comboBox.insertItemAt("Lion", 2);
//		comboBox.setSelectedIndex(2);	// 처음 textfield의 값을 무엇으로 정할지
//		comboBox.removeItem("cat"); // 스트링 값으로 아이템 삭제
//		comboBox.removeItemAt(0);	// index 번호로 아이템 삭제
//		comboBox.removeAll();   // 아이템 전체 삭제
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == comboBox) {
			System.out.println(comboBox.getSelectedItem());	// 요소의 값으로 반환해준다.
			//System.out.println(comboBox.getSelectedIndex());	// index값으로 반환해준다.
		}
	}

}
