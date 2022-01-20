package ControlStatement;

public class SwitchConcept {
	
	/*
	 *  switch almost if then elseif and else concept 
	 *  switch and if then elseif and else functionality are same, syntax is different
	 *	only comparision operator(==) we can use
	 *  int and string datatype only we can use for comparison
	 *  duplicate comparison value not accepted
	 Syntax :
	 
	  	Switch (comparision){
	  		case "Value1" :
	  			---coding
	  		break;
	  		case "Value2" :
	  			---coding
	  		break;
	  		.
	  		.
	  		default :
	  			--coding
	  		break;
	  	}
	 
	 */
	public static void main(String[] args) {
		System.out.println("Start");
		//example :1
		String courseName = "JAVA";
		switch (courseName) {		
		case "Oracle" :
			System.out.println("Case 1");
		break;
		case "Java" :
			System.out.println("Case 2");
		break;
		case "c#":
			System.out.println("Case 3");
		break;
		case "Sql":
			System.out.println("Case 4");
		break;
		default :
			System.out.println("Default");
		break;
		}
		System.out.println("End");
		
		//if example
		if (courseName == "Java") {
			System.out.println("if");
		}
		else if (courseName == "Oracle") {
			System.out.println("else if 1");
		}
		
		//example :2
		/*float f1 = 10.5f;
		switch (f1) {
		
		}*/
		
		//example :2
		int a = 100;
		switch (a) {
		case 50:
			System.out.println("int 1");
			break;
		case 60:
			System.out.println("int 2");
			break;
		}
		
	}
	

}



