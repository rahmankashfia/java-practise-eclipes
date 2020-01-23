package apex.advance.java;

public class FindVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Hello";
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i'|| string.charAt(i) == 'o'|| string.charAt(i) == 'u') {
				System.out.println(string.charAt(i));
			}
		}

	}

}
