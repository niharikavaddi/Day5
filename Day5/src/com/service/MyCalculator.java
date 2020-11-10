package com.service;

import java.lang.Math;

public class MyCalculator {
	public void calculate(Object object, Object object2) {
		try {
			System.out.println(Math.pow((int) object, (int) object2));
		} catch (Exception exp) {
			System.err.println(exp.toString());
			if ((int) object == 0 && (int) object2 == 0) {
				System.err.println("N and p should not be zero");
			} else {
				System.err.println("N or P should not be zero");
			}
		}
	}
}
