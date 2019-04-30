import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class Chap11Ex13d {

	public static void main(String[] args) {
	Map<String,String> map = new HashMap<String,String>();
		map.put("Marty=", "Stepp");
		map.put("Stuart=",  "Reges");
		map.put("Jessica=",  "Miller");
		map.put("Amanda=",  "Camp");
		map.put("Hal=", "Perkins");
		System.out.println(isUnique(map));
	}
		
	
	//is unique test if map has unique values
	public static boolean isUnique(Map<String, String> map) {
		Set<String> values = new HashSet<>();
		
		for(String value : map.values()) {
			if(values.contains(value)) {
				return false; 
			} else
			{
				values.add(value);
			}
		}
	return true;
	}
}			


