package arrayConcepts;

public class SortingOrAscendingArray {

	public static void main(String[] args) {
	
		int[] arr = {10,25,3,4,23,45,98};
		System.out.println("Printing Original Array: ");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		// Sorting the array Using swapping mechanism
		
		int temp;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {					// Descending Order: if(arr[i]<arr[j])
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("Sorting Array as: ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
