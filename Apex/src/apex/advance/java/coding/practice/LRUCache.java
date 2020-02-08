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
			return -1;
		}
		
	}

	public void put(int key, int value) {
		if (this.sizeLRU == count) {
			hm.remove(keyQueue.poll());
			count--;
		}
		hm.put(key, value);
		keyQueue.add(key);
		count++;

	}
	public void PrinterState() {
		// TODO Auto-generated method stub
		System.out.println("hashmap: " + hm);
		System.out.println("queue: " + keyQueue);
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRUCache cache = new LRUCache( 2 /* capacity */ );
	//[null,-1,null,-1,null,null,2,6]
		System.out.println(cache.get(2));
		cache.put(2, 6);
		cache.PrinterState();
		System.out.println(cache.get(1));
		cache.PrinterState();
		cache.put(1, 5);
		cache.PrinterState();
		cache.put(1, 2);
		cache.PrinterState();
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