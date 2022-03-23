package day0323;

interface CalcDemo {
	void calc(int num1, int num2);
}

class Calc {
	void result(CalcDemo c) {
		c.calc(400, 200);
	}
}

class AddCalc implements CalcDemo {

	@Override
	public void calc(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
}

class SubstractCalc implements CalcDemo {

	@Override
	public void calc(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	
}

class MultiplyCalc implements CalcDemo {

	@Override
	public void calc(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	
}

class DivideCalc implements CalcDemo {

	@Override
	public void calc(int num1, int num2) {
		System.out.println(num1 / num2);
	}
	
}

public class InterfaceCalcTest {

	public static void main(String[] args) {

		Calc c = new Calc();
		c.result(new AddCalc());
		c.result(new SubstractCalc());
		c.result(new MultiplyCalc());
		c.result(new DivideCalc());
	}

}
