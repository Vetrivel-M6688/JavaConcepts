package com.oops;

public class ThisClass {

	public static void main(String[] args) {

		ThisClass TC = new ThisClass();

	}

	public ThisClass() {
		this(20);
		System.out.println("I am non Parameterised constructor");
	}

	public ThisClass(int x) {
		this(1.25f);
		System.out.println("I am a Integer :" + x);
	}

	public ThisClass(String name) {
		System.out.println("I am String :" + name);
	}

	public ThisClass(float decimal) {
		this("vetri");
		System.out.println("I am Decimal Number: " + decimal);
	}

}
