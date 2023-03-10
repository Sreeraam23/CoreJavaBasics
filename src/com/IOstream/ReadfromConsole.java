package com.IOstream;

import java.io.BufferedReader;
import java.io.*;
public class ReadfromConsole {
	
	private static void process(String str) {
		System.out.println("processing....>"+str+"\n"); 
	}
	
private static void doReadFromStdin() {
	try {
		BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
		String inLine = "";
		
		while(!(inLine.equalsIgnoreCase("quit"))&& !(inLine.equalsIgnoreCase("exit"))) {
			System.out.println("prompt>");
			inLine = inStream.readLine();
			process(inLine);
		}
	}catch(IOException e) {
		System.out.println("IOException: "+e);
	}
}
public static void main(String[] args) {
	doReadFromStdin();
}
}