package ch10;

import java.util.ArrayList;

public class UnitTest {

	public static void main(String[] args) {
		
		ArrayList<Unit> unitList = new ArrayList<>();
		
		unitList.add(new Marine("����"));
		unitList.add(new Tank("��ũ"));
		unitList.add(new Wraith("���̽�"));
		
		for (int i = 0; i < unitList.size(); i++) {
			unitList.get(i).action();
		}
		
		
	}

}
