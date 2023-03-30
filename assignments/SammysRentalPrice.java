package assignments;

import java.util.Scanner;

public class SammysRentalPrice {

	public static void main(String[] args) {
		
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		System.out.println("S   Sammy's makes it fun in the sun.   S");
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		
		final int COST_PER_HOUR = 40;
		final int COST_PER_MINUTE = 1;
		final int MINUTE_PER_HOUR = 60;
		int minute;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of minutes rented: ");
		minute = input.nextInt();
		
		int hours = minute / MINUTE_PER_HOUR;
		int xtraMinutes = minute - (hours * MINUTE_PER_HOUR);
		int cost = (hours * COST_PER_HOUR) + (xtraMinutes * COST_PER_MINUTE);
		
		System.out.println(minute + "minutes is equal to \n"
				+ hours + "hrs and " + xtraMinutes + "mins" +
				"\nTotal Price: $" + cost);

	}

}
