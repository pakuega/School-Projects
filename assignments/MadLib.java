package assignments;

import java.util.Scanner;

public class MadLib {

	public static void main(String[] args) {
		
		String noun1, noun2, adjective, pVerb;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a noun: ");
		noun1 = input.next();
		System.out.println("Enter another noun: ");
		noun2 = input.next();
		System.out.println("Enter an adjective: ");
		adjective = input.next();
		System.out.println("Enter a verb in its past tense: ");
		pVerb = input.next();
		
		System.out.println("Mary had a little " + noun1);
		System.out.println("Its " + noun2 + " was " + adjective + " as snow");
		System.out.println("And everywhere that Mary " + pVerb);
		System.out.println("The " + noun1 + " was sure to go.");
		

	}

}
