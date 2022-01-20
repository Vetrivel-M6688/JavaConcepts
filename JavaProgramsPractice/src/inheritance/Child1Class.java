package inheritance;


// Single Inheritance
public class Child1Class extends ParentClass {

	public void child1Method() {
		System.out.println("Child 1 Method");
	}

	public static void main(String[] args) {

		Child1Class c1 = new Child1Class();
		c1.parentMethod();
		c1.child1Method();

	}

}
