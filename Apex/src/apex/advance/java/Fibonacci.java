package apex.advance.java;

public class Fibonacci {
	public static void main(String[] args) {
		
		System.out.println(Fibonacci.f(10));
		int n = 10;
		int a = 0;
		int b = 1;
		int c = 0;
		int i = 2;
		System.out.println("1 : " + a);
		System.out.println("2 : " + b);
		while(true) {
			if (i == n) {
				return;
			} else {
				c = a + b;
				a = b;
				b = c;
				System.out.println(i+1 + " : " + c);
				i++;
			}
			
		}
		
	
	}
	
	public static int f(int n) {
		if (n <= 1) {
			return n;	
		} else {
			return f(n - 1) + f(n - 2);
		}
	}
}
