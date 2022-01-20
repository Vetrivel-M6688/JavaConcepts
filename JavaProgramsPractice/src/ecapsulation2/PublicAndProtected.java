package ecapsulation2;

import encapsulation.ParentClass; // encapsulation package imported

public class PublicAndProtected extends ParentClass {

	public static void main(String[] args) {

		PublicAndProtected pp = new PublicAndProtected();
		System.out.println(pp.height); // Protected="Inside"+"Outside" packages
		System.out.println(pp.name); // Public = Global access
		System.out.println(pp.getNum()); // even it is Private, we used "Encapsulation(Getter & Setter)"
		pp.setWeight(58);
		System.out.println(pp.getWeight()); // even it is Private, we used "Encapsulation(Getter & Setter)"
		// System.out.println(pp.age); age will be permitted as 'Default'
		pp.test();
		
		
	}

}
