package exFactorial;

public class PowerTest {

	public static void main(String[] args) {

		Power p = new Power();
		
		int x = 2;
		int n = 5;
		long result = 0;
		
		for (int i = 1; i <= n; i++) {
			result += p.power(x, i);
		}
		
		System.out.println(result);
		
	}

}
