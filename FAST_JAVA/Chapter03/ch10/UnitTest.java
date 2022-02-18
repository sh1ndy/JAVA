package ch10;

import java.util.ArrayList;

public class UnitTest {

	public static void main(String[] args) {
		
		ArrayList<Unit> unitList = new ArrayList<>();
		
		unitList.add(new Marine("마린"));
		unitList.add(new Tank("탱크"));
		unitList.add(new Wraith("레이스"));
		
		for (int i = 0; i < unitList.size(); i++) {
			unitList.get(i).action();
		}
		
		
	}

}
