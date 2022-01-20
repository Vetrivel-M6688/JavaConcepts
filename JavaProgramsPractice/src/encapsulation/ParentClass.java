package encapsulation;

public class ParentClass {

	private int num = 10;
	public String name = "VetrivelM";
	int age = 25; // Default Access Modifier
	protected float height = 5.8f;
	private int weight;

	 protected void test() {
		System.out.println("Testing");
	}
	// Encapsulation method because we can not access private num and weight in child class
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int number) {
		this.num = number;
	}

}
