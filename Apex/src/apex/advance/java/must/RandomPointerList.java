package apex.advance.java.must;
public class RandomPointerList {

	/**
	 * @param args
	 */
	Node headNode;
	
	static class Node{
		int data;
		Node next;
		Node random;
		
		public Node(int i) {
			// TODO Auto-generated constructor stub
			this.next = null;
			this.random = null;
			this.data = i;
		}
		
		public void setNext(Node n) {
			this.next = n;
		}
		
		public void setRandom(Node n) {
			this.random = n;
		}
	}
	
	public void insertAdjacentNode(RandomPointerList list, int i) {
		
		Node newNode = new Node(i);
		if (list.headNode == null) {
			list.headNode = newNode;
		} else {
			Node temp = list.headNode;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public static void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
	}
	
	public void printRandomList(Node head) {
		Node tempNode = head;
		System.out.println("");
		while ( tempNode != null) {
			System.out.print(tempNode.random.data + " ");
			tempNode = tempNode.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		
		n1.setNext(n2);
		n1.setRandom(n6);
		
		n2.setNext(n3);
		n2.setRandom(n7);
		
		n3.setNext(n4);
		n3.setRandom(n1);
		
		n4.setNext(n5);
		n4.setRandom(n5);
		
		n5.setNext(n6);
		n5.setRandom(n4);
		
		n6.setNext(n7);
		n6.setRandom(n3);
		
		n7.setRandom(n2);
		
		RandomPointerList list = new RandomPointerList();
		list.headNode = n1;
		
		//printList(list.headNode);
		//list.printRandomList(list.headNode);	
		
		Node newCopyHeadNode = list.deepCopy(list.headNode);
		
	}
	
	public Node deepCopy(Node originalHead) {
		//printList(originalHead);
		RandomPointerList copyList = new RandomPointerList();
		if (originalHead == null) {
			return copyList.headNode = null;
		} else {
			Node temp = new Node(originalHead.data);
			copyList.headNode = temp;
		}
		Node tempOriginalNode = originalHead;
		Node tempCopyNode = copyList.headNode;
		//System.out.println(tempOriginalNode.data + " " + tempCopyNode.data);
		while (tempOriginalNode.next != null) {
			//System.out.println(tempOriginalNode.next.data);
			Node newNode = new Node(tempOriginalNode.next.data);
			tempCopyNode.next = newNode;
			tempCopyNode.random = tempOriginalNode;
			tempOriginalNode = tempOriginalNode.next;	
			tempCopyNode.random.next = tempCopyNode;
			tempCopyNode = tempCopyNode.next;
		}
		System.out.println(tempCopyNode.data);
		System.out.println(tempCopyNode.random.data);
		System.out.println(originalHead.random.data);
		
		
		tempCopyNode = copyList.headNode;
		tempOriginalNode = originalHead;
		while (tempCopyNode != null) {
			//System.out.println(tempCopyNode.random.data + " " + tempCopyNode.data);;
			System.out.println(tempCopyNode.random.data);
			//System.out.println(tempCopyNode.random.random.data);
			tempCopyNode = tempCopyNode.next;
			
		}
		//System.out.println();
		//printList(originalHead);
		/*System.out.print(copyList.headNode.data);
		System.out.print(copyList.headNode.next.data);
		System.out.print(copyList.headNode.next.next.data);
		System.out.print(copyList.headNode.next.next.next.data);
		System.out.print(copyList.headNode.next.next.next.next.data);
		System.out.print(copyList.headNode.next.next.next.next.next.data);
		System.out.print(copyList.headNode.next.next.next.next.next.next.data);
		
		*/
		
		return copyList.headNode;
	
	}

}
