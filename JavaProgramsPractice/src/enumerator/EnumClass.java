package enumerator;

public class EnumClass {

	// Enum Inside the Class
	enum Direction {
		EAST, WEST, NORTH, SOUTH
	}

	public static void main(String[] args) {
		/*
		 * Direction myDir = Direction.WEST; 
		 * System.out.println(myDir);
		 */

		/*
		 * Level myLevel = Level.HIGH; 
		 * System.out.println(myLevel);
		 */

		/*
		 * for(Direction d : Direction.values()) 
		 * { System.out.println(d); }
		 */

		enum Days {
			MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
		}

		Days day = Days.TUESDAY;
		switch (day) {
		case MONDAY:
			System.out.println("Monday");
			break;
		case TUESDAY:
			System.out.println("Tuesday");
			break;
		case WEDNESDAY:
			System.out.println("Wednesday");
			break;
		case THURSDAY:
			System.out.println("Thursday");
			break;
		case FRIDAY:
			System.out.println("Friday");
			break;
		case SATURDAY:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Sunday");
			break;
		}
	}
}

//Enum Outside Class
enum Level {
	LOW, Medium, HIGH
}
