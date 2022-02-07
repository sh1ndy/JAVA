import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 나만의 JPanel 생성
class ImagePanel extends JPanel {
	// 이미지 불러 오기
	private Image img;
	
	// 이미지 객체 생성
	public ImagePanel(Image img) {
		this.img = img;
		// 이미지 사이즈 자동
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		// 레이아웃 우리가 원하는 위치 가능
		setLayout(null);
	}
	
	// 백그라운드 이미지 넣는 메서드
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}

public class Lesson08 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Lesson 08");
		frame.setSize(640, 480);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		// 나만의 Panel 사용
		ImagePanel panel = new ImagePanel(new ImageIcon("./image/sample1.jpg").getImage());
		frame.add(panel);
		// 화면에 딱 맞게 나오게(필수)
		frame.pack();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
