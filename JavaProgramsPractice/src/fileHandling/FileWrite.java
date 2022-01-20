package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {

		// We use try catch operation to avoid the Exception occurence
		File writeFile = new File("C:\\Users\\Welcome\\Documents\\javaFile.txt");
		System.out.println(writeFile.canWrite());
		try {
			FileWriter writer = new FileWriter(writeFile);
			writer.write("I am a new file");
			writer.close();
		} catch (Exception e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
		}

	}

}
