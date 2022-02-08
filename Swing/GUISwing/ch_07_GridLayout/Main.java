package ch07_GridLayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		// Layout Manager = Defines the natural layout for components within a container
		
		// GridLayout = places components in a grid of cells.
		//				Each component takes all the available space within its cell,
		//				and each cell is the same size.
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new GridLayout(3, 3, 10, 10));	// 간격에 맞게 자동 행과 열로 이루어진 레이아웃 (row, column, 가로 간격, 세로 간격)
		
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		frame.add(new JButton("10"));
		
		frame.setVisible(true);

	}

}
