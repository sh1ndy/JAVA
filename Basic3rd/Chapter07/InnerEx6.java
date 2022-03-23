package day0323;

public class InnerEx6 {

	Object iv = new Object() {
		void method() {
			
		}
	};
	
	void myMethod() {
		Object iv = new Object() {
			
		};
	}

}
