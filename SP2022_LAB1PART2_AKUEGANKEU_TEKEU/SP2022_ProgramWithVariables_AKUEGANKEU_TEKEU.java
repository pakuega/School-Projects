package SP2022_LAB1PART2_AKUEGANKEU_TEKEU;
import java.util.*;
public class SP2022_ProgramWithVariables_AKUEGANKEU_TEKEU 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		String word1, word2;
		float num1, num2, num3;
		
		System.out.print("Enter the first word: ");
		word1 = input.nextLine();
		System.out.print("Enter the second word: ");
		word2 = input.nextLine();
		System.out.print("Enter the first decimal number: ");
		num1 = input.nextFloat();
		System.out.print("Enter the second decimal number: ");
		num2 = input.nextFloat();
		System.out.print("Enter the third decimal number: ");
		num3 = input.nextFloat();
		
		float avNum = (num1+num2+num3)/3;
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("File SP2022_programWithVariables_Akuegankeu_Tekeu.java");
		System.out.println("Spring 2022 semester – PAUL WILLIAMS AKUEGANKEU TEKEU");
		System.out.println("-----------------------------------------------------------");
		System.out.println("Word 1: " + word1);
		System.out.println("Word 2: " + word2);
		System.out.println("First number: " + num1);
		System.out.println("Second number: " + num2);
		System.out.println("Third number: " + num3);
		System.out.println("The average of " + num1 + ", " + num2 + " and " + num3 + " is: " + avNum );
		System.out.println("-----------------------------------------------------------");
		
	}

}
