package apex.advance.java;

public class CombinationRecursion {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 4, 5};
		int resultLen = 3;
		int start = 0;
		int end = arr.length -1;
		int currentPosition = 0;
		
		combinationutil(arr, start, end, resultLen, currentPosition);

	}

	private static void combinationutil(int[] arr, int start, int end, int resultLen, int currentPosition) {
		// TODO Auto-generated method stub
		if (resultLen == 0){
			return;
		} else {
			for (int i = 0; i < arr.length; i++) {
				combinationutil(arr, 0, 4, 3, 0);
			}
		}
	}

}
