package fileInputOutputStreamPackage;

import java.io.BufferedReader;
import java.io.FileInputStream;
//import java.io.FileReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
//import java.io.Reader;
//import java.util.Scanner;


public class FileInputOutputStreamClass {
	String studentNames;
	String[] inputName=new String[3];
	Random rd=new Random();
	int rdNum=rd.nextInt(inputName.length);
	public void getNameFromTextFile() throws IOException {
		FileInputStream fstream = new FileInputStream(
				"src/fileInputOutputStreamPackage/StudentName.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		
			int i=0;
				while ((studentNames = br.readLine()) != null&&i<inputName.length) {
				inputName[i]=studentNames;
				i++;
			}
			System.out.println(inputName[rdNum]);
		fstream.close();
	}

	public void getIntValueFromFile() throws IOException {
		FileInputStream fstream = new FileInputStream(
				"src/fileInputOutputStreamPackage/StudentName.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		int num;
		while ((num=br.read())!= -1) {
			char c=(char)num;
			System.out.print(c);
		}
		fstream.close();	
	}
	
	public void getInputFromString() throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input a string");
		String name=br.readLine();
		System.out.println(name);
		System.out.println("Input your age");
		String age=br.readLine();
		int ageInt=Integer.parseInt(age);
		System.out.println(ageInt);
	}
}
