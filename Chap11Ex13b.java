import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//cannot figure out why this one doesn't run???
	// Program to count the frequency of the elements in a List
public class Chap11Ex13b {

		public static void main(String[] args) {

			List<String> list = Arrays.asList("B", "A", "A", "C", "B", "A");

			Map<String, Integer> frequencyMap = new HashMap<>();
			for (String s: list) {
				Integer count = frequencyMap.get(s);
				if (count == null)
					count = 0;

				frequencyMap.put(s, count + 1);
			}

			for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}
	}

}

