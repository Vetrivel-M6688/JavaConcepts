package Basic;

public class DatatypeAndVariable {
	public static void main(String[] args) {
		/* 
		 *syntax  : Datatype variable; 
		 *         or
	                Datatype variable = value; //default assignment variable	 
		 */ 
		
		//short
		short s = 852;
		System.out.println("Short1 :"+s);
		s = 32767;
		System.out.println("Short2 :"+s);
		
		//int
		int i = 1234567890;
		i = 85693214;
		System.out.println("int :"+i);
		
		//long
		long g = -789654L;
		System.out.println("long :"+g);
		
		//float
		float t = 10.1234567895589f;
		System.out.println("Float :"+t);
		
		//double
		double d = 10.254565;
		System.out.println("double :"+d);
		
		//String
		String sr = "Hi how are you";
		System.out.println("String :"+sr);
		
		//Char
		char c = 'A';
		System.out.println("char :"+c);
		
		Boolean b = true;
		System.out.println("boolean :"+b);
	}
	
}
