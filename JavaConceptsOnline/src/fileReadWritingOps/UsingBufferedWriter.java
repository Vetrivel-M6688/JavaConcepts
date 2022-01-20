package fileReadWritingOps;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class UsingBufferedWriter {

	@Test
	public void bufferedWriter() throws IOException {
		
		String fileLocation = "C:\\Users\\Welcome\\Documents\\PrepGuide.txt";//writing in a existing file
		String content = "Buffered Writer is widly used concept and easy to build a script";
		
		FileWriter writer = new FileWriter(fileLocation);
		
		BufferedWriter bf = new BufferedWriter(writer);
		bf.write(content);
		bf.close();
	}
}
