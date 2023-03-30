package assignments;

import java.util.Scanner;

public class Dollars {

	public static void main(String[] args) {
		final int TWENTY = 20;
		final int TEN  = 10;
		final int FIVE = 5;
		final int ONE = 1;
		int amount;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter dollar amount >> ");
		amount = input.nextInt();
		
		int nTwenty = amount / TWENTY;
		int rTwenty = amount % TWENTY;
		int nTen = rTwenty / TEN;
		int rTen = rTwenty % TEN;
		int nFive = rTen / FIVE;
		int rFive = rTen % FIVE;
		int nOne = rFive / ONE;
		int rOne = rFive % ONE;
		
		System.out.println("$" + amount + " converted is " + nTwenty + " $20s, " + nTen + " $10s, " + nFive + " $5s, and " + nOne + " $1s.");
				

	}

}
