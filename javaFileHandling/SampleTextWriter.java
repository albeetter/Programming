package javaFileHandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
	
public class SampleTextWriter {

	static Scanner inputFile;
	static PrintWriter outputFile;
		
	public static void main(String[] args) {
			openFile();
			processFile();
			closeFile();

	}

	public static void openFile() {
			try {
				outputFile = new PrintWriter("../javaActivity/javaFileHandling/SampleText.txt");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
		}
	}
	public static void processFile() {
		outputFile.println("The journey of a thousand miles begins with a single step");
		outputFile.println("This little light of mine, I’m gonna let it shine");
		}
			

	public static void closeFile() {
		outputFile.close();	
	}
	
}


