package arrayConcepts;

import java.util.Scanner;

public class SingleDimensional {

	public static void main(String[] args) {

		SingleDimensional sd = new SingleDimensional();
		// sd.arrayCreation();
		// sd.arrayInitialization();
		// sd.callingDiffData();
		/* TYPE 1: 
		 * int[] numbers = new int[5]; 
		 * numbers[0]=10; 
		 * numbers[1]=20; 
		 * numbers[2]=30;
		 * numbers[3]=40; 
		 * numbers[4]=50;
		 * 
		 * sd.inParameter(numbers);
		 */
		
		/* TYPE 2:
		 * int[] numbers = {10,20,30,40}; 
		 * sd.inParameter(numbers);
		 */
		
		/* TYPE 3:
		 * sd.inParameter(new int[] {10,20,30,40});  
		 */
		
		
		/*
		 * for(String names:sd.outParameter()) {
		 * System.out.println("Return values: "+names); }
		 */
		
		sd.getArrayValues();
	}

	public void arrayCreation() {
		int[] numbers = new int[5];
		numbers[0] = 100;
		numbers[1] = 200;
		numbers[2] = 300;
		numbers[3] = 400;
		numbers[4] = 500;

		System.out.println("Printing Single value from the INDEX[2]: " + numbers[2]);
		System.out.println("=====================================================");
		System.out.println("Printing all the values using general FOR loop:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("In Index " + i + " value: " + numbers[i]);
		}

		System.out.println("=====================================================");
		System.out.println("Printing values using Advanced FOR loop:");

		for (int giveNum : numbers) {
			System.out.println("Values :" + giveNum);
		}

		System.out.println("=====================================================");
		System.out.println("Printing values using While loop:");

		int count = 0;
		while (count < numbers.length) {
			System.out.println("In Index " + count + " Value is: " + numbers[count]);
			count++;
		}
	}

	public void arrayInitialization() {
		String[] langs = { "Java", "Oracle", "SQL", "C", "C#" };

		System.out.println("Iterating using while loop: \n=============================");
		int count = 0;
		while (count < langs.length) {
			System.out.println("In INDEX :" + count + " Value is: " + langs[count]);
			count++;
		}
	}

	public void callingDiffData() {
		Object[] data = new Object[7];
		data[0] = 1234;
		data[1] = 12345689L;
		data[2] = 'M';
		data[3] = "Vetrivel";
		data[4] = 2.35f;
		data[5] = 25.3687;
		data[6] = true;

		System.out.println("Iteration using for Each loop \n==================================");
		for (Object objects : data) {
			System.out.println("DATA: " + objects);
		}

	}

	public void inParameter(int[] nums) {
		System.out.println("Using InParameter and for loop\n================================");
		for (int i = 0; i < nums.length; i++) {
			System.out.println("In INDEX: " + i + " value: " + nums[i]);
		}
	}

	public String[] outParameter() {
		
		return new String[] {"Vetri","Vel","M"};

	}

	public void getArrayValues() {
		Scanner scan = new Scanner(System.in);
		int[] numerics = new int[5];
		
		for(int i=0; i<numerics.length; i++) {
			numerics[i]=scan.nextInt();
		}
		for(int i=0; i<numerics.length; i++) {
			System.out.println(numerics[i]);
		}
		
		
		
		
		
		
		
	}
}
