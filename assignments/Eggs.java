package assignments;

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		final int cUnit1 = 45;
		final double cUnit = 0.45;
		final double cDozen = 3.25;
		final int EGGS_IN_DOZEN = 12;
		int eggs;
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many eggs do you wish to order? ");
		eggs = input.nextInt();
		
		int dozen = eggs / EGGS_IN_DOZEN;
		int unit = eggs % EGGS_IN_DOZEN;
		double TotalD = cDozen * dozen;
		double TotalU = cUnit * unit;
		double TotalC =TotalD + TotalU;
		
		System.out.println("You ordered " + eggs + " eggs. That's " + dozen + " dozen at $" +
		cDozen + " per dozen and " + unit +" loose eggs at " + cUnit1 + " cents each for a total of $" + TotalC +".");
		

	}

}
