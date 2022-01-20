package fileReadWritingOps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class fileReadUsingBufferedReader {

	//Reading sing line from the file
	@Test
	public void readSingleLine() throws IOException {
		String fileLocation = "FileWriterConcept.txt";

		FileReader fileReader = new FileReader(fileLocation);

		BufferedReader reader = new BufferedReader(fileReader);
		String textLine = reader.readLine();
		System.out.println(textLine);
		reader.close();
	}
	
	//Reading Multiple lines from the file
	@Test
	public void readMultiLine() throws IOException {
		
		String fileLoc ="FileReading.txt";
		FileReader fileReader1 = new FileReader(fileLoc);
		BufferedReader reader1 = new BufferedReader(fileReader1);
		
		String lines;
		while((lines=reader1.readLine())!=null) {
			System.out.println(lines);
		}
		reader1.close();
	}
}
