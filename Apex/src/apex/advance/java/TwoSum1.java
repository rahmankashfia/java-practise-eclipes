package apex.advance.java;

import java.util.HashSet;

public class TwoSum1 {
	
	public static void findPairs(int[] a, int target) {
		HashSet<Integer> hSet = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			int temp = target - a[i];
			if (hSet.contains(temp)) {
				System.out.println("( " + temp + ", " + a[i] + ")");
			} else {
				hSet.add(a[i]);
			}
		}
	}
	
	public static void findPairsWithWhileLoop(int[] a, int target) {
		
		HashSet<Integer> hSet = new HashSet<Integer>();
		int i = 0;
		while(true) {
			if (i == a.length) {
				break;
			} else {
				int temp = target - a[i];
				if (hSet.contains(temp)) {
					System.out.println(temp + ", "+ a[i]);
				} else {
					hSet.add(a[i]);
				}
			}
			i++;
		}
	}
	
	public static void main (String[] args){
		int[] a = {1, 2, 3, 4, 5};
		int target = 7;
		TwoSum1.findPairs(a, target);
		TwoSum1.findPairsWithWhileLoop(a, target);
		
	}

}
