package com.service;

public class IplPlayer {
	public void validate(String name, int age) throws CustomException {
		System.out.println("Player Name:" + name);
		if (age < 19)
			throw new CustomException("InvalidAgeRangeException");
		else
			System.out.println("Player Age:" + age);

	}
}
