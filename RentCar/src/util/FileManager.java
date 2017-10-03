package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileManager {
	
	private Scanner reader;
	
	public FileManager(String file) {
		try {
			reader = new Scanner(new File(file));
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
	}

	public String readLine() {
		return reader.nextLine();
	}
	
	public void close() {
		reader.close();
	}
}
