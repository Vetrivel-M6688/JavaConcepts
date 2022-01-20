package collectionPackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* Methods to be performed in ArrayList	   and		Methods additionally to perform in LinkedList
   ====================================				=============================================
 * 1. add()											1. addFirst()
 * 2. add(index, "Value")							2. addLast()
 * 3. contains()									3. getFirst()
 * 4. addAll()										4. getLast()
 * 5. clear()										5. removeFirst()
 * 6. size()										6. removeLast()
 * 7. get()											7. poll()
 * 8. indexOf()										8. pollLast
 * 9. lastIndexOf()									9. removeFirstOccurrence
 * 10. remove()										10. removeLastOccurrence
 * 11. retainAll()									11. iterator()
 * 12. set()										12. descendingIterator()
 * 13. Iterator
 * 		13.1. hasNext() and next()
 * 14. ListIterator
 * 		14.1. hasNext() and next()
 * 		14.2. hasPrevious and previous
 * 15. sort
 * 		15.1. Comparator.naturalOrder()
 * 		15.2. Comparator.reverseOrder()
 * 16. isEmpty()
 */

public class ListClass {

	public static void main(String[] args) {
		arrayList();
		//linkedList();
	}

	public static void arrayList() {
		ArrayList<String> brand = new ArrayList<String>();
		// Add method
		brand.add("Xiomi");
		brand.add("Samsung");
		brand.add("Apple");
		brand.add("Lenevo");
		brand.add("Vivo");
		brand.add("Oppo");
		brand.add("Apple");
		brand.add(null);
		System.out.println("Original List: "+brand);


		// Add by Index
		brand.add(1, "Micromax");
		System.out.println("Added by Index: "+brand);
		System.out.println();
		System.out.println("================================================");


		// Add all method==> from one list to another list
		ArrayList<String> anotherList = new ArrayList<String>();
		anotherList.addAll(brand);
		System.out.println("Another list by Added all: "+anotherList);
		anotherList.add("Nokia");
		anotherList.addAll(1, brand);
		System.out.println("Another list by Add all after the Index 1: "+anotherList);
		System.out.println();
		System.out.println("================================================");


		// Clear all the elements from the list
		anotherList.clear();
		System.out.println("Another list after using CLEAR: "+anotherList);
		System.out.println();
		System.out.println("================================================");


		// Check the element present in the list or not
		System.out.println("Does Lenevo present in the brand list: "+brand.contains("Lenevo"));
		System.out.println();
		System.out.println("================================================");


		// to know the size
		System.out.println("Brand list size: "+brand.size());
		System.out.println();
		System.out.println("================================================");


		//getting the particular value
		System.out.println("I need: "+brand.get(0));
		System.out.println();
		System.out.println("================================================");


		// to find the index of the element
		System.out.println("Index of Vivo is: "+brand.indexOf("Vivo"));
		System.out.println();
		System.out.println("================================================");


		// to find the last index of the element
		System.out.println("Last index of Apple is: "+brand.lastIndexOf("Apple"));
		System.out.println();
		System.out.println("================================================");


		// remove the particular element
		brand.remove(6);
		System.out.println("After removing Oppo from the list by index: "+brand);
		brand.remove("Apple");
		System.out.println("After removing duplicate Apple from the list by value:" +brand);
		System.out.println();
		System.out.println("================================================");


		// retain all the elements, which common on both lists
		anotherList.addAll(brand);
		brand.add("Infinix");
		brand.add("POCO");
		anotherList.add("yXtel");
		anotherList.add("Oneplus");
		System.out.println("brand List: "+brand);
		System.out.println("Another List: "+anotherList);
		anotherList.retainAll(brand);
		System.out.println("After retained Brand List: "+brand);
		System.out.println("After retained Another List: \n"+anotherList);
		System.out.println();
		System.out.println("================================================");


		// Replace the particular element in the list
		brand.set(6, "Honor");
		System.out.println("Honor replces Infinix: "+brand);
		System.out.println();
		System.out.println("================================================");


		// Check whether the list is empty or not
		anotherList.clear();
		System.out.println("Is Brand has elements: "+brand.isEmpty());
		System.out.println("Is Another List has elements: "+anotherList.isEmpty());
		System.out.println();
		System.out.println("================================================");

		// Iterator(We can achieve only in forward direction)
		Iterator<String> iterator = brand.iterator();
		while(iterator.hasNext()) {
			System.out.println("Iterator: "+iterator.next());
		}
		System.out.println("===============================================");


		// List Iterator(We can achieve both forward and backward direction)
		ListIterator<String> list_Iterator = brand.listIterator();
		// Forward traversing
		while(list_Iterator.hasNext()) {
			System.out.println("List_Iterator Forward: "+list_Iterator.next());
		}
		System.out.println("===============================================");


		// Backward traversing
		while(list_Iterator.hasPrevious()) {
			System.out.println("List_Iterator Backward: "+list_Iterator.previous());
		}
		System.out.println("================================================");


		// Ascending and descending
		brand.sort(Comparator.naturalOrder());
		for (String natural : brand) {
			System.out.println("Ascending Order: "+natural);
		}
		System.out.println("================================================");
		brand.sort(Comparator.reverseOrder());
		for (String reverse : brand) {
			System.out.println("Descending Order: "+reverse);
		}

		System.out.println();
		System.out.println("================================================");
		// removing all the elements from the list
		brand.removeAll(brand);
		System.out.println("After removed elements from the list: "+brand);


		System.out.println(brand.hashCode());

	}

