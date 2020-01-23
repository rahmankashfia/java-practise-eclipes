package apex.advance.java;

import java.util.HashSet;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "google";
		HashSet<Character> hsCharacters = new HashSet<Character>();
		for (int i = 0; i < string.length(); i++) {
			if (hsCharacters.contains(string.charAt(i))) {
				System.out.println(string.charAt(i));
			}
			hsCharacters.add(string.charAt(i));
		}
		if (string.length() != hsCharacters.size()) {
			System.out.println("Duplicate has!!");
		} else {
			System.out.println("No duplicate");
		}
		
	}

}
