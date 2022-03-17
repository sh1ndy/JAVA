package exReturn;

public class Data {

	int x;
	String name;
	
	Data copy(Data d) {
		Data tmp = new Data();
		tmp.x = d.x;
		return tmp;
	}
	
	Data copy2(Data d) {
		Data tmp = new Data();
		tmp.name = d.name;
		return tmp;
	}
	
	Data copy3(Data d) {
		Data tmp = new Data();
		tmp.name = d.name;
		tmp.x = d.x;
		return tmp;
	}

}
