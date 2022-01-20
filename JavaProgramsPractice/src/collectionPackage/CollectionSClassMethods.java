package collectionPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSClassMethods {

	public static void main(String[] args) {

		CollectionSClassMethods ccm = new CollectionSClassMethods();
		//ccm.addAllMethod();
		//ccm.methodSort();
		//ccm.methodBinarySearch();
		//ccm.methodCopy();
		//ccm.methodDisJoint();
	}

	public void addAllMethod() {
		List<String> langs = new ArrayList<String>();

		//Adding Elements one by one
		langs.add("Java");
		langs.add("C");
		langs.add("C++");

		//Adding element multiple elements
		Collections.addAll(langs, "Oracle","SQL","Python");

		//Printing all the elements
		for(int i=0; i<langs.size(); i++) {
			System.out.println(langs.get(i)+" ");
		}

	}

	public void methodSort() {
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(2);
		numbers.add(4);

		Collections.addAll(numbers, 3,1,8,5);

		for (Integer nums : numbers) {
			System.out.println("Before Sorting: "+nums);
		}

		// Sorting in Ascending Order
		Collections.sort(numbers);
		for(int i=0; i<numbers.size(); i++) {
			System.out.println("After Sorting: ASCENDING: "+numbers.get(i));
		}

		//Sorting in Descending Order
		Collections.sort(numbers, Collections.reverseOrder());
		for(int i=0; i<numbers.size(); i++) {
			System.out.println("After Sorting: DESCENDIND: "+numbers.get(i));
		}
	}

	public void methodBinarySearch() {
		List<String> brands = new ArrayList<String>();

		Collections.addAll(brands, "Xiomi", "Apple", "Vivo", "Oppo");

		//elements has to be in sorted order before using binary search
		Collections.sort(brands);
		for (String brandNames : brands) {
			System.out.println("Ascendind order: "+brandNames);
		}

		//Using binary search 
		System.out.println("The index of the Apple: "+Collections.binarySearch(brands, "Apple"));
		System.out.println("The index of the Vivo: "+Collections.binarySearch(brands, "Vivo"));
	}

	public void methodCopy() {

		List<String> animals = new ArrayList<String>();

		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Monkey");
		animals.add("Xiomi");
		animals.add("Lenevo");

		System.out.println("List of elements before copied: ");
		for(int i=0; i<animals.size(); i++) {
			System.out.println(animals.get(i));
		}
		System.out.println("================================");

		List<String> brands = new ArrayList<String>();

		brands.add("Apple");
		brands.add("Vivo");
		brands.add("Oppo");

		Collections.copy(animals, brands);
		System.out.println("List of elements after copied: ");
		for(int i=0; i<animals.size(); i++) {
			System.out.println(animals.get(i));
		}
	}

	public void methodDisJoint() {
		List<String> list1 = new ArrayList<String>();
		Collections.addAll(list1, "Books", "Notes", "Pens");

		List<String> list2 = new ArrayList<String>();
		Collections.addAll(list2, "Books", "Notes", "Pens");	// will return false
		Collections.addAll(list2, "Shirt", "Pants", "Belts");	// will return true

		System.out.println(Collections.disjoint(list1, list2));
	}
}
