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
		
		// String �迭�� ��ü ����
		String[] animals = {
				"dog", "cat", "bird"
		};
		
		// int �迭�� ��ü ���� �Ҷ��� Wrapper Ŭ������ ����
		Integer[] numbers = {
				1, 2, 3, 4, 5
		};
		
		// double �迭�� ��ü ���� �Ҷ��� Wrapper Ŭ������ ����
		Double[] doubles = {
				1.1, 2.2, 3.3, 4.4
		};
		
		// �޺��ڽ� ��ü ����
		comboBox = new JComboBox(doubles);	// animals�迭�� ������ �ְڴ�.
		comboBox.addActionListener(this);
		
		// �޺��ڽ� �޼ҵ�
//		System.out.println(comboBox.getItemCount());	// comboBox�ȿ� ��Ұ� � �ִ��� ���� ��ȯ
//		comboBox.addItem("horse");	// comboBox item �߰�
//		comboBox.insertItemAt("pig", 0);  // ������, index���°�� �߰�
//		comboBox.insertItemAt("Lion", 2);
//		comboBox.setSelectedIndex(2);	// ó�� textfield�� ���� �������� ������
//		comboBox.removeItem("cat"); // ��Ʈ�� ������ ������ ����
//		comboBox.removeItemAt(0);	// index ��ȣ�� ������ ����
//		comboBox.removeAll();   // ������ ��ü ����
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == comboBox) {
			System.out.println(comboBox.getSelectedItem());	// ����� ������ ��ȯ���ش�.
			//System.out.println(comboBox.getSelectedIndex());	// index������ ��ȯ���ش�.
		}
	}

}
