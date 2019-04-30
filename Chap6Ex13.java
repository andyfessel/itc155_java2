import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Chap6Ex13 {

	public static void main(String[] args) {
		
		int noOfKeys;
		String listOfValues;
		int noOfValues;
		Boolean answer;
		
	
		Map<String,String> namePairMap = new HashMap<String,String>();
		namePairMap.put("Marty=", "Stepp");
		namePairMap.put("Stuart=",  "Reges");
		namePairMap.put("Jessica=",  "Miller");
		namePairMap.put("Amanda=",  "Camp");
		namePairMap.put("Hal=", "Perkins");
		
		noOfKeys = namePairMap.size();
		//Collection<String> listOfValues = namePairMap.values();
		//listOfValues = namePairMap.values();
		//noOfValues = listOfValues.length();
		System.out.println("The collection is: " + namePairMap.values());
		System.out.println("the number of key/value pairs is: " + noOfKeys);
		
		Collection<String> a = (namePairMap.values());
        int count = 0, i = 0, n;
        try
        {
            while(a[i] != 'a')
            {
                count++;
                i++;
            }
        }
        catch(Exception e)
        {
            System.out.println("Number of elements in array:"+count);
        }
        n = a.length;
        System.out.println("Number of elements(Using inbuilt method named length):"+n);
		
		/*if(noOfKeys > namePairMap.values()) {
			answer = false;
		}else {
			answer = true;
		}*/
		
		//System.out.println("These names are unique: " + answer);
	
	}

}
