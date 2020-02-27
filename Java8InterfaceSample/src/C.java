
public class C implements A, B {
	public static void main(String[] args) {
		C objc = new C();
		objc.show();
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		B.super.show();
	}

}
