package abstractionExample;

public class TamilNadu extends CentalGovt{

	@Override
	void NEETExam() {
		System.out.println("TN Govt won't allow Neet examinations");
	}

	@Override
	void TAXPolicies() {
		System.out.println("tax has to call back by Central govt");
	}

public static void main(String[] args) {
	CentalGovt cn1 = new TamilNadu();
	cn1.ArmyTraining("INDIA");
	cn1.NEETExam();
	cn1.TAXPolicies();
}
}
