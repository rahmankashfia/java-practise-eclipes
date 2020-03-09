package apex.advance.java;

import java.util.StringTokenizer;

public class ReverseString {
	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Hello");
		int j = stringBuilder.length() - 1;
		
		for (int i = 0; i < stringBuilder.length() / 2; i++) {
			char temp = stringBuilder.charAt(i);
			stringBuilder.setCharAt(i, stringBuilder.charAt(j));
			stringBuilder.setCharAt(j, temp);
			j--;
			
		}
		System.out.println(stringBuilder.toString());
		
		char[] temp = new char[stringBuilder.length()];
		j = 0;
		for (int i = stringBuilder.length() - 1; i >= 0; i--){
		//	System.out.println(j + " : " + stringBuilder.charAt(i));
			temp[j++] = stringBuilder.charAt(i);
		}
		String rString = String.valueOf(temp);
		System.out.println(rString);
	}

}
