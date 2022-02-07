import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

// ������ JPanel ����
class ImagePanel extends JPanel {
	// �̹��� �ҷ� ����
	private Image img;
	
	// �̹��� ��ü ����
	public ImagePanel(Image img) {
		this.img = img;
		// �̹��� ������ �ڵ�
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		// ���̾ƿ� �츮�� ���ϴ� ��ġ ����
		setLayout(null);
	}
	
	// ��׶��� �̹��� �ִ� �޼���
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
		
		// ������ Panel ���
		ImagePanel panel = new ImagePanel(new ImageIcon("./image/sample1.jpg").getImage());
		frame.add(panel);
		// ȭ�鿡 �� �°� ������(�ʼ�)
		frame.pack();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
