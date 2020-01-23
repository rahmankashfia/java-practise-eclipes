package apex.advance.java;

import java.util.regex.Pattern;

public class Validation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName = "kashfia";
		String middleName = "Sharif";
		String lastName = "Rahman";
		String zip = "94536";
		String email = "kashfia.rahman.bd@gmail.com";
		System.out.println(Pattern.matches("^[a-zA-Z]{1}[a-zA-Z0-9\\s\\-_]+", firstName)); // first name
		System.out.println(Pattern.matches("[a-zA-Z0-9\\s\\-_]+", middleName)); // middle name
		System.out.println(Pattern.matches("^[a-zA-Z]{1}[a-zA-Z0-9\\s\\-_]+", lastName));
		System.out.println(Pattern.matches("[0-9]{5}", zip));
		System.out.println(Pattern.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2, 7}", email));
		// phone "([+][1][1-9][0-9]{2}[\-][0-9]{3}[\-][0-9]{4})|([1-9][0-9]{2}[\-][0-9]{3}[\-][0-9]{4})"
		
		

	}

}
