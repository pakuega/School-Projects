package assignments;

import java.util.Scanner;

public class MinuteConversion {

	public static void main(String[] args) {
		
		final double MINUTES_IN_HOURS = 60;
		final double MINUTES_IN_DAYS = 1440;
		int minutes;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of minutes >> ");
		minutes = input.nextInt();
		
		double hours = minutes / MINUTES_IN_HOURS;
		double days = minutes / MINUTES_IN_DAYS;
		
		System.out.println(minutes + " minutes is " + hours + " hours or " + days + " days.");

	}

}
