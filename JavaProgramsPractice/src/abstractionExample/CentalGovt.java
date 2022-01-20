package abstractionExample;

public abstract class CentalGovt {

	abstract void NEETExam();
	abstract void TAXPolicies();
	void ArmyTraining(String name) {
		System.out.println("Army Training for: "+name);
	}
	CentalGovt() {
		System.out.println("We can achieve our mission!!!");
	}
}
