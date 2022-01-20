package javaBasics;

public class IfElseAssingment {

	public static void main(String[] args) {

		/*
		 * Home Loan:      PESONAL LOAN:		EDU_LOAN:
		 * 	MALE =8%		MALE =11%			MALE =6%
		 * FEMALE =7%		FEMALE =10%			FEMALE =5%
		 * CHILD =6%		CHILD =8%
		 * AGE<30=8.5%
		 * AGE<40=7.5%*/

		String LoanType = "EducationLoan";
		char gender = 'C';
		int age = 5;
		float percentage = 0.0f;
		
		if(LoanType=="PesonalLoan")
		{
			if(gender=='M' || gender=='F' || gender=='C') {
				if(age>25 && age<35 && gender=='M') {
					percentage = 11.5f;
					System.out.println("Male Loan Percent >25 and <35 :"+percentage);
				}
				else if (age>40 && gender=='M') {
					percentage = 11.0f;
					System.out.println(" Male Loan Percent >40 :"+percentage);
				}
				else if (gender=='F' && age>20 && age<30) {
					percentage = 10.5f;
					System.out.println("Female Loan Percentage >20 and <30 :"+percentage);
				}
				else if (gender=='F' && age>35) {
					percentage = 10.0f;
					System.out.println("Female Loan Percentage >40 :"+percentage);
				}
				else if (gender=='C'&& age<25) {
					percentage = 8;
					System.out.println("Child Loan Percentage :"+percentage);
				}
				
			}
		}
		else if (LoanType=="HomeLoan") {
			if(gender=='M' || gender=='F' || gender=='C') {
				if (gender=='M' && age>25 && age<35) {
					percentage = 8.5f;
					System.out.println("Home loan Percent for Male >25 and <35 :"+percentage);
				}
				else if (gender=='M' && age>40) {
					percentage = 8.0f;
					System.out.println("Home Loan Percentage for Male >40 :"+percentage);
				}
				else if (gender=='F' && age>20 && age<30) {
					percentage = 7.5f;
					System.out.println("Home Loan Percentage for Female >20 and <30 :"+percentage);
				}
				else if (gender=='F' && age>35) {
					percentage = 7;
					System.out.println("Home Loan Percentage for Female >35 :"+percentage);
				}
				if (age<25) {
					percentage = 6.5f;
					System.out.println("Home Loan Percentage for Child :"+percentage);
				}
			}
		}
		else if (LoanType=="EducationLoan") {
			if(gender=='M'|| gender=='F') {
				if(gender=='M' && age>25 && age<35) {
					percentage = 6.5f;
					System.out.println("Education Loan Percernt for Male >25 and <35 :"+percentage);
				}
				else if (gender=='M' && age>40) {
					percentage = 6;
					System.out.println("Education Loan Percentage for Male >40 :"+percentage);
				}
				else if (gender=='F' && age>20 && age <30) {
					percentage = 5.5f;
					System.out.println("Education Loan Percent for Female >20 and <30 :"+percentage);
				}
				else if (age>40) {
					percentage = 5;
					System.out.println("Edcation loan percent fot Female >40 :"+percentage);
				}
				
			}
			else
			{
				System.out.println("Child loan is not avail");
			}
		}

	}

}
