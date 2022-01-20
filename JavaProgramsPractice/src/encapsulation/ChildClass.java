package encapsulation;

public class ChildClass extends ParentClass {

	public static void main(String[] args) {

		ChildClass cc = new ChildClass();
		cc.setNum(20);
		System.out.println("using getter Method bcz it is private: " + cc.getNum());
		cc.setWeight(57);
		System.out.println("Using getter Method bcz it is private: " + cc.getWeight());

		System.out.println("Accessing name by using PUBLIC: " + cc.name);
		System.out.println("Accessing age only within the package by Using Default: " + cc.age);
		System.out.println("Accessing Height can use inside or outside package by using protected: " + cc.height);

		cc.test();

	}

}
