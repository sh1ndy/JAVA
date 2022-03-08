
public class Ex6_8 {

	public static void main(String[] args) {

		Data d = new Data();
		d.x = 10;
		
		Data d2 = change(d);
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
		d.x = 100;
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
	}
	
	static Data change(Data d) {
		Data tmp = new Data();
		tmp.x = d.x;
		return tmp;
	}

}
