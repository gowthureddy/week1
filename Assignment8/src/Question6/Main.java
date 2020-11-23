package Question6;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the name of the player");
		String name = scanner.nextLine();
		
		System.out.println("Enter the team name ");
		String team = scanner.nextLine();
		
		System.out.println("Enter the number of matches played ");
		int matchesPlayed = scanner.nextInt();
		
		PlayerDetails.OutputStream(name, team, matchesPlayed);
	}
}
