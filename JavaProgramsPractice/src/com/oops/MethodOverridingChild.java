package com.oops;

public class MethodOverridingChild extends MethodOverridingParent {

	@Override
	public void AxisBankInetrest(double intRate) {
		System.out.println("Axis Bank Changed Interest Rate :"+intRate);
	}
	@Override
	public void AxisBankDiscount() {
		System.out.println("We are giving 30% of Discount on any products!!");
	}
	
	public static void main(String[] args) {

		MethodOverridingParent mop = new MethodOverridingChild();
		mop.AxisBankInetrest(25.5);
		mop.AxisBankDiscount();
		
	}

}
