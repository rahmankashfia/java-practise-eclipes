package apex.advance.java;

public class TestMainCanReturn {
	
	
	/**
	 * 
	 */
	public TestMainCanReturn() {
		// TODO Auto-generated constructor stub
		//super();
		this(1);
		System.out.println("Constructor");
	
	}
	
	public TestMainCanReturn(int i) {
		// TODO Auto-generated constructor stub
		//super();
		System.out.println(i);
	
	}

	public static void main(String[] args) {
		TestMainCanReturn t = new TestMainCanReturn();
	}
}
