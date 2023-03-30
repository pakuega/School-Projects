/**
 * SP2022_BiWeeklySalaryOfEmployee_AKUEGANKEU_TEKEU class
 */
package SP2022_LAB3PART2_AKUEGANKEU_TEKEU;
import java.util.*;  //import java utilities
public class SP2022_BiWeeklySalaryOfEmployee_AKUEGANKEU_TEKEU 
{
	public static void main(String[] args)
	{
		String ID;
		String name;
		float salary;
		int hours;
		
		Scanner keyboard = new Scanner(System.in); // call the scanner method
		/**
		 * get user inputs
		 */
		System.out.println("Enter Employee ID number:");
		ID = keyboard.nextLine();
		System.out.println("Enter Employee name:");
		name = keyboard.nextLine();
		System.out.println("Enter hourly salary:");	
		salary = keyboard.nextFloat();
		System.out.println("Enter number of hours worked: ");
		hours = keyboard.nextInt();
		/**
		 * creates and object using user data
		 * and passes these arguments to the  
		 * SP2022_Employee_AKUEGANKEU_TEKEU class
		 */		
		SP2022_Employee_AKUEGANKEU_TEKEU input =  new SP2022_Employee_AKUEGANKEU_TEKEU(ID, name, salary, hours);
		
		System.out.print(input);   // calls toString method to display details
		keyboard.close();  //ends the use of the keyboard scanner
	}
}
