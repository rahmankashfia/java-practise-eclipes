package apex.advance.java.must;

import java.util.HashMap;
import java.util.*;

public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5, 0, 5, 0, 5, 0};
		int target = 5;
		Map<Integer, ArrayList<Integer>> hm = new HashMap<Integer, ArrayList<Integer>>();
		for(int i = 0; i < a.length; i++) {
			if (hm.containsKey(a[i])) {
				ArrayList<Integer> temp = hm.get(a[i]);
				temp.add(i);
				hm.put(a[i], temp);
			} else {
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(i);
				hm.put(a[i], temp);
			}
		}
		System.out.println(hm);
		for(int i = 0; i < a.length; i++) {
			int temp = a[i] - target;
			if ( hm.containsKey(temp)) {
				for (int j : hm.get(temp)) {
					System.out.println(String.format("(%d, %d)",i, j));
				}
			}
		}
	}	
}
