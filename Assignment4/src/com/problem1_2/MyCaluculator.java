package com.problem1_2;

public class MyCaluculator implements AdvancedInterface {
	@Override
	public int divisorSum(int n) {
		System.out.println("inside AdvancedInterface");
		// TODO Auto-generated method stub
		int sum = 0;
		if (n >= 1 && n < 1000) {
			for (int temp = 1; temp <= n; temp++) {
				if (n % temp == 0) {
					sum = sum + temp;
				}
			}
		}
		return sum;
	}

}
