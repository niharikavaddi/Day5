package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.service.MyCalculator;

/**
 * You are required to compute the power of a number by implementing a
 * calculator. Create a class MyCalculator which consists of a single method
 * long power(int, int). This method takes two integers, and , as parameters and
 * finds . If either or is negative, then the method must throw an exception
 * which says "". Also, if both and are zero, then the method must throw an
 * exception which says ""
 * 
 * @author Lakshmi Neeharika
 *
 */
public class MyCalculatorMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List list = new ArrayList();
		list.add(5);
		list.add(2);
		list.add(6);
		list.add("hello");
		MyCalculator myCalculator = new MyCalculator();
		for (int i = 0; i < list.size(); i = i + 2)
			myCalculator.calculate(list.get(i), list.get(i + 1));
		list = null;
	}

}
