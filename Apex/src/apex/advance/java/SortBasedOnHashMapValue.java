package apex.advance.java;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



public class SortBasedOnHashMapValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		hMap.put("S", 1);
		hMap.put("N", 2);
		hMap.put("K", 3);
		
		List<Entry<String, Integer>> entrySet = new ArrayList<Map.Entry<String,Integer>>(hMap.entrySet());
		
		
		System.out.println(entrySet.toString());
		
		Comparator<Map.Entry<String, Integer>> sortByValueComparator = new Comparator<Map.Entry<String,Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue() - o2.getValue();
			}
		
		};
		
		Collections.sort(entrySet, sortByValueComparator);
		
		System.out.println(entrySet.toString());
		

	}

}
