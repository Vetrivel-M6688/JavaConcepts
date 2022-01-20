package stringOps;

public class StringBuilderClass {

	/*
	 * StringBuilder is mutable, it won't create a new memory will replace the existing memory
	 * it is Non-Synchronized, which means multiple thread can call method simultaneously
	 * it is not ThreadSafe
	 */
	public static void main(String[] args) {
		String name = "Vetri";
		System.out.println("Original Name: "+name);
		System.out.println("joining the name: "+name.concat("vel"));
		System.out.println("Checking the name: "+name);
		System.out.println("======================================");
		StringBuilder name1 = new StringBuilder("James");
		System.out.println("Original Name: "+name1);
		System.out.println("Joing name: "+name1.append("Gosling"));
		System.out.println("Checking the name1: "+name1);
		System.out.println("**********************************");
		
		// StringBuilder methods
		
		// replace
		StringBuilder name2 = new StringBuilder("Vetri");
		System.out.println("Replace String: "+name2.replace(2, 4, "TR"));
		
		// reverse
		System.out.println();
		System.out.println("Reverse: "+name2.reverse());
		
		// delete
		System.out.println();
		System.out.println("Delete: "+name2.deleteCharAt(2));
		
		// insert
		System.out.println();
		System.out.println("Insertion: "+name2.insert(2, 'A'));
		
		// Capacity
		System.out.println();
		System.out.println("Capacity: "+name2.capacity());
		
		// length
		System.out.println();
		System.out.println("Length: "+name2.length());
		
		// subString
		System.out.println();
		System.out.println("subString: "+name2.substring(2));
		
		// charAt
		System.out.println();
		System.out.println("charAt: "+name2.charAt(3));
	}

}
