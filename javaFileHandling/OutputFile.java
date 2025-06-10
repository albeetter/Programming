package javaFileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class OutputFile {
	
	static Scanner inputFile;
	static PrintWriter outputFile;
	public static void main(String[] args) {
		openFile();
		processFile();
		closeFile();

	}

	public static void openFile() {
			try {
				inputFile = new Scanner(new FileReader("../javaActivity/javaFileHandling/SampleText.txt"));
				outputFile = new PrintWriter("../javaActivity/javaFileHandling/SampleOutputText.txt");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	}
	public static void processFile() {
		int fileLength = 0;
		int wordCount = 0;
		
		while (inputFile.hasNext()) {
			String line = inputFile.nextLine();
			fileLength += line.length();
			wordCount += line.split(" ").length;
			
		}
		
		outputFile.println("File Length: " + fileLength);
		outputFile.println("File Path: C:\\Users\\LITO ORTIZ\\eclipse-workspace\\javaActivity\\javaFileHandling");
		outputFile.println("Word Count: " + wordCount);
		
	}

	public static void closeFile() {
		inputFile.close();
		outputFile.close();
		
	}
}
