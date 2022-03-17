package exBlock;

public class BlockTest {
	
	// 클래스 초기화 블럭
	static {
		System.out.println("stastic { }");
	}
	
	// 인스턴 초기화 블럭
	{
		System.out.println("{ }");
	}
	
	public BlockTest() {
		System.out.println("생성자");
	}
	

	public static void main(String[] args) {

		System.out.println("BlockTest bt = new BlockTest()");
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest()");
		BlockTest bt2 = new BlockTest();
		
	}

}
