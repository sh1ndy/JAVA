package exPrimitiveParam;

public class PrimitiveParamEx {

	public static void main(String[] args) {

		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		d.change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
		
		d.multi(2, 1);
		System.out.println(d.num1);
		System.out.println(d.num2);
		
		
		
	}

}
