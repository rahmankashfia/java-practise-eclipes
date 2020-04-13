 package apex.advance.reverse.string;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class UsingStack {


}

class Stack{
	int size;
	int top = -1;
	
	
	public Stack(int size) {
		// TODO Auto-generated constructor stub
		size = this.size;
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		if (top < 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public void push(int i) {
		if (this.top == this.size ) {
			System.out.println("");
		}
		
	}
	
}
