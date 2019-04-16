import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class RemovEvLen {
		
	//structure input via scanner of file with odd/even words
	public static void main (String[] args) {
		//Scanner console = new Scanner(System.in);
		//Scanner in1 = new Scanner(new File("test1.txt"));
		//command words to be input into array
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("oTool");
		list.add("eTools");
		list.add("oCars");
		list.add("eCar");
		list.add("oSpoons");
		list.add("eSpoon");
		list.add("oFork");
		list.add("eForks");
			
		//ArrayList<String> list1 = getWords(in1);
		
		//implement print of full list of words scanned in via file
		System.out.println("list = " + list);
		
		removEvnLngth(list);
		
	}
	
	
	//
	public static void removEvnLngth(ArrayList<String> list) {
		//work thru array string - if word length is even - remove
		int i = 0;
		while (i < list.size()) {
			String element = list.get(i); 
			if (element.length() % 2 == 0)  {
				list.remove(i);
			} else {
				i++;
			}
					
		}
		System.out.println("list now = " + list);
	

	} 

}
