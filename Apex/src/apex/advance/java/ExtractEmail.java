package apex.advance.java;

import java.io.*;
import java.util.Scanner;


public class ExtractEmail {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// pass the path to the file as a parameter 
	    File file = 
	    new File("//Users//kashfia//Documents//workspace//Apex//bin//apex//advance//java//email_capstone_itu.txt"); 
	    Scanner sc = new Scanner(file); 
	    int count = 0;
	    int i = 1;
	    while (sc.hasNextLine()) {
	    	if (count % 2 == 0) {
	    		
	    		String string = sc.nextLine();
	    		//System.out.println(string); 
	    		String[] email = string.split(" ");
	    		//System.out.println(email.length);
	    		System.out.println(i++ + email[email.length - 1] + ",");
	    	} else {
	    		sc.nextLine();
	    	}
	    	count++;
	    } 
	}

}

