interface InterfaceDemo{
	void show();
	
}
public class LambaDemo {
	public static void main(String[] args) {
		
		InterfaceDemo demo = new InterfaceDemo() {
			
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("Interface Demo");
				
			}
		};
		demo.show();
		InterfaceDemo demo2;
		demo2=() -> System.out.println("Hello");
		demo2.show();
		
	}
}
