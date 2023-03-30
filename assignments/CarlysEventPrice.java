package assignments;

import java.util.Scanner;

public class CarlysEventPrice {

	public static void main(String[] args) {
		

		System.out.println("***********************************************");
		System.out.println("*Carly's makes the food that makes it a party.*");
		System.out.println("***********************************************");
		
		final int PRICE_PER_PERSON = 35;
		int guest;
		boolean isBigEvent;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of guests >> ");
		guest = input.nextInt();
		
		int pTotal = guest * PRICE_PER_PERSON;
		
		if (guest >= 50) 
				
			isBigEvent = true;
				
		else
		
			isBigEvent = false;
		
		System.out.println("Number of Guest: " + guest +
				"\nPrice per Guest: $" + PRICE_PER_PERSON +
				"\nTotal Price: $" + pTotal +
				"\nIs this a Big Event: " + isBigEvent);
		
				

	}

}
