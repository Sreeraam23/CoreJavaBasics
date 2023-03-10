package com.IOstream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FolderCreationEx {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
//		String fileseperator = System.getProperty(File.pathSeparator);
//		System.out.println(fileseparator);
		String path = "E:\\Workspace\\SDETTrainingWS\\CoreJavaBasics\\src\\com\\IOstream";
		File file = new File("E:\\Workspace\\SDETTrainingWS\\CoreJavaBasics\\src\\com\\IOstream\\Sample.txt");
		boolean isfile = file.createNewFile();
		if(isfile) {
			System.out.println("The file is created");
		}
		else {
			System.out.println("The file is not created");
		}
		boolean folderornot = file.mkdir();
		if(folderornot) {
			try {
			File file1 = new File("E:\\Workspace\\SDETTrainingWS\\CoreJavaBasics\\src\\com\\IOstream\\Sample1.txt");
			boolean isfile1 = file1.createNewFile();
			}catch(Exception e) {
				e.getStackTrace();
				System.out.println(e.toString());
			}
		}
			else {
			String data = "Successfully written data on the file";

			FileWriter w = new FileWriter("E:\\Workspace\\SDETTrainingWS\\CoreJavaBasics\\src\\com\\IOstream\\Sample.txt");
			w.write(data);
			w.flush();
			w.close();
			}
		
			
			
	
	
	}
	

}
