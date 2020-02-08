package apex.advance.java;

public class IsPermutation {
	
	public static String isPerm( String a, String b) {
		if(a == null || b == null || a.length() != b.length()) {
			return "No Matching";
		} else {
			for (int i = 0; i < a.length(); i++) {
				System.out.println(a.charAt(i));
				System.out.println(b.indexOf(a.charAt(i)));
				if (b.indexOf(a.charAt(i)) >= 0) {
					continue;
				} else {
					return "No Matching";
				}
			}
			
		}
		return "Matching found";	
	}
	public static void main(String[] args) {
		String a = "abcdef";
		String b = "fedcb";
		System.out.println(IsPermutation.isPerm(a,b));
		
	}
}
