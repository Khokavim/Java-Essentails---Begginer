package Tutorials;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileReading {
	
	private static final String filename = "fileToRead.txt";
	
	public static void main(String[] args) {
		BufferedWriter wr = null;
		try {
			// Open the file for writing, without removing its current content.
			wr = new BufferedWriter(new FileWriter(new File(filename), true));
			
			// Write a sample string to the end of the file.
			wr.write("A sample string to be written at the end of the file!\n");
		}
		catch(IOException e) {
			System.err.println("An IOException was caught!");
			e.printStackTrace();
		}
		finally {
			// Close the file.
			try {
				wr.close();
			}
			catch (IOException e) {
				System.err.println("An IOException was caught!");
				e.printStackTrace();
			}
		}
	}
}


