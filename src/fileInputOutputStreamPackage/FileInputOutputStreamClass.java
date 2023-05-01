package fileInputOutputStreamPackage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputOutputStreamClass {
	String studentNames;

	public void getNameFromTextFile() throws IOException {
		FileInputStream fstream = new FileInputStream("C:/Users/nishm/OneDrive/Pictures/pivot/StudentNameInTextFile.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		while ((studentNames = br.readLine()) != null) {
			System.out.println(studentNames);
		}
		fstream.close();
	}
}
