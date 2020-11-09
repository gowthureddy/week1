package com.pojo;

public class Program345 {
	public float average(int num1, int num2, int num3) {
		return (num1 + num2 + num3) / 3;
	}

	public void SwapOfNumbers(int num1, int num2) {
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("a=" + num1 + " b=" + num2);

	}

	public boolean checkPrime(int num3) {
		int temp;
		if (num3 == 2)
			return true;
		if (num3 == 0)
			return false;
		for (temp = 2; temp < num3; temp++) {
			if (num3 % temp == 0) {
				return false;
			}
		}
		return true;

	}
}
