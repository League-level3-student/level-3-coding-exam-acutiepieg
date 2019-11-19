import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapCalculator {

	public Object commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int counter = 0;
		Set<String> keys1 = hashmap1.keySet();
		String[] keys = new String[keys1.size()];
		keys1.toArray(keys);
		
		for (int i = 0; i < keys.length; i++) {
			if (hashmap1.get(keys[i]) == hashmap2.get(keys[i])) {
				counter++;
			}
		}
		return counter;
	}

}
