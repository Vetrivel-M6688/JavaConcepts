package inheritance;


// Multilevel Inheritance
public class Child2Class extends Child1Class {

	public void child2Method() {
		System.out.println("Child 2 Method");
	}

	public static void main(String[] args) {

		Child2Class c2 = new Child2Class();
		c2.parentMethod();
		c2.child1Method();
		c2.child2Method();

	}

}
