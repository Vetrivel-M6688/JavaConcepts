package ControlStatement;

public class BreakAndContinue {
	 	
		//break : to terminate the condition(loop or if)
	
	public static void main(String[] args) {
		
		//break
		for(int a=1; a<= 100; a++) {
			if (a==10) {
				break;
			}
			System.out.println(a);
		}
		
		//example :2
		System.out.println("-------");
		for (int b=501;b<=510;b++) { 
		   for (int c=1001;c<=1005;c++) {
				if (b==502) {
					break;
				}
				System.out.println(b+" >> "+c);
		   }
		   //System.out.println(b);
		}
		
	}

}
