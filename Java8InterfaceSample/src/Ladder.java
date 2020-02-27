
public class Ladder {
	
	public static void main(String[] args) {
		String[] str = new String[1];
		try{
			System.out.println(Ladder.dos(str));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("excec");
			dos(str);
		}
		
	}
	
	static int dos(String[] a){
		return Integer.parseInt(a[0]);
	}

}
