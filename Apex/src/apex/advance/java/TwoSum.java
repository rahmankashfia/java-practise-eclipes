package apex.advance.java;

import java.util.Arrays;
import java.util.HashMap;


public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1, 2, 3, 4, 5};
		int target = 9;
		int[] result = twoSum(target, a);
		int i = 0;
		while (i < result.length - 1) {
			if (result[i] == -1) {
				break;
			}
			System.out.println("( " + result[i] + "," + result[i+1] + " )");
			i = i + 2;
		}
	}
	
	public static int[] twoSum(int target, int[] a) {
		int[] result= new int[a.length];
		Arrays.fill(result, -1);
		int r = 0;
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for (int i = 0; i < a.length; i++) {
			int find = target - a[i];
			if (hm.containsKey(find)) {
				result[r] = i;
				r++;
				result[r] = hm.get(find);
				r++;
				
			} 
			hm.put(a[i], i);
			
		}
		System.out.println(hm);
		return result;
	}

}
