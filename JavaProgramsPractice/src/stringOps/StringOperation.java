package stringOps;

import java.util.Scanner;

public class StringOperation {
	public void creatingString() {
		// Using String literal
		String litral_Name = "Vetrivel";		
		String new_Name = new String("VetrivelM");			// created  new space in the memory
		System.out.println("Used litral type: "+litral_Name);
		System.out.println("Used new keyword: "+new_Name);
	}
	public void getStringLength() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String You want??");
		String text = scanner.nextLine();
		System.out.println("Given String is :" + text);

		int length = text.length();
		System.out.println("Length of the String is: " + length);
		scanner.close();
	}
	public void trimString() {

		String text = "    You are Lazy     ";
		String text1 = "Example-2    ";
		System.out.println("Your String: "+text);
		String trimText=text.trim();
		System.out.println("text trimed as :"+trimText);
		System.out.println("text trimed as :"+text1.trim());
	}
	public void startsEndsWithString() {
		String text = "India is my country";
		System.out.println("1st Check :"+text.startsWith(""));// there is always empty string at the start, so true
		System.out.println("2nd Check :"+text.startsWith("India"));
		System.out.println("3rd Check :"+text.startsWith("india"));
		System.out.println("4th Check :"+text.endsWith(""));// there is always empty string at the end, so true
		System.out.println("5th Check :"+text.endsWith("try"));

	}
	public void replaceString() {
		String text="Wecome to Code";
		String replaceText = "Welcome to Learn";
		text=text.replace(text, replaceText);
		System.out.println(text);
		System.out.println(text.replace('o', 'a'));
		System.out.println(text.replace("Welcome", "Enter"));
	}
	public void reverseString() {
		String text="Hello World!", revText = "";

		//Without StringBuffer
		int textLen = text.length();
		for(int i=textLen-1; i>=0; i--) {
			revText=revText+text.charAt(i);
		}
		System.out.println("Original text :"+text);
		System.out.println("Reverse text :"+revText);

		//With StringBuffer
		StringBuffer sbuffer= new StringBuffer(text);
		System.out.println("StringBuffer Rev String: "+sbuffer.reverse());

		//With StringBuilder
		StringBuilder sbuilder= new StringBuilder(text);
		System.out.println("StringBuilder Rev Text: "+sbuilder.reverse());
	}
	public void isEmptyString() {
		String emptyText = "";
		String nullString = null;
		String text = "String Learing!!";
		System.out.println("For Empty String: "+emptyText.isEmpty());
		System.out.println("Checking null String: "+nullString.isEmpty());//throw NUll Pointer Exception
		System.out.println("For Full String: "+text.isEmpty());
	}
	public void lowerUpperCaseString() {
		String lowCaseText="VETRIVELM";
		String upperCaseText="vetrivelm";
		System.out.println(lowCaseText.toLowerCase());
		System.out.println(upperCaseText.toUpperCase());
	}
	public void subStringText() {
		String text = "www.google.com";
		System.out.println(text.substring(3));
		System.out.println(text.substring(3, 10));// Start index value Included, End Index value Excluded
		System.out.println(text.subSequence(0, 11));
	}
	public void valueOfString() {
		int i=10, j=10; char c='A'; float f=10.2f; double d=10.265; boolean b=true;
		System.out.println(i+j);
		System.out.println(String.valueOf(i)+String.valueOf(j));
		System.out.println(String.valueOf(c)+" "+String.valueOf(f)+" "+String.valueOf(d)+" "+String.valueOf(b));
	}
	public void compareToString() {
		String text = "Vetrivel";  // returns positive value if it exceeds with second string
		String compareText = "VetrivelM"; // returns negative value if it exceeds with actual string
		System.out.println(text.compareTo(compareText));

		if(text.compareTo(compareText)==0) { // If matches it will return ZERO
			System.out.println("String is equal!!");
		}else {
			System.out.println("String is not equal!!");
		}

	}
	public void concatString() {
		String text = "Vetrivel";
		String Text = "M";
		System.out.println(text.concat(Text));
	}
	public void latIndex() {
		String text = "Tomorrow will be holiday";
		System.out.println(text.lastIndexOf('i'));
	}
	public void indexOfChar() {
		String text = "Tomorrow will be holiday";
		System.out.println(text.indexOf('o'));
		System.out.println(text.lastIndexOf('o'));
	}
	public void indentString() {
		String text = "VetrivelM";
		System.out.println(text.indent(50));
	}
	public void comparisonStrings() {
		String text = "VetrivelM";
		String Text = "VetrivelM";
		System.out.println(text.equals(Text));
		System.out.println(text.compareTo(Text));
		System.out.println(text==Text);

	}
	public void containsString() {
		String text = "Tomorrow will be holiday";
		System.out.println(text.contains("Will"));
	}
	private void isBlankString() {

		String text = "        ";
		System.out.println(text.isBlank());
		System.out.println(text.isEmpty());
	}
	public static void main(String[] args) {

		StringOperation so = new StringOperation();
		//so.creatingString();
		//so.getStringLength();
		//so.trimString();
		//so.startsEndsWithString();
		//so.replaceString();
		//so.reverseString();
		//so.isEmptyString();
		//so.lowerUpperCaseString();
		//so.subStringText();
		so.valueOfString();
		//so.compareToString();
		//so.concatString();
		//so.latIndex();
		//so.indexOfChar();
		//so.indentString();
		//so.comparisonStrings();
		//so.containsString();
		//so.isBlankString();
	}

}
