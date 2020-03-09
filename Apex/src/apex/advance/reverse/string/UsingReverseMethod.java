package apex.advance.reverse.string;

public class UsingReverseMethod {
	
	public static void main(String[] args) {
		String string = "Google";
		StringBuilder newString = new StringBuilder(string);
		newString.reverse();
		System.out.println("Using string builder : " +  newString);
		
		StringBuffer newString1 = new StringBuffer(string);
		newString1.reverse();
		System.out.println("Using string buffer : " +  newString1);
		
		
	}

}
