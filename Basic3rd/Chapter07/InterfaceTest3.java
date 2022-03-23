package day0323;

interface III {
	void method();
}

class AAAA {
	void method() {
		III i = InstanceManager.getInstance();
		i.method();
		System.out.println(i.toString());
	}
}

class BBBB implements III {
	
	@Override
	public void method() {
		System.out.println("method in B Class");
	}
	
	public String toString() {
		return "class B";
	}
}

class InstanceManager {
	public static III getInstance() {
		return new BBBB();
	}
}

public class InterfaceTest3 {

	public static void main(String[] args) {
		
		AAAA a = new AAAA();
		a.method();
		
		
	}

}
