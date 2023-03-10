	package com.IOstream;
	
	import java.io.FileWriter;
	
	public class WriterSample {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String data = "This is the data in gthe output file";
			try {
				FileWriter output = new FileWriter("E:\\Workspace\\SDETTrainingWS\\CoreJavaBasics\\src\\com\\IOstream\\output.txt");
				output.write(data);
				output.flush();
				output.close();
			}catch(Exception e) {
				e.getStackTrace();
				System.out.println(e.toString());
			}
		}
	
	}
