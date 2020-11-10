package com.service;

public class RunRate {
	public void calculate(int runs, int overs) throws NumberFormatException, ArithmeticException {
		try {
			System.out.println(runs / overs);
		} catch (Exception exp) {
			System.err.println(exp.getClass());
		}
	}

}
