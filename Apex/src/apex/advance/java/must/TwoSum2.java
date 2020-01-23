package apex.advance.java.must;

import java.util.ArrayList;
import java.util.HashMap;




public class TwoSum2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {5, 0, 5, 0, 5, 0};
		int target = 5;
		HashMap<Integer,ArrayList<Integer>> hm = new HashMap<Integer, ArrayList<Integer>>();
		
		for (int i = 0; i < a.length; i++) {
			int temp = target - a[i];
			if (hm.containsKey(temp)) {
				for (int j : hm.get(temp)) {
					System.out.println(i + ", " + j);
				}
			} 
			if (hm.containsKey(a[i])) {
				ArrayList<Integer> ar_temp = hm.get(a[i]);
				ar_temp.add(i);
				hm.put(a[i], ar_temp);
			} else {
				ArrayList<Integer> ar_temp = new ArrayList<Integer>();
				ar_temp.add(i);
				hm.put(a[i], ar_temp);
			}
		}
	}
}
