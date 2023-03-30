package assignments;

import java.util.Scanner;

public class ElectionStatistics {

	public static void main(String[] args) {
		
		String Party1;
		String Party2;
		String Party3;
		float vote1;
		float vote2;
		float vote3;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter name for first party >> ");
		Party1 = input.nextLine();
		System.out.println("Enter votes received >> ");
		vote1 = input.nextFloat();
		input.nextLine();
		
		System.out.println("Enter name for second party >> ");
		Party2 = input.nextLine();
		System.out.println("Enter votes received >> ");
		vote2 = input.nextFloat();
		input.nextLine();
		
		System.out.println("Enter name for third party >> ");
		Party3 = input.nextLine();
		System.out.println("Enter votes received >> ");
		vote3 = input.nextFloat();
		input.nextLine();
		
		double tVote = vote1 + vote2 + vote3;
		double Cent1 = (vote1 / tVote) * 100;
		double Cent2 = (vote2 / tVote) * 100;
		double Cent3 = (vote3 / tVote) * 100;
		
		
		System.out.println("The " + Party1 + " got " + Cent1 + " percent of the vote");
		System.out.println("The " + Party2 + " got " + Cent2 + " percent of the vote");
		System.out.println("The " + Party3 + " got " + Cent3 + " percent of the vote");
		
		
		

	}

}
