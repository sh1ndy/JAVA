import java.util.Arrays;

class Human implements Cloneable {
	String name;
	int age;
	
	Human() {
		this("Â¯±¸", 5);
	}
	
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "name : " + name + ", age : " + age;
	}
	
	public Object clone() {
		Object obj = null;
		
		try {
			obj = super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return obj;
	}
}

public class CloneEx2 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] copyArr = arr.clone();
		
		copyArr[0] = 6;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copyArr));
		
		Human h1 = new Human();
		Human h2 = (Human) h1.clone();
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println();
		h2.name = "Ã¶¼ö";
		System.out.println(h1);
		System.out.println(h2);
		
	}

}
