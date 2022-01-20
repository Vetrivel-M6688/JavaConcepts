package fileReadWritingOps;

import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class UsingFileWrite {

	@Test
	public void fileWriter() throws IOException {
		
		String fileLocation = "FileWriterConcept.txt";//creating a new file within a project or by location
		String content ="This file is created within the project, and its performance is not good!!";
		
		FileWriter writer = new FileWriter(fileLocation);
		writer.write(content);
		writer.close();
	}
}
