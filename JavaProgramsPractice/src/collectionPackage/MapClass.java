package collectionPackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/* HashMap, LinkedHashMap,TreeMap										TreeMap additional methods
 * ==============================										==========================
 * 1. put																firstEntry
 * 2. putAll															firstKey
 * 3. keySet															lastEntry
 * 4. values															lastKey
 * 5. containsKey														higherEntry
 * 6. containsValue														higherKey
 * 7. get																lowerEntry
 * 8. entrySet															lowerKey
 * 9. putIfPresent														ceilingEntry
 *10. getKey & getValue ===> Only work in looping using Entry			ceilingKey
 *11. remove ===> remove with Key only									floorEntry
 *12. remove ===> remove with Key and Value								floorKey
 *13. replace ==> replace with Key only
 *14. replace ==> replace with Key and Value(Replacing Value)
 *15. replace ==> replace with key and oldValue and newValue
 */

public class MapClass {

	public static void main(String[] args) {
		MapClass mc = new MapClass();
		//mc.hashMap();
		//mc.linkedHashMap();
		mc.treeMap();

	}

	public void hashMap() {

		HashMap<Integer, String> studentDet = new HashMap<Integer, String>();
		studentDet.put(1, "Vetri");
		studentDet.put(2, "Vijay");
		studentDet.put(3, "Naren");
		studentDet.put(4, "VG");
		studentDet.put(5, "prem");
		studentDet.put(6, "Vetri");

		// Printing Original Entries
		System.out.println("StudentDetails Entries: " + studentDet);

		// Copying all the entries to the next map
		HashMap<Integer, String> studentDet2 = new HashMap<Integer, String>();
		studentDet2.putAll(studentDet);
		System.out.println("Student Details 2: " + studentDet2);

		// Printing only keys
		System.out.println("Keys only: " + studentDet.keySet());

		// Printing only values
		System.out.println("Values only: " + studentDet.values());

		// Checking whether the key is present in the Map or not
		String resultKey = studentDet.containsKey(4) ? "YES" : "NO";
		System.out.println("Does Map contains key 4: " + resultKey);

		// Checking whether the values is present in the Map or not
		String resultValue = studentDet.containsValue("Vetri") ? "Yes" : "No";
		System.out.println("Does Map contains values \"Vetri\": " + resultValue);

		// Getting the specific value by using Key
		System.out.println("Value at key 3: " + studentDet.get(3));

		// Printing as pair
		System.out.println("Entry Set: " + studentDet.entrySet());

		// If the specific key present in the map then return the corresponding value
		// If not, then will fetch the value to that key and return NULL
		System.out.println("Using putIfPresent: " + studentDet.putIfAbsent(7, "Vel"));

		// Iterating the Map
		for (Map.Entry<Integer, String> me : studentDet.entrySet()) {
			System.out.println("Key= " + me.getKey() + " : Value= " + me.getValue());
		}

		// Removing the particular value from the Map using Key
		studentDet2.remove(5);
		System.out.println("After Removing using key only: " + studentDet2);

		// Removing the particular value and key by mentioning both
		studentDet2.remove(6, "Vetri");
		System.out.println("Afer Removing using key and value: " + studentDet2);

		// Replace the value by the Key
		studentDet2.replace(1, "Vetrivel");
		System.out.println("After the 5th key replacement: " + studentDet2);

		// Replace the oldValue with newValue by the help of Key
		studentDet2.replace(2, "Vijay", "VJ");
		System.out.println("After the 2nd key and old value replaced with new value: " + studentDet2);
	}

	public void linkedHashMap() {
		
		LinkedHashMap<Integer, String> studentDet = new LinkedHashMap<>();
		studentDet.put(2, "Vel");
		studentDet.put(3, "Vijay");
		studentDet.put(4, "VG");
		studentDet.put(6, "Naren");
		studentDet.put(5, "Prem");
		studentDet.put(2, "Vetri");
		
		System.out.println("Insertion order of LinkedHashMap: "+studentDet);
		
		HashMap<Integer, String> studDetHashMap = new HashMap<>();
		studDetHashMap.putAll(studentDet);
		System.out.println("Copied LinkedhashMap entries to HashMap: "+studDetHashMap);
		
		System.out.println("Keys: "+studentDet.keySet());
		
		System.out.println("Values: "+studentDet.values());
		
		System.out.println("Does StudentDet contains: "+studentDet.containsKey(1));
		
		System.out.println("Does StudentDet contains: "+studentDet.containsValue("Vel"));
		
		System.out.println("Get the value using get: "+studentDet.get(4));
		
		System.out.println("Entries: "+studentDet.entrySet());
		
		System.out.println("Entries one by one via loop:");
		for(Map.Entry<Integer, String> entry : studentDet.entrySet()) {
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
		
		studentDet.remove(5);
		System.out.println("After removed key 5: "+studentDet);
		
		studentDet.replace(4, "VG", "Vijay");
		System.out.println("Post Replcament: "+studentDet);
		
		if(studDetHashMap.equals(studentDet)) {
			System.out.println("Both has same keys and values!!");
		}else {
			System.out.println("Both has different keys and values...");
		}
		
				
	}

	public void treeMap() {
		
		TreeMap<Float, String> time = new TreeMap<>();
		
		time.put(2.56f, "Vetri");
		time.put(1.25f, "VG");
		time.put(4.65f, "Naren");
		time.put(3.4f, "Prem");
		time.put(2.45f, "Vijay");
		time.put(6.35f, null);
		time.put(4.35f, null);
		
		System.out.println("All entries: "+time);
		
		// returns immediate greater than or equal entry associated with the mentioned key or return NULL if nothing present
		System.out.println("next immediate equal or great entry than \"2.0\"= "+time.ceilingEntry(2.0f));
	
		// return immediate greater or equal key only or return NULL if nothing present
		System.out.println("Next immediate equal or great Key than \"4.0\"= "+time.ceilingKey(4.0f));
		
		//return immediate lower or equal entry associated with mentioned key, or return NULL if nothing there
		System.out.println("Next immediate equal or lower entry than \"3.0\" ="+time.floorEntry(3.0f));
		
		// return immediate lower or equal key only or return NULL if nothing is there
		System.out.println("Next immediate equal or lower key than \"1.24\" ="+time.floorKey(1.24f));
		
		// will find the least time entry 
		System.out.println("Least time taken in the race: "+time.firstEntry());
		
		// will find the least time key
		System.out.println("Least time taken Key: "+time.firstKey());
		
		// will find the max time entry
		System.out.println("Max time taken entry: "+time.lastEntry());
		
		// will find the max time key
		System.out.println("Max time taken key: "+time.lastKey());
		
		System.out.println("Strictly immediate next greater entry: "+time.higherEntry(2.40f));
		
		System.out.println("Strictly immediate next greater key: " +time.higherKey(2.22f));
		
		System.out.println("Strictly immediate next lower entry: "+time.lowerEntry(3.0f));
		
		System.out.println("Strictly immediate next lower key: "+time.lowerKey(4.0f));
		
		// Loop
		for(Map.Entry<Float, String> enteries : time.entrySet()) {
			System.out.println(enteries.getKey()+" = "+enteries.getValue());
		}
		
	}

}
