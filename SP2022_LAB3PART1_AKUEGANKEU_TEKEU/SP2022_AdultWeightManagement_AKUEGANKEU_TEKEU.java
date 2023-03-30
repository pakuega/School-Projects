/**
 *  
 * SP2022_AdultWeightManagement_AKUEGANKEU_TEKEU Class
 *
 */
package SP2022_LAB3PART1_AKUEGANKEU_TEKEU;
import java.util.*;  //import the java utilities
public class SP2022_AdultWeightManagement_AKUEGANKEU_TEKEU 
{
	public static void main(String[] args)
	{
		String name;
		int height;
		float BMI;
		
		Scanner keyboard = new Scanner(System.in);  //calls a method that uses a scanner
		
		/**
		 * gets user input
		 */
		System.out.println("Enter Name:");
		name = keyboard.nextLine();
		System.out.println("Enter height in inches:");
		height = keyboard.nextInt();
		System.out.println("Enter expected BMI:");
		BMI = keyboard.nextFloat();
		
		/**
		 * creates and object using user data
		 * and passes these arguments to the  
		 * SP2022_Adult_AKUEGANKEU_TEKEU class
		 */
		SP2022_Adult_AKUEGANKEU_TEKEU input = new SP2022_Adult_AKUEGANKEU_TEKEU (name,height,BMI);
		
		System.out.print(input); // calls toString method
		keyboard.close(); // stops the use of the Scanner keyboard
		
	}

}
