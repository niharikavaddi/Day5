package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

import com.service.RunRate;

/**
 * Given total runs scored and  total overs faced as the input. Write a program
 * to calculate the run rate with the formula,
 * 
 * Run rate= total runs scored/total overs faced.
 * 
 * Use BufferedReader class to get the inputs from user.
 * 
 *  This program may generate Arithmetic Exception / NumberFormatException. Use
 * exception handling mechanisms to handle this exception. Use a single catch
 * block. In the catch block, print the class name of the exception thrown.
 * 
 * @author Lakshmi Neeharika
 *
 */
public class RunRateMain {

	public static void main(String[] args) {
		BufferedReader bufferedReader = null;
		RunRate runRate = null;
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter total runs:");
			int runs = Integer.parseInt(bufferedReader.readLine());
			System.out.println("Enter total overs:");
			int overs = Integer.parseInt(bufferedReader.readLine());
			runRate = new RunRate();
			runRate.calculate(runs, overs);
		} catch (Exception exp) {
			System.err.println(exp.toString());
		}
		bufferedReader = null;
		runRate = null;

	}

}
