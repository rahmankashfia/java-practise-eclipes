package apex.advance.java;

public class StaticNestedTest {
	static int a = 9;
	public static int b = 20;
	
	static class StaticInner {
		int c = 4;
		static int d = a;
		
		public void print(){
			System.out.println("Inner class");
		}
		
	}
	public static void main(String[] args) {
		StaticInner sn = new StaticInner();
		sn.print();

	}
}
