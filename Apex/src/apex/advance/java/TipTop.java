package apex.advance.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class TipTop{
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(3);
		arr.add(1);
		arr.add(5);
		arr.add(2);
		Random random = new Random();
		 for (int i = 0; i < 1000; i++) {
			 arr.add(random.nextInt(1000));
		 }
		 int lastIndex = arr.size();
		 int move = 0;
		 for(int j = 0; j < arr.size(); j++) {
			 for(int i = (lastIndex - 1) ; i >= 0 ; i--) {
				 if(i > 0 && arr.get(i) < arr.get(i - 1)) {
					 arr.add(arr.get(i - 1));
					 arr.remove(i - 1);
					 move++;
				 }
			 } 
		 }
		 //arr.sort(null);
		// System.out.println(arr);
		// System.out.println(move);
		 int[] a = {1,2};
		 int[] b = a;
		 System.out.println(Arrays.toString(b));
	}
	
}