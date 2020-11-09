package com.pojo;

public class Program7 {
	public String fizzBuzz(int temp) {
		
		if ((temp % 3 == 0) && (temp % 5 == 0))
			return temp +" "+"fizzBuzz";
		if ((temp % 3) == 0)
			return temp +" "+"fizz";
		if ((temp % 5) == 0)
			return temp +" "+"Buzz";

		return "";

	}

}
