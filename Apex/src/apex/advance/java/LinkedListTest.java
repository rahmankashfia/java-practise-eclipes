package apex.advance.java;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> nameLinkedList = new LinkedList<String>();
		nameLinkedList.add("Kashfia Rahman");
		nameLinkedList.add("Karishma Rahman");
		nameLinkedList.add("Afia Marium");
		nameLinkedList.add("Arisa Marium");
		nameLinkedList.add("Ahmed Sharif");
		Iterator<String> itr = nameLinkedList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
