package exFactorial;

public class Power {

	long power(int x, int n) {
		if (n ==1) {
			return x;
		}
		return x * power(x, n - 1);
	}
	
}
