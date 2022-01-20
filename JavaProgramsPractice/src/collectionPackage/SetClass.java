package collectionPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

/* Methods to be performed in HashSet, LinkedHashSet, 													TreeSet
=======================================================													=======
* 1. add()																								first
* 				2. add(index, "Value")		Cannot Done													last
* 3. contains()																							headSet
* 4. addAll()																							tailSet						
* 5. clear()																							subSet						
* 6. size()																								comparator
* 				7. get()					Cannot Done		(Done by Converting to ARRAY or LIST)		higher			
* 				8. indexOf()				Cannot Done													lower	
* 				9. lastIndexOf()			Cannot Done													pollFirst
* 10. remove()																							pollLast
* 11. retainAll()																						descendingSet
* 				12. set()					Cannot Done		(Done by Converting to LIST)				descendingIterator
* 13. Iterator																							ceiling
* 		13.1. hasNext() and next()																		floor
				* 14. ListIterator
				* 		14.1. hasNext() and next()
				* 		14.2. hasPrevious and previous
				* 15. sort
				* 		15.1. Comparator.naturalOrder()
				* 		15.2. Comparator.reverseOrder()	
* 16. isEmpty()
*/
public class SetClass {

	public static void main(String[] args) {
		SetClass sc = new SetClass();
		//sc.setUsingUnion();
		//sc.setUsingIntersection();
		//sc.setUsingDifference();
		//sc.hashSet();
		//sc.linkedHashSet();
		sc.treeSet();
	}
	
	// Union Operation with type 1 of Arrays.asList
	public void setUsingUnion() {
		
		// Creating 1st array of elements
		Integer[] nums1 = new Integer[] {1,2,3,4,5,6,7};
		// Creating 2nd array of elements
		Integer[] nums2 = new Integer[] {3,9,0,8,1,5};
		
		// Creating 1st set for adding all the array1 elements in the set to change it as List view
		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(nums1));
		
