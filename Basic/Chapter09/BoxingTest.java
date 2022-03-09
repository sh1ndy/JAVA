import java.util.ArrayList;

public class BoxingTest {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(new Integer(100));
		
//		Integer i = list.get(0);
//		int i = list.get(0).intValue();
		int i = list.get(0);
		System.out.println(i);
		 
	}

}
