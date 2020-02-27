package apex.advance.java;

import java.util.Deque;
import java.util.Stack;

public class PrintNameClient {
	
	public static void main(String[] args) {
		PrintNameParent p1 = new PrintNameChild();
		PrintNameChild c1 = new PrintNameChild();
		p1.PrintNameParentNonStatic();
		PrintNameParent.PrintNameParentStatic();
		c1.PrintNameParentNonStatic();
		PrintNameChild.PrintNameParentStatic();	
		c1.methodHiding();
		c1.methodHiding(1);
		char a = 'a';
		char b = 'b';
		if(a < b) {
			System.out.println("hi");
		}
		
		Stack<Integer> st = new Stack<Integer>();
		st.p
		array 
		goto
		null
		int
		
		Singleton Pattern, Factory Pattern, Abstract Factory Pattern, Builder Pattern
		Prototype Pattern
		
		Adapter Pattern, Composite Pattern, Proxy Pattern, Flyweight Pattern, Facade Pattern
	}
}
