package com.oops;

public class CallByMethod {

	public static void main(String[] args) {

		CallByMethod cbm = new CallByMethod();
		cbm.refMethod();

	}

	protected void refMethod() {
		int a = 10, b = 10;
		int c = a + b;
		System.out.println("Additional Val :" + c);

	}

}
