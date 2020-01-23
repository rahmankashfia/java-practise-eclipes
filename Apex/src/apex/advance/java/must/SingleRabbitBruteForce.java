package apex.advance.java.must;

public class SingleRabbitBruteForce {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 2, 1, 3};
		int singleNum = 0;
		for (int i = 0; i < a.length; i++) {
			singleNum = a[i];
		for (int j = 0; j < a.length; j++) {
				if (i != j && a[i] == a[j]) {
					singleNum = 0;
					continue;
				}
			}
		}
		System.out.println(singleNum);

	}

}