	public static void linkedList() {

		LinkedList<String> brand = new LinkedList<String>();

		// adding the elements in the list
		brand.add("Toyato");
		brand.add("TATA");
		brand.add("Swift");
		brand.add("Audi");
		brand.add("Swift");
		brand.add("TATA");
		brand.add(null);

		System.out.println("Brand List: "+brand);
		System.out.println("====================================================\n");

		// 1.Adding the elements at the top of the list as a very first element/ head element
		brand.addFirst("BMW");
		System.out.println("After the first element addition: "+brand);
		System.out.println("====================================================\n");

		//2. Adding the element at bottom of the list as very last element/ tail element
		brand.addLast("Benz");
		System.out.println("After the last element addition: "+brand);
		System.out.println("====================================================\n");

		//3. Get the very first element
		System.out.println("First element in the list: "+brand.getFirst());
		System.out.println("====================================================\n");

		//4. Get the tail element
		System.out.println("Last element in the list: "+brand.getLast());
		System.out.println("====================================================\n");

		//5. removing HEAD element
		System.out.println("Removing first element from the list is: "+brand.removeFirst());
		System.out.println("Now the list has: "+brand);
		System.out.println("====================================================\n");

		//6. removing Tail element
		System.out.println("Removing last element from the list is: "+brand.removeLast());
		System.out.println("Now the list has: "+brand);
		System.out.println("====================================================\n");

		//7. Delete the first element using poll() or pollFirst()
		System.out.println("Deleting 1st element using POLL is: "+brand.poll());
		System.out.println("Now the list has: "+brand);
		System.out.println("====================================================\n");

		//8. Delete the last element 
		System.out.println("Deleting last element using POLL LAST is: "+brand.pollLast());
		System.out.println("Now the list has: "+brand);
		System.out.println("====================================================\n");

		//9. Removing duplicate element using its first occurrence
		brand.add("TATA");
		brand.add(3, "Hyundai");
		brand.removeFirstOccurrence("Swift");
		System.out.println("After Removing Duplicate Swift from the list: "+brand);
		System.out.println("====================================================\n");

		//10. Removing duplicate element using its last occurrence
		brand.removeLastOccurrence("TATA");
		System.out.println("After removing Duplicate TATA from the list: "+brand);
		System.out.println("====================================================\n");
		
		//11. Using iterator
		Iterator<String> iterator = brand.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("====================================================\n");
		
		//12. Reverse Order order list
		Iterator<String> iterator2 = brand.descendingIterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}

}
