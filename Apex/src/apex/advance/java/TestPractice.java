package apex.advance.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

public class TestPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
		st.add(1);
		st.push(2);
		System.out.println("");
		String str = "Hello";
		System.out.println(str.concat("World"));
		System.out.println(str);	
		Object[] arrayObject = new Object[6];
		arrayObject[0] = "Hello";
		arrayObject[1] = 1;
		System.out.println(arrayObject[0]);
		System.out.println(arrayObject[1]);
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		System.out.println(Arrays.toString(arrayList.toArray())
				);
		
		

	}

}