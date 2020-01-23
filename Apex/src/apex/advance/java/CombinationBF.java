package apex.advance.java;

public class CombinationBF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				System.out.print("j:" + j + " " );
				System.out.print(arr[i] + " ");
				for (int k = j; k <= j + 1 && j + 1 < arr.length ; k++) {
					System.out.print(arr[k] + " ");
				}		
				System.out.println();
			}
			
		}
	}

}
