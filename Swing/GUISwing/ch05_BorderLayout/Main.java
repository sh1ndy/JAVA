package ch05_BorderLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {

		// Layout Manager = Defines the natural layout for components within a container

		// 3 common managers

		// BorderLayout = A BorderLayout places components in five areas: NORTH, SOUTH,
		// WEST, EAST, CENTER
		// All extra space is placed in the center area.

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new BorderLayout(10, 10)); // 각 패널들 간의 간격을 정해하고 싶을 때
		frame.setVisible(true);

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();

		panel1.setBackground(Color.red);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.yellow);
		panel4.setBackground(Color.magenta);
		panel5.setBackground(Color.blue);

		panel1.setPreferredSize(new Dimension(100, 100)); // 레이아웃은 그대로 두고 패널의 크기들만 바꾸고 싶을 경우
		panel2.setPreferredSize(new Dimension(100, 100)); // 레이아웃은 그대로 두고 패널의 크기들만 바꾸고 싶을 경우
		panel3.setPreferredSize(new Dimension(100, 100)); // 레이아웃은 그대로 두고 패널의 크기들만 바꾸고 싶을 경우
		panel4.setPreferredSize(new Dimension(100, 100)); // 레이아웃은 그대로 두고 패널의 크기들만 바꾸고 싶을 경우
		panel5.setPreferredSize(new Dimension(100, 100)); // 레이아웃은 그대로 두고 패널의 크기들만 바꾸고 싶을 경우

		// ------------ sub panels ------------
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();

		panel6.setBackground(Color.black);
		panel7.setBackground(Color.darkGray);
		panel8.setBackground(Color.gray);
		panel9.setBackground(Color.lightGray);
		panel10.setBackground(Color.white);

		panel5.setLayout(new BorderLayout());

		panel6.setPreferredSize(new Dimension(50, 50));
		panel7.setPreferredSize(new Dimension(50, 50));
		panel8.setPreferredSize(new Dimension(50, 50));
		panel9.setPreferredSize(new Dimension(50, 50));
		panel10.setPreferredSize(new Dimension(50, 50));
		
		panel5.add(panel6, BorderLayout.NORTH);
		panel5.add(panel7, BorderLayout.SOUTH);
		panel5.add(panel8, BorderLayout.WEST);
		panel5.add(panel9, BorderLayout.EAST);
		panel5.add(panel10, BorderLayout.CENTER);
		// ------------ sub panels ------------
		
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.SOUTH);
		frame.add(panel3, BorderLayout.WEST);
		frame.add(panel4, BorderLayout.EAST);
		frame.add(panel5, BorderLayout.CENTER);

	}

}
