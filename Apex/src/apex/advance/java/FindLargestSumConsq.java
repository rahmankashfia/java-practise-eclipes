package apex.advance.java;

public class FindLargestSumConsq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {8, 5, 6, 9, 1, 2, 3};
		int max_sum = 0;
		int final_sum = 0;
		if(a.length > 0) {
			max_sum = a[0];
		}
		for (int i = 0; i < a.length - 1; i++) {
			if( a[i] <= a[i + 1]) {
				max_sum = max_sum + a[i + 1];			 
			} else {
				if(final_sum < max_sum) {
					final_sum = max_sum;
				}
				max_sum = a[i + 1];
			}
		}
		System.out.println(final_sum);

	}

}
