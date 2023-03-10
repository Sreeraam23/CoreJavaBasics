package com.IOstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties connProp = new Properties();
		connProp.setProperty("username","trg08");
		connProp.setProperty("password","trg08");
		FileOutputStream file = new FileOutputStream("Information Properties");
		connProp.store(file, "Properties File");
		file.close();
		
		String uname = null;
		String password = null;
		Properties tempprop = new Properties();
		FileInputStream obt = new FileInputStream("Information Properties");
		tempprop.load(obt);
//		file.close();
		uname = tempprop.getProperty("username");
		password = tempprop.getProperty("password");
		System.out.println(uname+" "+password);
	}

}
