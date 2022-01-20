package arrayConcepts;

public class CopyArray {

	public static void main(String[] args) {

		// src_Array = source array, where we going to get the elements
		//src_POS = Source Position, from which index position we going to take
		//dest_Array = Destination Array, where we store the taken elements from the Source_Array
		//dest_POS = Destination Position, from which index we put the elements in a destination Array
		//length = Length of the elements we are taken
		
		// SYNTAX:
		// System.arrcopy(Object src_arr, int src_POS, Object dest_arr, int dest_POS, int length);
		
		char[] src_Arr = {'B','O','E','V','E','T','R','I','P','W','Q','M','L'};
		char[] dest_Arr = new char[src_Arr.length]; // getting the same length of the source Array to Destination Array

		System.arraycopy(src_Arr, 3, dest_Arr, 0, 5);
		System.out.println("Source Array: "+String.copyValueOf(src_Arr));
		System.out.println("Destination Array after Copied: "+String.copyValueOf(dest_Arr));
	}

}
