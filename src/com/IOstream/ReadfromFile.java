package com.IOstream;

import java.io.FileReader;
import java.io.IOException;

public class ReadfromFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		char[] arr   = new char[100];
		try {
			FileReader input = new FileReader("E:\\Workspace\\SDETTrainingWS\\CoreJavaBasics\\src\\com\\IOstream\\input.txt");
			input.read(arr);
			System.out.println("data in the File");
			System.out.println(arr);
			input.close();
		}catch(Exception e) {
			e.getStackTrace();
			System.out.println(e.toString());
		}
	}
	

}
