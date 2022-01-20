package com.oops;

public class CopyConstructor {

	public static void main(String[] args) {

		CopyConstructor cc = new CopyConstructor(10, "VetriM");
		CopyConstructor cc1 = new CopyConstructor(cc);

	}

	int id;
	String name;

	public CopyConstructor(int i, String n) {

		id = i;
		name = n;
		System.out.println("org ID: " + id + " org name :" + name);
	}

	public CopyConstructor(CopyConstructor c) {
		id = c.id;
		name = c.name;
		System.out.println("Copy ID: " + id + " Copy name: " + name);
	}

}
