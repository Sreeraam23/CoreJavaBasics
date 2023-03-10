package com.IOstream;

import java.io.File;
import java.io.IOException;

public class FileCreateSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File dir = new File("E:\\Newdirectory1");
		boolean  isDir = dir.mkdir();
		boolean val = false;
		String path = dir.getAbsolutePath();
//		System.out.println(path);
	    dir.exists();
	    
	    
		if(isDir) {
			File file = new File("E:\\Newdirectory1\\Newfile1.txt");
			val = file.createNewFile();
			if(file.exists()) {
				System.out.println(file.getAbsolutePath());
			}
			if(val) {
				System.out.println("The file is created");
			}
			else {
				System.out.println("File is not created");
			}
		}
	}

}
