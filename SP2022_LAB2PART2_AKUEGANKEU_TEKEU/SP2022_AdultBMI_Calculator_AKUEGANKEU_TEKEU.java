/**
 * SP2022_LAB2PART2_AKUEGANKEU_TEKEU
 * first name: Paul Williams
 * last name: Akuegankeu Tekeu
 */
package SP2022_LAB2PART2_AKUEGANKEU_TEKEU;
import java.util.*;
public class SP2022_AdultBMI_Calculator_AKUEGANKEU_TEKEU 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		String name; // this is the address for the user name variable
		int height, weight; // this is height and weight
		String sBMI = "18.5 - 24.9"; // this is the standard BMI
		
		System.out.println("Enter User name: "); //gets the name
		name = input.nextLine(); // assigns the name
		System.out.println("Enter height in inches: ");// gets the height
		height = input.nextInt(); // assigns the height
		System.out.println("Enter weight in pounds: ");// gets the weight
		weight = input.nextInt(); // assigns the weight
		
		float BMI = (float) (weight * 703) / (height * height); // calculates BMI
		
		/**
		 * The following outputs the projected output as requested in the lab assignment
		 */
		System.out.println("------------------------------------------------------");
		System.out.println("File name: SP2022_AdultBMI_Calculator_Akuegankeu_Tekeu.java");
		System.out.println("Spring 2022 semester – PAUL WILLIAMS AKUEGANKEU TEKEU");
		System.out.printf("Standard BMI: %39s\n", sBMI); // right aligns with the last letter of the name
		System.out.println("------------------------------------------------------");
		/**
		 * the rest of this code right aligns all values with seven dashes
		 * remaining on its right as in the picture on the lab. BMI is
		 * rounded to 2 decimal places
		 */
		System.out.printf("User Name: %36s\n", name);
		System.out.printf("Height (inches): %30d\n", height);
		System.out.printf("Weight (pound): %31d\n", weight);
		System.out.println("------------------------------------------------------");
		System.out.printf("BMI: %42.2f\n", BMI);

	}

}
