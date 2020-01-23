package apex.advance.java.must;

import java.util.HashSet;

public class SingleRabbitHashSet {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 3, 2, 1};
		int single = 0;
		HashSet<Integer> hSet = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (hSet.contains(a[i])) {
				hSet.remove(a[i]);
			} else {
				hSet.add(a[i]);
			}
		}
		System.out.println(hSet);
	}

}
