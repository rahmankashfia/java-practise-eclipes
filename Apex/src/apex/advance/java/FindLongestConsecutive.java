package apex.advance.java;

public class FindLongestConsecutive {
	
	public static void main(String[] args) {
		int[] arr = {8, 5};
		int max_len = 1;
		int final_max_length = 0;
		for (int i = 0; i < arr.length - 1 ; i++) {
			if(arr[i] <= arr[i + 1]) {
				max_len = max_len + 1;
			} else {
				if (final_max_length < max_len) {
					final_max_length = max_len;
				}
			}
		}
		System.out.println(final_max_length);
	}

}
