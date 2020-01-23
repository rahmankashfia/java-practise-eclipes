package apex.advance.java.must;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBracket {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"()()()(", "", ")()(()", "()()()"};
		
		System.out.println("hello");
		for (String s : str) {
			System.out.println(s);
			Deque<Character> st = new ArrayDeque<Character>();
			if (s.length() == 0) {
				System.out.println("String is Empty");
				continue;
			} else if (s.length() % 2 == 0) {
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(j) == '(') {
						st.push('(');
					} else if (s.charAt(j) == ')') {
						if (st.isEmpty() == false) {
							st.pop();
						}
					}
				}
			} else {
				System.out.println("Not Balanced");
				continue;
			}
			if (st.isEmpty() && s.length() > 0) {
				System.out.println("balanced");
			} else {
				System.out.println("Not balanced");
			}
		}
	}
}
