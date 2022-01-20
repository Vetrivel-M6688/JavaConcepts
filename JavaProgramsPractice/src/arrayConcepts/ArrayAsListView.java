package arrayConcepts;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListView {

	public static void main(String[] args) {

		// Viewing elements in Array Style
		Integer[] nums = new Integer[] {1,2,3,4,5,6,7,8};  // Should use Wrapper class
		for(int i=0; i<nums.length; i++) {
			System.out.println("numbers in Array view: "+nums[i]);
		}

		// Viewing elements in a List style
		
		List<Integer> numsList = Arrays.asList(nums);
		System.out.println(numsList);
	}


}
