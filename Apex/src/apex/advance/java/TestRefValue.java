package apex.advance.java;

import java.util.Arrays;

public class TestRefValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = a;
		b = 6;
		System.out.println(a);
		System.out.println(b);
		int[] a1 = new int[2];
		a1[0] = 3;
		a1[1] = 4;
		int[] b1 = new int[2];
		b1 = a1.clone();
		b1[0] = 6;
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(b1));

	}

}
