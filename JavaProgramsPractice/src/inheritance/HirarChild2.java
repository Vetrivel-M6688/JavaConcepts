package inheritance;

public class HirarChild2 extends ParentClass{

	public void hirarChild2() {
		System.out.println("hirarChild2 Method");
	}
	public static void main(String[] args) {

		HirarChild2 hc1 = new HirarChild2();
		HirarChild1 hc2 = new HirarChild1();
		hc1.parentMethod();
		hc1.hirarChild2();
		hc2.hirarChild1();
		
	}

}