		// Creating 2nd set for adding all the array2 elements in the set to change it as List view
		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(nums2));
		
		// Creating 3rd set to set the all the set1 values in the union set
		Set<Integer> union = new HashSet<Integer>(set1);
		union.addAll(set2); 	// adding all the values in the union from set2, will add only one value if it duplicate
		
		System.out.println("Adding the both sequence but ignores the duplicate numbers: "+union);
	}
	
	//Intersection operation with type 2 Array.asList
	public void setUsingIntersection() {
		
		Integer[] nums1 = new Integer[] {1,4,3,6,8,2,9};
		Integer[] nums2 = new Integer[] {5,4,8,7,2,6};
		
		// Setting the nums1 in to set1 using Set Initialization
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(nums1));
		System.out.println("Set1: values: "+set1);
		
		// Setting the num2 in to set2 using Set Initialization
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(nums2));
		System.err.println("Set2: values: "+set2);
		
		// Getting the common values using "retainAll()"
		set2.retainAll(set1);
		
		System.out.println("Printing the common values in the both num1 and num2: "+set2);
	}
	
	// Difference Operation with type 3 Array.asList
	public void setUsingDifference() {
		
		// Creating two Sets for getting the values from the Array
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		
		// adding all the Array elements to set1
		set1.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7}));
		System.out.println("Set1: values: "+set1);
		
		// adding all the Array elements to set2
		set2.addAll(Arrays.asList(new Integer[] {3,1,6,4,0,8}));
		System.out.println("Set2: values: "+set2);
		
		// Performing difference operation
		Set<Integer> Difference = new HashSet<Integer>(set1);
		Difference.removeAll(set2);
		
		// checking the A elements with B, when there is no match with B then will print the element
		System.out.println("Printing the difference values in the both num1 and num2: "+Difference);
		
	}
	
	
	public void hashSet() {
		
		HashSet<String> setItems = new HashSet<>();
		setItems.add("Amazon");
		setItems.add("Google");	// will eliminate the value because add() is boolean type
		setItems.add("Flipkart");
		setItems.add("Myntra");
		setItems.add("Google");	// will eliminate the value, no error will thrown
		setItems.add("Amazon");
		setItems.add("Ajio");
		setItems.add(null);
		
		System.out.println("Original Set Items: "+setItems);
		System.out.println("=======================================================\n");
		
		String containCheck = "Ebay";
		System.out.println("Contains "+containCheck+" in "+setItems.contains(containCheck));
		System.out.println("=======================================================\n");
		
		HashSet<String> setItems2 = new HashSet<>(setItems);
		System.out.println("Second list items by copying the values in object creation itself: "+setItems2);
		HashSet<String> setItems3 = new HashSet<>();
		setItems3.addAll(setItems2);
		System.out.println("Third List items by using addAll method: "+setItems3);
		System.out.println("=======================================================\n");
		
		setItems3.clear();
		System.out.println("Size of the list: "+setItems3.size() + " and the values: "+setItems3);
		System.out.println("=======================================================\n");
		
		// we cannot get the value using set itself because it doesn't maintain the constant index position for the values,
		// so we need to convert it to either "Array" or "List"
		// Using Array
		String[] forGetValuesArray = setItems2.toArray(new String[setItems2.size()]);
		System.out.println("Index Positions of each values: ");
		for(int i=0; i<forGetValuesArray.length; i++) {
			System.out.println("At Index= "+i+" value: "+forGetValuesArray[i]);
		}
		System.out.println("Printing the Specific values by getting the Index position: ");
		System.out.println("Element at the index[3] using Array: "+forGetValuesArray[3]);
		
		// Using List Convertion
		List<String> forGetValueList = new ArrayList<String>(setItems2);
		System.out.println("Element at the index[3] using List: "+forGetValueList.get(3));
		System.out.println("=======================================================\n");
		
		setItems.remove("Ajio");
		System.out.println("After removed \"Ajio\": "+setItems);
		System.out.println("=======================================================\n");
		
		System.out.println("Set Items: "+setItems);
		System.out.println("Set Items: "+setItems2);
		setItems2.retainAll(setItems);
		System.out.println("Used Retain all method, printing common values: "+setItems2);
		System.out.println("=======================================================\n");
		
		Iterator<String> iterator = setItems.iterator();
		System.out.println("Printing using Iterator:");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("=======================================================\n");
		
		// checking Set empty or not
		System.out.println("Set Item: "+setItems.isEmpty());
		System.out.println("Set Item2: "+setItems2.isEmpty());
		System.out.println("Set Item3: "+setItems3.isEmpty());
	}

	public void linkedHashSet() {
		LinkedHashSet<Integer> numberSet = new LinkedHashSet<>();
		numberSet.add(null);
		numberSet.add(10);
		numberSet.add(20);
		numberSet.add(30);
		numberSet.add(40);
		numberSet.add(10);			//will eliminate
		numberSet.add(null);
		numberSet.add(50);//will eliminate
		
		System.out.println("Printing original numberSet printing in Insertion order: "+numberSet);
		System.out.println("==============================================");
		
		int containChk = 30;
		System.out.println("Contains: "+containChk+" in numberSet: "+numberSet.contains(containChk));
		System.out.println("==============================================");
		
		HashSet<Integer> numberSet2 = new HashSet<>();
		numberSet2.addAll(numberSet);
		System.out.println("Printing second numberSet but printing in Random Order: "+numberSet2);
		System.out.println("==============================================");
		
		numberSet2.clear();
		System.out.println("numberSet2 elements Cleared: "+numberSet2+" and Size: "+numberSet2.size());
		System.out.println("==============================================");
		
		// getting the specific value by using get() with the help of Array
		Integer[] setToArray = numberSet.toArray(new Integer[numberSet.size()]);
		System.out.println("Element in the Index 2: "+setToArray[2]);
		System.out.println("==============================================");
		
		numberSet.remove(40);
		System.out.println("After removing value \'40\' from the numSet: "+numberSet);
		System.out.println("==============================================");
		
		numberSet2.addAll(numberSet);
		numberSet2.add(30);
		numberSet2.add(40);
		numberSet2.add(60);
		numberSet2.retainAll(numberSet);
		System.out.println("Common elements: "+numberSet2);
		System.out.println("==============================================");
		
		List<Integer> replceChk = new ArrayList<Integer>(numberSet);
		replceChk.set(2, 90);
		System.out.println(replceChk);
		System.out.println("==============================================");
		
		Iterator<Integer> LHS_iterator = numberSet.iterator();
		while(LHS_iterator.hasNext()) {
			System.out.println(LHS_iterator.next());
		}
		System.out.println("==============================================");
		
		System.out.println("Is numberSet empty: "+numberSet.isEmpty());
		System.out.println("Is numberSet2 empty: "+numberSet2.isEmpty());
 	}

	public void treeSet() {
		
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		numbers.add(5);
		numbers.add(7);
		numbers.add(1);
		numbers.add(4);
		numbers.add(3);
		numbers.add(2);
		numbers.add(8);
		
		System.out.println("default order: "+numbers);
		
		// getting the Lowest element from the set
		System.out.println("Lowest element in the Set: "+numbers.first());
		
		// getting the Highest element from the set
		System.out.println("Highest element in the Set: "+numbers.last());
		
		// printing lesser/ lower values than the given number from the Set(Given element exclude)
		System.out.println("Lesser than the given(4) value :"+numbers.headSet(4));
		
		// Printing greater/ higher values than the given number from the set(Given element include)
		System.out.println("Greater the the given(4) value: "+numbers.tailSet(4));
		
		// Printing the values in between specified two elements(1st element include and 2nd element exclude) 
		System.out.println("Range between 2 and 7: "+numbers.subSet(2, 7));
		
		// Descending order of the set using in build "descendingSet()" method
		System.out.println("Descending order of the set using \"descendingSet()\": "+numbers.descendingSet());
		
		// Checking the immediate higher value of the given element in the set
		System.out.println("Immediate next highest number to \'7\': "+numbers.higher(7));
		
		// Checking the immediate lower value of the given element in the set
		System.out.println("Immediate lower number to \'7\': "+numbers.lower(7));
		
		// checking whether the set printing in sorted ascending order, if yes the it will return NULL
		System.out.println("If numberSet in natural in natural order then Comparator return NULL: "+numbers.comparator());
		
		// Retrieving and deleting the 1st element in the set
		System.out.println("Retrieving and deleting the 1st element: "+numbers.pollFirst());
		System.out.println("After using the pollFirst: "+numbers);
		
		// Retrieving and deleting the last element in the set
		System.out.println("Retrieving and deleting the last element: "+numbers.pollLast());
		System.out.println("After using the pollLast: "+numbers);
		
		// Using ITERATOR
		Iterator<Integer> iterator = numbers.iterator();
		while(iterator.hasNext()) {
			System.out.println("Iterator: "+iterator.next());
		}
		
		// Using DescendingIterator
		Iterator<Integer> desIterator = numbers.descendingIterator();
		while(desIterator.hasNext()) {
			System.out.println("Descending Iterator: "+desIterator.next());
		}
		
		System.out.println(numbers.ceiling(0));
	}
	
}
