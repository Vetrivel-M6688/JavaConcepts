package abstractionExample;

public class NorthState extends CentalGovt {

	public static void main(String[] args) {

		CentalGovt cn = new NorthState();
		cn.NEETExam();
		cn.ArmyTraining("India");
		cn.TAXPolicies();
		
	}

	@Override
	void NEETExam() {
		System.out.println("We allow NEET exams for medical students");
		
	}

	@Override
	void TAXPolicies() {
	
		System.out.println("obay tax aggrements by central government");
	}

}
