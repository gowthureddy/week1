package com.pojo;

public class Problem7Class {
	public static int checkCharacters(String input) {

		if (input.charAt(0) == input.charAt(input.length() - 1))
			return 1;
		return -1;
	}

}
