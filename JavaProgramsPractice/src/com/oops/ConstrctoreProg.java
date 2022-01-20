package com.oops;

public class ConstrctoreProg {

	/*
	 * It doesn't have any return type Default constructor invoke when object
	 * creation itself Parameterized constructor can identified and diffrentiate by
	 * (1)DataType, (2)no.of DataType, (3)order of DataType we can pass the values
	 * as the arguments when object creation Support Method Overloading and doesn't
	 * support Method Overriding we can also create constructor by any access
	 * specifiers
	 */

	// Default Constructor
	public ConstrctoreProg() {
		System.out.println("This is a default Constructor!!");
	}

	public ConstrctoreProg(int Id) {
		System.out.println("Employee Id is :" + Id);
	}

	public ConstrctoreProg(String name) {
		System.out.println("Employee Name is :" + name);
	}

	public ConstrctoreProg(int seatNo, String ComputerName) {
		System.out.println("Seat number and Computer Name as: " + seatNo + " " + ComputerName);
	}

	public ConstrctoreProg(String designation, int salary) {
		System.out.println("Your designation and Salary would be :" + designation + " " + salary);
	}

	public static void main(String[] args) {

		ConstrctoreProg obj = new ConstrctoreProg();
		ConstrctoreProg obj1 = new ConstrctoreProg(123);
		ConstrctoreProg obj2 = new ConstrctoreProg("VetrivelM");
		ConstrctoreProg obj3 = new ConstrctoreProg(5, "Lenevo");
		ConstrctoreProg obj4 = new ConstrctoreProg("AutomationQA", 30000);
	}

}
