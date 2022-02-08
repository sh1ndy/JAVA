package ch10_JOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		// JOptionPane = pop up a standard dialog box that prompts users for a value
		//				 or informs them of something.
		
		// 버튼이 하나 있는 다이얼로그, 아래와 같이 세 가지 종류로 중복 정의되어있다.
//		JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Here is more useless info :D", "title", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Really?", "title", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "You're computer has A VIRUS!!!", "title", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Call tech support NOW OR ELSE!!!!", "title", JOptionPane.ERROR_MESSAGE);
		
		// 사용자로부터 다시 확인하고 싶은 경우에 사용된다.
		// 반환값 int 형 (예 == 0), (아니요 == 1), (취소 == 2)
//		int answer = JOptionPane.showConfirmDialog(null, "bro, you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
		
		// 사용자로부터 입력을 받고 싶은 경우에 사용된다. 총 6가지의 메소드가 중복 정의되어있다.
//		String name = JOptionPane.showInputDialog("What is your name?: ");
		
		// 맞춤형 대화 상자로, 텍스트를 다르게 하거나 많은 버튼을 가질 수 있다. 또한 텍스트 메시지나 컴포넌트의 컬렉션을 포함할 수 있다.
		String[] responses = {
				"No, you're awesome!",
				"thank you!",
				"*blush*"
		};
		ImageIcon icon = new ImageIcon("./images/like.png");
		JOptionPane.showOptionDialog(null, "You are Awesome!", "secret message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);

	}

}
