package com.IOstream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Fileex {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File folder = new File("E:\\NewDir");
		boolean isdir = folder.mkdir(); //Folder is created in the specified directory
		String path = folder.getAbsolutePath();
		System.out.println("The pagth in which the folder is created"+path);
		File file = new File("E:\\NewDir\\test.txt");
		boolean isfile = file.createNewFile();
		if(isfile) {
			String data = "<script>alert(this is a cross site scripting vunerability)</script>";
			FileWriter filewrite = new FileWriter("E:\\NewDir\\test.txt");
			filewrite.write(data);
			filewrite.flush();
			filewrite.close();
			
		}
		
	}

}
