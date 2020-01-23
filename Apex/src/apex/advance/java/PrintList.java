package apex.advance.java;


import java.util.*;
import java.util.HashSet;

public class PrintList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hSet = new HashSet<String>();
		hSet.add("Kashfia");
		hSet.add("Karishman");
		hSet.add("Alvi");
		hSet.add("Kashfia");
		System.out.println(hSet);
		List<String>  l = new ArrayList<String>();
		Iterator<String> iterator = hSet.iterator();
		while (iterator.hasNext()) {
			l.add(iterator.next());
		}
		System.out.println(l);
		
		
	}

}
