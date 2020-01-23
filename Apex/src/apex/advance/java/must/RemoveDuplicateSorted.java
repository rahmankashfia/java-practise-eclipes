package apex.advance.java.must;

import java.util.ArrayList;

public class RemoveDuplicateSorted {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		int[] a = {1, 1, 2, 2, 3, 3, 4, 4};
		for (int i = 0; i < a.length; i++) {
			if (a[i] == a[i+1] && i+1 < a.length) {
				al.add(a[i]);
				i++;
			}
		}
		System.out.println(al);

	}

}
