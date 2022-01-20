package innerClass;

public class OuterClass {

	int x = 10;
	
	class InnerClass{
		int y = 10;
		
		public static void main(String[] args) {
			OuterClass oc = new OuterClass();
			OuterClass.InnerClass ic = oc. new InnerClass();
			
			System.out.println(ic.y+oc.x);
		}
	}
}
