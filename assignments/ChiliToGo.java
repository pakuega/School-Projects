package assignments;

import java.util.Scanner;

public class ChiliToGo {

	public static void main(String[] args) {
		
		final double cAdult = 7.0;  //cAdult is cost of adult meal
		final double cChild = 4.0;  //cChild is cost of Children's meal
		int mealA;
		int mealC;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of adult meals ordered >> ");
		mealA = input.nextInt();
		System.out.println("Enter number of child meals ordered >> ");
		mealC = input.nextInt();
		
		double tAdult = mealA * cAdult;  // total cost of adult meal ordered
		double tChild = mealC * cChild;  // total cost of child meal ordered
		double tTotal = tAdult + tChild; // total for all meals
		
		System.out.println(mealA + " adult meals were ordered at " + cAdult + " each.");
		System.out.println("Total is " + tAdult);
		System.out.println(mealC + " child meals were ordered at " + cChild + " each.");
		System.out.println("Total is " + tChild);
		System.out.println("Grand total for all meals is " + tTotal);
		
		

	}

}
