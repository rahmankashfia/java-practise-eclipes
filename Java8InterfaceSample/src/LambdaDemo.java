import java.util.List;
import java.util.ArrayList;

public class LambdaDemo {
	
	
	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		for(int i = 0; i < 100; i++) {
			ls.add(i);
			
		}
		for (Integer integer : ls) {
			System.out.println(integer);
		}
		
		ls.forEach(i -> System.out.println(i));
		
	}

}
