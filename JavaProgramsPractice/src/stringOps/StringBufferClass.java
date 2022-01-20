package stringOps;

public class StringBufferClass {

	/*
	 * StringBuffer is mutable, means it won't create new memory the existing value in the memory will replace
	 * synchronized, means two threads can't call the method simultaneously.
	 * ThreadSafe, means multiple threads cannot access it simultaneously
	 */
	public static void main(String[] args) {

		// example of String is immutable
		String designation = "Software";
		System.out.println("Original Name: "+designation);
		System.out.println("Joining Name: "+designation.concat("Engineer"));  // creates new space
		System.out.println("Checking the designation: "+designation);	// "Software" will print, it won't replaced
		System.out.println("===============================================");
		// example of String is mutable
		StringBuffer designation1 = new StringBuffer("Software");
		System.out.println("Original Name: "+designation1);
		System.out.println("Joining Name: "+designation1.append("Engineer"));
		System.out.println("Checking the designation: " +designation1);	// "SoftwareEngineer" will print, it will replace with original
		
		// StringBuffer methods
		
		// replace
		System.out.println("********************************************");
		System.out.println("Replace the existing String: "+designation1.replace(0, 8, "Testing"));
		
		// reverse
		System.out.println();
		System.out.println("Reversing the String: "+designation1.reverse());
		
		// insert
		System.out.println();
		StringBuffer insertion = new StringBuffer("Software");
		System.out.println("Inserting Text: "+insertion.insert(8, "Developer"));
		
		// delete
		System.out.println();
		StringBuffer deletion = new StringBuffer("I am Not a Tester");
		System.out.println("Delete: "+deletion.delete(5, 8));
		
		// capacity
		System.out.println();
		StringBuffer capacityCheck = new StringBuffer("NewWord");
		System.out.println("Capacity checking: "+capacityCheck.capacity());
		
		// String methods "length, subString, charAt" will works in StringBuffer too.
		// length
		System.out.println();
		StringBuffer lengthString = new StringBuffer("I am a Tester");
		System.out.println("Length of the String: "+lengthString.length());
		
		// subString type1
		System.out.println();
		System.out.println("subString with starting index alone: "+lengthString.substring(6));
		
		// subString type2
		System.out.println();
		System.out.println("subString for partial text: "+lengthString.substring(2, 5));
		
		// charAt
		System.out.println();
		System.out.println("Char at index: "+lengthString.charAt(5));
	}

}
