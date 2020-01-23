package apex.advance.java.must;

import java.util.Arrays;

public class MergeTwoSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1 = {1, 3, 5, 7, 9};
		int[] ar2 = {2, 4, 6, 8, 10};
		
		int[] res = new int[ar1.length + ar2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (true) {
			if (k == ar1.length + ar2.length) {
				break;
			} else if(i == ar1.length) {
				break;
			} else if (j == ar2.length) {
				break;
			} else if (ar1[i] > ar2[j]) {
				res[k++] = ar2[j++];
			} else if (ar1[i] < ar2[j]) {
				res[k++] = ar1[i++];	
			} else if (ar1[i] == ar2[j]) {
				res[k++] = ar1[i++];
				res[k++] = ar2[j++];
			}
		}
		if (i < ar1.length) {
			for (int ii = i; ii< ar1.length; ii++) {
				res[k++] = ar1[ii];
				
			}
		}
		if (j < ar2.length) {
			for (int ii = j; ii< ar2.length; ii++) {
				res[k++] = ar2[ii];
				
			}
		}
		System.out.println(Arrays.toString(res));
	}

}
