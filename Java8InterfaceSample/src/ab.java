import java.util.*;
public class ab{
	
	public static void main(String[] args) {
		
		List<Integer> input = new ArrayList<Integer>();
		
		//88 14 10 3 5 14 12
		input.add(8);
		input.add(8);
		input.add(14);
		input.add(10);
		input.add(3);
		input.add(5);
		input.add(14);
		input.add(12);
		System.out.println(ab.cutBamboo(input));
			
	}
	static public int findSmallest(List<Integer> ls) {
		int min = ls.get(0);
		for (Integer integer : ls) {
			if (min > integer) {
				min = integer;
			}
		}
		return min;
	}
	
	static public List<Integer> cutBamboo(List<Integer> lengths){
		List<Integer> result = new ArrayList<Integer>();
		while(true) {
			if (lengths.size() == 0) {
				break;
			} else {
				result.add(lengths.size());
				int small = findSmallest(lengths);
				List<Integer> temp = new ArrayList<Integer>();
				for (Integer integer : lengths) {
					if (integer - small > 0) {
						temp.add(integer - small);
					}	
				}
				lengths = temp;
				System.out.println(lengths.toString());
			}
		}
		return result;
	}
}
		