package ineterfacePack;

public class InterfaceExeClass implements InterfaceProg, InterfaceProg2{ // overcame Multiple Inheritance

	public static void main(String[] args) {

		// 1st Interface with object calling but up to method 3 from 1st Interface
		InterfaceProg ip1 = new InterfaceExeClass();
		ip1.method1();
		ip1.method2();
		ip1.method3("VetrivelM");
		
		System.out.println("=========================================================");
		
		//2nd Interface with object calling but all methods from both Interfaces bcz I1 extends I2
		InterfaceProg2 ip2 = new InterfaceExeClass();
		ip2.method1();
		ip2.method2();
		ip2.method3("VetrivelM");
		ip2.method4();
		ip2.method5();
		ip2.method6();
	}

	@Override
	public void method1() {
		System.out.println("Method1 from 1st Interface");
	}

	@Override
	public void method2() {
		System.out.println("Method2 from 1st Interface");
	}

	@Override
	public void method3(String name) {
		System.out.println("Method3 from 1st Interface with Parameter: "+name);
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("Method4 from 2nd Interface");
	}

	@Override
	public void method5() {
		// TODO Auto-generated method stub
		System.out.println("Method5 from 2nd Interface");
	}

	@Override
	public void method6() {
		// TODO Auto-generated method stub
		System.out.println("Method6 from 2nd Interface");
	}

}
