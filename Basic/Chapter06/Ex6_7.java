
public class Ex6_7 {

	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		System.out.println("main d.x = " + d.x);
		
		change(d);
		System.out.println("after change(d)");
		System.out.println("main d.x = " + d.x );

	}
	
	static void change(Data d) {
		d.x = 1000;
		System.out.println("change d.x = " + d.x);
	}

}
