package ch15;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer c = new Customer();
		c.buy();
		c.sell();
		c.order();
		
		Buy b = c;
		b.buy();
		b.order();
		
		Sell s = c;
		s.sell();
		s.order();
		
		
	}

}
