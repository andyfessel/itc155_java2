//simple version of the linked list class 
public class LinkedIntList {

	protected static ListNode front; // first value in the list

	// construct an empty list
	public LinkedIntList() {
		front = null;
	}

	// append a value to the end of the list
	public void add(int value) {
		if (front == null) {
			front = new ListNode(value);
		} else {
			ListNode current = front;
			while (current.next != null) {
				current = current.next;
			}

			current.next = new ListNode(value);
		}

	}

	// return the current # of elements in the list
	public int size() {
		int count = 0;
		ListNode current = front;
		while (current != null) {
			current = current.next;
			count++;
		}

		return count;
	}

	// return a comma separated, bracketed version of the list
	public String toString() {
		if (front == null) {
			return "[]";
		} else {
			String result = "[" + front.data; // fence post
			ListNode current = front.next;
			while (current != null) {
				result += " , " + current.data;
				current = current.next;
			}

			result += "]";
			return result;
		}

	}

	// return the value at a given index in the list
	public int get(int index) {
		return nodeAt(index).data;
	}

	// pre: 0 < index < size()
	// return a reference to the node at a given index
	private ListNode nodeAt(int index) {
		ListNode current = front;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}

		return current;
	}

	// insert a value at a specified index
	public void add(int index, int value) {
		if(index == 0) {
			front = new ListNode(value, front);
		} else {
			ListNode current = nodeAt(index -1);
			current.next = new ListNode(value, current.next);
		}

	}
	
	//pre 0 < index < size()
	//post: remove value at the given index
	public void remove(int index) {
		if(index == 0) {
			front = front.next;
		} else {
			ListNode current = nodeAt(index - 1);
			current.next = current.next.next;
		}
	}
	
	
	// 1 > 2 > 3 > 4 > 5
	//prev = 5
	//current = null
	//true;
	
	//10 > 1 >3 >1
	//prev = 10
	//current = 1
	//false;
	public static boolean correctSort() 
	{
		if(front == null) 
		{
			return true;
		}
		
		ListNode prev = front; 
		ListNode current = prev.next;
		
		while(current != null) 
		{
			if(prev.data > current.data)
			{
				return false;
			}
			
			prev = current;
			current = prev.next;
		}
		
		return true;
	}
	
	

}
