package apex.advance.java;



public class threadClass extends Thread {
	
	private int x = 0;
	public void run(){
		for(int i = 0; i <100; i++){
			x = x + i;
			System.out.println(x);
		}
	}

	public threadClass(){
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadClass tc = new threadClass();
		Thread t1 = new threadClass();
		Thread t2 = new threadClass();
		Thread t3 = new threadClass();
		Thread t4 = new threadClass();
		Thread t5 = new threadClass();
		t1.start();
		System.out.println(tc.x);
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		System.out.println(tc.x);

	}

}
