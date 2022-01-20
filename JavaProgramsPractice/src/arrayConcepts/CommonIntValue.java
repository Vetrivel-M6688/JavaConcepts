package arrayConcepts;

public class CommonIntValue {

	public static void main(String[] args) {
	
		int[] a1 = {10,20,30,40,50};
		int[] a2 = {20,40,60,80,30,70};
		
		for(int i=0; i<a1.length; i++) {
			System.out.print(a1[i]+" ");
		}
		
		System.out.println();
		for(int j=0; j<a2.length; j++) {
			System.out.print(a2[j]+" ");
		}
		
		System.out.println();
		System.out.println("Common Values found");
		for(int i=0; i<a1.length; i++) {
			for(int j=0; j<a2.length; j++) {
				if(a1[i]==a2[j]) {
					System.out.println(a1[i]);
				}
			}
		}
	}

}
