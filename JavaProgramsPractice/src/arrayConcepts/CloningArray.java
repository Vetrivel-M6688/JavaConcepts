package arrayConcepts;

public class CloningArray {

	public static void main(String[] args) {
		CloningArray ca = new CloningArray();
		ca.CloneArr();
	}
	
	public void CloneArr() {
		
		int[] arr= {10,20,30,50,40};
		System.out.println("Below Are Original Array:\n============================");
		for(int i:arr) {
			System.out.println(i);
		}
		
		int[] cloneArr = arr.clone();
		System.out.println("Below Are Cloned Array\n===============================");
		for (int i : cloneArr) {
			System.out.println(i);
		}
		
		System.out.println(arr.equals(cloneArr));
	}

}
