package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileInformations {

	public static void main(String[] args) throws IOException {
		String filename = "C:\\Users\\Welcome\\Documents\\javaFile.txt";
		File existFile = new File(filename);
		if(existFile.exists()) {
			System.out.println("File Name: "+existFile.getName());
			System.out.println("File path: "+existFile.getAbsolutePath());
			System.out.println("Can read the file: "+existFile.canRead());
			System.out.println("Can write the file: "+existFile.canWrite());
			System.out.println("Canonical Path: "+existFile.getCanonicalPath());
			System.out.println("Path of the file: "+existFile.getPath());
			System.out.println("Total space: "+existFile.getTotalSpace());
			System.out.println("Usable space: "+existFile.getUsableSpace());
			System.out.println("Does the file deleted: "+existFile.delete());
		}else
		{
			System.out.println("File is not exist");
		}
	}
}
