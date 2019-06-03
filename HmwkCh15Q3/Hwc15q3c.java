import java.util.*;
import java.util.ArrayList;

public class Hwc15q3c {
		
	public static void main(String[] args)	{
		//construct and print the list
		int[] nmbrs = {11, -7, 3, 42, 3, 0, 14, 3}; //define array with repeats of #3
		
		ArrayIntList list = new ArrayIntList(); //call up the ArrayIntListClass of methods

		for (int n : nmbrs) { //create an array 
			list.add(n);
			}
		
		System.out.println("list = " + list); //print the initial list
			
		for(int j=0; j<list.size(); j++) { //process thru list - using list.size
			if (list.indexOf(3)>=0) { //use method indexOf to find all indices for value 3
				list.replaceAll(list, 3, 999);}} //use replaceAll method at that index to replace 3 with 999
	 	  
	  System.out.println("now list = " + list);
}
}

