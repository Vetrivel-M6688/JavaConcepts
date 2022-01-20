package com.oops;

public class CallByRefVariable {

	int i = 10;
	String name = "VetrivelM";

	public static void main(String[] args) {

		CallByRefVariable cbrv = new CallByRefVariable();

		System.out.println("Integer Val: " + cbrv.i);
		System.out.println("String Val: " + cbrv.name);

		cbrv.i = 100;
		cbrv.name = "VetrivelMunusamy";
		System.out.println(cbrv.i);
		System.out.println(cbrv.name);

	}

}
