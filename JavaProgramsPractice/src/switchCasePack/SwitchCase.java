package switchCasePack;

public class SwitchCase {

	public static void main(String[] args) {
		//Comparing with Numeric value
		int num = 20;

		switch (num) {

		case 10:
			System.out.println("10");
			break;
		case 20:
			System.out.println("20");
			break;
		case 30:
			System.out.println("30");
			break;
		default:
			System.out.println("No values found");
		}
		
		//Comparing with String value, ex- checking the level for the name
		
		String name = "Vetrivel";
		int level=0;
		switch (name) {
		case "vetrivel":
			level=1;
			break;
		case "vijay":
			level=2;
			break;
		case "Vijay":
			level=3;
			break;
		case "Vetrivel":
			level=4;
			break;

		default:
			System.out.println("Name not matches!!");
			break;
		}
		System.out.println(name +" Level is :"+level);

	}

}
