package Question7;

import java.io.IOException;
import java.util.Scanner;

public class subStringDemo {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of words");
		int number = scanner.nextInt();

		scanner.nextLine();
		System.out.println("Enter the strings to be searched ");
		String[] strings = new String[number];
		for (int i = 0; i < number; i++) {
			strings[i] = scanner.nextLine();
		}
		
		System.out.print("Given String: ");
		String givenString = scanner.nextLine();
		
		for(int i=0;i<number;i++) {
			
			int count = CountWords.subStringCount(strings[i], givenString);
			System.out.println("Word: "+strings[i]+"	Count: "+count);
		}
	}

}
