package apex.advance.java;

import java.util.HashSet;
import java.util.Set;

public class CheckDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String r = "";
		String string = "google";
		boolean[] count = new boolean[256];
		//System.out.println(count[0]);
		for (int i = 0; i < string.length(); i++) {
			//System.out.println(String.valueOf(string.charAt(i)));
			//System.out.println(count['g']);
			if(count[string.charAt(i)] == true) {
				//System.out.println(String.valueOf(string.charAt(0)));
				r =  r + String.valueOf(string.charAt(i));
			} else {
				count[string.charAt(i)] = true;
			}
		}
		System.out.println(r);
		
		Set<Character> s = new HashSet<Character>();
		String string2 = "google";
		r = "";
		for (int i = 0; i < string2.length(); i++){
			Character temp = Character.valueOf(string2.charAt(i));
			if(s.contains(temp)){
				r = r + String.valueOf(temp);
			} else {
				s.add(temp);
			}
			
		}
		System.out.println(r);
		
		

	}

}
