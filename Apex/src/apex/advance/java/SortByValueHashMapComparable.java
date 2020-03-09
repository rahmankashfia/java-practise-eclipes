package apex.advance.java;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SortByValueHashMapComparable {
	public static void main(String[] args) {
		
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		hMap.put("k", 3);
		hMap.put("l", 4);
		hMap.put("m", 1);
		hMap.put("n", 2);
		List<Map.Entry<String, Integer>> ls = new ArrayList<Map.Entry<String,Integer>>(hMap.entrySet());
		//Collections.sort(ls);
		
	}
}

