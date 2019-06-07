import java.awt.List;
import java.util.*;



public class HwC16q3 {
	
	public static void main(String[] args) {
	
	LinkedIntList list = new LinkedIntList();
	list.add(1);
	list.add(20);
	list.add(5);
	list.add(10);
	list.add(101);
	
	
	System.out.println(list);
	
	list.correctSort();
	System.out.println("The list is sorted by increasing values: " + list.correctSort());
	
	
	
//	System.out.println("Size " + list.size());
//	System.out.println("Get " + list.get(2));
//    list.add(7, 77);
//    System.out.println(list);
	}
	
	
	/*--public boolean correctsort(LinkedIntList value) {
		if (value.front == null) {
			return false;
		} else {
			LinkedIntList current = value;
			while (current.next != null) {
				if (current <= current next) {
					current = current.nextFocus();
				}
			}return true;
		} else {
			return false;
		}
	}
	
	public boolean correctSort(LinkedIntList value) 
	{
		if(value.front == null) 
		{
			return false;
		}
		else 
		{
			LinkedIntList current = value; 
			while(current.next != null) 
			{
				if(current <= current.next) 
				{
					current = current.next;
				}
			}
			return true;
		}
		
		return false;
	}
} */
}






