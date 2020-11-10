package com.main;

import java.util.Scanner;

/**
 * Java has built-in mechanism to handle exceptions. Using the try statement we
 * can test a block of code for errors. The catch block contains the code that
 * says what to do if exception occurs.
 * 
 * This problem will test your knowledge on try-catch block.
 * 
 * You will be given two integers and as input, you have to compute . If and are
 * not bit signed integers or if is zero, exception will occur and you have to
 * report it. Read sample Input/Output to know what to report in case of
 * exceptions.
 * 
 * @author Lakshmi Neeharika
 *
 */
public class SignedIntegersMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any two values");
		try {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println(a / b);
		} catch (Exception exp) {
			System.err.println(exp.toString());
		} finally {
			scanner = null;
		}

	}

}
