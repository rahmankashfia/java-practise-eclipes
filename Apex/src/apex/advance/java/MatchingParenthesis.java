package apex.advance.java;

import java.util.Stack;

public class MatchingParenthesis {
	
	static boolean match(String s) {
		 if(s.length() < 2) {
	            return false;
	        } else {
	            Stack<Character> st = new Stack<Character>();
	            for (int i = 0; i < s.length(); i++) {
	               if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[' ) {
	                   st.add(s.charAt(i));
	               } else if ((s.charAt(i) == '}' && st.peek() == '{')  || (s.charAt(i) == ')' && st.peek() == '(') || (s.charAt(i) == ']' && st.peek() == '[')) {
	            	   st.pop();
	               } else {
	            	   return false;
	               }
	            }
	            if (st.isEmpty()) {
	            	return true;
	            } else {
	            	return false;
	            }
	        }
	}
	public static void main(String[] args) {
		MatchingParenthesis.match("{()}");
		
	}

}
