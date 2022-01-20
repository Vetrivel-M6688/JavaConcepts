package Operators;

public class UnaryOperator {

	public static void main(String[] args) {
		
			//  ++    --   
		
			// ++  increment by 1
			int a = 100;
			a++;  // adding 1 by existing value
			a++;
			a++;
			a++;
			System.out.println("++ :"+a);
			
			// -- decrement by 1
			int b = 100;
			b--;
			b--;
			b--;
			System.out.println("-- :"+b);
			
			
			//all the functionality are same, but different syntax 
			//type 1
			int m = 100;
			int n = 1;
			int o = m +n;
			
			//type 2
			m = 100;
			m += 1;
			
			//type 3
			m = 100;
			m++;
		
	}

}
