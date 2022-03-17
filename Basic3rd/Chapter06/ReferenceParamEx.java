package exPrimitiveParam;

public class ReferenceParamEx {
	
	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		
		System.out.println("main() x = " + d.x);
		d.change2(d);
		System.out.println("After change2(d)");
		System.out.println("main() x = " + d.x);
		
		
		d.multi2(d);
		System.out.println(d.num1);
		System.out.println(d.num2);
		
		
		
	}

}
