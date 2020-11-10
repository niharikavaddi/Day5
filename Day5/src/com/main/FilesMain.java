package com.main;

import java.io.File;
import java.util.Scanner;

/**
 * Handling a checked exception by opening a file Write a code opens a text file
 * and writes its content to the standard output. What happens if the file
 * doesn’t exist?
 * 
 * @author Lakshmi Neeharika
 */
public class FilesMain {

	public static void main(String[] args) {
		Scanner scanner = null;
		File file = null;
		String data;
		try {
			file = new File("C:\\Users\\vasuvaddi123\\Desktop\\HCL\\pro.txt ");
			scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				data = scanner.nextLine();
				System.out.println(data);
			}
		} catch (Exception exp) {
			System.out.println(exp.toString());
			System.err.println("File doesn't exist");
		} finally {
			scanner = null;
			file = null;
		}

	}

}
