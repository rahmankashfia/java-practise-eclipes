package apex.advance.java.coding.practice;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

import javax.print.attribute.standard.PrinterState;

public class LRUCache {

	Deque<Integer> keyQueue = new LinkedList<Integer>();
	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	int sizeLRU = 0;
	int count = 0;

	LRUCache(int capacity) {
		this.sizeLRU = capacity;
	}

	public int get(int key) {
		if (hm.containsKey(key)) {
			int result = hm.get(key);
			if (keyQueue.isEmpty() == false) {
				keyQueue.poll();
				keyQueue.add(key);
			}
			return result;
		}
		else {
			keyQueue.add(key);
			return -1;
		}
		
	}

	public void put(int key, int value) {
		if (hm.containsKey(key)){
			hm.put(key, value);
			keyQueue.remove(key);
			keyQueue.add(key);
		} else {
			if (this.sizeLRU == count) {
				hm.remove(keyQueue.poll());
				count--;
			} 
			hm.put(key, value);
			if (keyQueue.contains(key)){
				keyQueue.remove(key);
				keyQueue.add(key);
			} else {
				keyQueue.add(key);
			}
			count++;
		}
	}
	public void PrinterState() {
		// TODO Auto-generated method stub
		System.out.println("hashmap: " + hm);
		System.out.println("queue: " + keyQueue);
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRUCache cache = new LRUCache( 2 /* capacity */ );
		//[null,null,null,null,null,-1,3]
//		["LRUCache","put","put","put","put","put","get","put","get","get","put","get","put","put","put","get","put","get","get","get","get","put","put","get","get","get","put","put","get","put","get","put","get","get","get","put","put","put","get","put","get","get","put","put","get","put","put","put","put","get","put","put","get","put","put","get","put","put","put","put","put","get","put","put","get","put","get","get","get","put","get","get","put","put","put","put","get","put","put","put","put","get","get","get","put","put","put","get","put","put","put","get","put","put","put","get","get","get","put","put","put","put","get","put","put","put","put","put","put","put"]
//				[[10],[10,13],[3,17],[6,11],[10,5],[9,10],[13],[2,19],[2],[3],[5,25],[8],[9,22],[5,5],[1,30],[11],[9,12],[7],[5],[8],[9],[4,30],[9,3],[9],[10],[10],[6,14],[3,1],[3],[10,11],[8],[2,14],[1],[5],[4],[11,4],[12,24],[5,18],[13],[7,23],[8],[12],[3,27],[2,12],[5],[2,9],[13,4],[8,18],[1,7],[6],[9,29],[8,21],[5],[6,30],[1,12],[10],[4,15],[7,22],[11,26],[8,17],[9,29],[5],[3,4],[11,30],[12],[4,29],[3],[9],[6],[3,4],[1],[10],[3,29],[10,28],[1,20],[11,13],[3],[3,12],[3,8],[10,9],[3,26],[8],[7],[5],[13,17],[2,27],[11,15],[12],[9,19],[2,15],[3,16],[1],[12,17],[9,1],[6,19],[4],[5],[5],[8,1],[11,7],[5,2],[9,28],[1],[2,2],[7,4],[4,22],[7,24],[9,26],[13,28],[11,26]]			
//				[null,null,null,null,null,null,-1,null,19,17,null,-1,null,null,null,-1,null,-1,5,-1,12,null,null,3,5,5,null,null,1,null,-1,null,30,5,30,null,null,null,-1,null,-1,24,null,null,18,null,null,null,null,14,null,null,18,null,null,-1,null,null,null,null,null,18,null,null,24,null,4,29,30,null,12,-1,null,null,null,null,29,null,null,null,null,17,22,-1,null,null,null,24,null,null,null,20,null,null,null,29,-1,-1,null,null,null,null,-1,null,null,null,null,null,null,null]
//				[null,null,null,null,null,null,-1,null,19,17,null,-1,null,null,null,-1,null,-1,5,-1,12,null,null,3,5,5,null,null,1,null,-1,null,30,5,30,null,null,null,-1,null,-1,24,null,null,18,null,null,null,null,-1,null,null,18,null,null,-1,null,null,null,null,null,18,null,null,-1,null,4,29,30,null,12,-1,null,null,null,null,29,null,null,null,null,17,22,18,null,null,null,-1,null,null,null,20,null,null,null,-1,18,18,null,null,null,null,20,null,null,null,null,null,null,null]				
								
		//cache.put(2, 1);
		//cache.PrinterState();
		//cache.put(1, 1);
		//cache.PrinterState();
		//cache.put(2, 3);
		//cache.PrinterState();
		//cache.put(4, 1);
		//cache.PrinterState();
		//System.out.println(cache.get(1));
		//System.out.println(cache.get(2));
		
		//System.out.println(cache.get(2));
		//cache.put(2, 6);
		//cache.PrinterState();
		//System.out.println(cache.get(1));
		//cache.PrinterState();
		//cache.put(1, 5);
		//cache.PrinterState();
		//cache.put(1, 2);
		//cache.PrinterState();
		//cache.get(1);
		//cache.get(2);
		//cache.put(1, 1);
		//cache.PrinterState();
		//cache.put(2, 2);
		//cache.PrinterState();
		//cache.get(1);       // returns 1
		//cache.PrinterState();
		//cache.put(3, 3);    // evicts key 2
		//cache.PrinterState();
		//System.out.println(cache.get(2));       // returns -1 (not found)
		//cache.PrinterState();
		//cache.put(4, 4);    // evicts key 1
		//cache.PrinterState();
		//cache.get(1);       // returns -1 (not found)
		//cache.get(3);       // returns 3
		//cache.get(4);       // returns 4
	}
}
