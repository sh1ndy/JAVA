package exCallStack;

public class CallStack {
	
	void firstMethod() {
		secondMethod();
	}
	
	void secondMethod() {
		System.out.println("secondMethod()");
	}

}
