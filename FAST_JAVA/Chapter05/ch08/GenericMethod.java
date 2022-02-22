package ch08;

public class GenericMethod {
	
	public static <T, V> double makeRactangle(Point<T, V> p1, Point<T, V> p2) {
		
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = left - right;
		double height = top - bottom;
		
		return width * height;
		
	}

	public static void main(String[] args) {

	Point<Integer, Double> p1 = new Point<>(0, 0.0);
	Point<Integer, Double> p2 = new Point<>(10, 10.0);
	double size = GenericMethod.<Integer, Double>makeRactangle(p1, p2);
	System.out.println(size);
		
	}

}
