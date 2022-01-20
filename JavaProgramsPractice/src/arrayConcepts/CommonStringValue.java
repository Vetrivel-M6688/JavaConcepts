package arrayConcepts;

public class CommonStringValue {

	public static void main(String[] args) {
	
		String[] a = {"JAVA","ORACLE","C#","C++"};
		String[] b = {"PYTHON","JAVA","C","C++"};
		
		System.out.println("Common String values are: ");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i].equals(b[j])) {
					System.out.print(a[i]+" ");
				}
			}
		}
	}

}
