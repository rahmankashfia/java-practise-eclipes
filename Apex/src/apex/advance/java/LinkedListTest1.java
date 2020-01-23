package apex.advance.java;

public class LinkedListTest1 {
	Node head;
	class Node {
		int data;
		Node next;
		
		Node(int i) {
			this.data = i;
			this.next = null;
		}
	}
	
	public void insert(LinkedListTest1 list, int i) {		
		Node newNode = new Node(i);
		if(list.head == null) {
			list.head = newNode;
		} else {
			Node temp = list.head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public void printList(LinkedListTest1 list) {
		Node temp = list.head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedListTest1 list = new LinkedListTest1();
		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 3);
		list.insert(list, 4);
		list.insert(list, 5);
		list.insert(list, 6);
		
		list.printList(list);
	}

}
