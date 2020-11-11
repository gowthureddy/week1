package com.problem3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] cardDetails;
		System.out.println("Enter Details");
		cardDetails = scanner.next().split("\\|");
		System.out.println("Enter 2 for payback card\n  1 for membership card");
		System.out.println("Enter  number");
		int input = scanner.nextInt();
		if (input == 1) {

			String holderNmae = cardDetails[0];

			String cardName = cardDetails[1];

			String expiryDate = cardDetails[2];

			System.out.println("Enter rating");
			float rating = scanner.nextFloat();

			MembershipCard card = new MembershipCard(holderNmae, cardName, expiryDate, rating);

			System.out.println(" Your name is " + card.getHolderName());
			System.out.println(" Your card name is " + card.getCardName());
			System.out.println(" Your name is " + card.getExpiryDate());
			System.out.println(" Your name is " + card.getRating());
		}

		if (input == 2) {

			String holderNmae = cardDetails[0];

			String cardName = cardDetails[1];

			String expiryDate = cardDetails[2];

			System.out.println("Enter rating");
			float rating = scanner.nextFloat();

			System.out.println("Enter points earned");
			float pointsearned = scanner.nextFloat();
			PaybackCard card = new PaybackCard(holderNmae, cardName, rating, expiryDate, pointsearned);

			System.out.println(" Your name is " + card.getHolderName());
			System.out.println(" Your card name is " + card.getCardName());
			System.out.println(" Your expiry is " + card.getExpiryDate());
			System.out.println(" Your rating is " + card.getRating());
			System.out.println("Your pintsearned " + card.getPointsearned());
		}

		scanner.close();


	}

}
