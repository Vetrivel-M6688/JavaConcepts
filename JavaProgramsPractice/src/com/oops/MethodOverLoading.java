package com.oops;

public class MethodOverLoading {

	public void addition(int a, int b) {
		int res;
		res = a + b;
		System.out.println("Sum " + res);
	}

	public int addition(int a, int b, int c) {
		int res;
		res = a + b + c;
		return res;
	}

	public void addition(float a, float b) {
		double res;
		res = a + b;
		System.out.println("Decimals " + res);
	}

	public void addition(String a, String b) {
		String res;
		res = a + b;
		System.out.println("String concat " + res);
	}

	public static void main(String[] args) {

		MethodOverLoading mo = new MethodOverLoading();

		mo.addition(10, 10);
		System.out.println("3 values Res " + mo.addition(10, 10, 10));
		mo.addition(10f, 10f);
		mo.addition("Vetri", "vel");

	}

}
