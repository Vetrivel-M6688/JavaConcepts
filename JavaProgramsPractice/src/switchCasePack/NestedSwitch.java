package switchCasePack;

public class NestedSwitch {

	public static void main(String[] args) {

		String name1 = "Vetrivel";
		String name2 = "Vijay";
		int level = 0;
		
		switch(name1) {
		case "Vetrivelm":
			switch(name2) {
			case "vetrivel":
				level = 5;
				break;
			case "vijay":
				level = 4;
				break;
			}
		case "Vetrivel":
			switch(name2) {
			case "vijay":
				level = 3;
				break;
			case "Vijay":
				level = 6;
				break;
			}
		}
		System.out.println(level);
	}

}
