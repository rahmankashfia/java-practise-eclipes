package apex.advance.java;

public class PrintNameChild extends PrintNameParent {
	
	/**
	 * 
	 */
	public PrintNameChild() {
		// TODO Auto-generated constructor stub
		System.out.println("I am a child constructor.");
	}

	public static void PrintNameParentStatic() {
		System.out.println("this is child class static method");
	}
	
	public void PrintNameParentNonStatic() {
		System.out.println("this is child class non-static method");
	}

}
