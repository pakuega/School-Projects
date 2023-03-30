package assignments;

import java.util.Scanner;

public class InchConversion {

	public static void main(String[] args) {
		int num1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter inches >> ");
		num1 = input.nextInt();
		
		convertToFeet(num1);
		convertToYards(num1);
		

	}

	public static void convertToFeet(int inches) {
		double feet =(double) inches/12;
		System.out.println(inches + " inches is " + feet + " feet");
				
	}
	
	public static void convertToYards(int inches) {
		double yards =(double) inches/36;
		System.out.println(inches + " inches is " + yards + " yards");
	}
}
