package apex.advance.java;


public class DoubletoInteger {
	public static void main(String[] args) {
		String s = "google";
		char[] cs = s.toCharArray(); 
		int j = cs.length - 1;
		for (int i = 0; i < cs.length/2; i++) {
			char temp = cs[i];
			cs[i] = cs[j];
			cs[j] = temp;
			j--;
		}
		System.out.println(cs);	
	}
		
}
	

