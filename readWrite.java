package com.sumit.read;

import java.io.*;
import java.util.Scanner;

public class readWrite {
	public static void main(String[] args) throws IOException {
		readWrite rs = new readWrite();
		System.out.println(rs.readFile("C:\\Users\\SXS543\\Desktop\\abc.txt"));
		rs.writeFile1("C:\\Users\\SXS543\\Desktop\\abc.txt");

	}
	private String readFile(String pathname) throws IOException {

	    File file = new File(pathname);
	    StringBuilder fileContents = new StringBuilder((int)file.length());
	    Scanner scanner = new Scanner(file);
	    String lineSeparator = System.getProperty("line.separator");

	    try {
	        while(scanner.hasNextLine()) {
	            fileContents.append(scanner.nextLine() + lineSeparator);
	        }
	        return fileContents.toString();
	    } finally {
	        scanner.close();
	    }
	}
	
	private String readFile1(String file) throws IOException {
	    BufferedReader reader = new BufferedReader(new FileReader (file));
	    String         line = null;
	    StringBuilder  stringBuilder = new StringBuilder();
	    String         ls = System.getProperty("line.separator");

	    try {
	        while((line = reader.readLine()) != null) {
	            stringBuilder.append(line);
	            stringBuilder.append(ls);
	        }

	        return stringBuilder.toString();
	    } finally {
	        reader.close();
	    }
	}
	
	private void writeFile1(String s){
		try(FileWriter fw = new FileWriter("outfilename", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
			    out.println("the text");
			    //more code
			    out.println("more text");
			    //more code
			} catch (IOException e) {
			    //exception handling left as an exercise for the reader
			}
}
