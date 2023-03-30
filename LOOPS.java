import java.util.Scanner;
import java.io.*;

public class LOOPS {

	public static void main(String[] args) throws IOException 
	{
		int selection;
		do
		{
			Scanner in = new Scanner (System.in);
			Menu();
			selection = in.nextInt();
			
			switch (selection)
			{
			case 1:
				System.out.println("You select process 1");
				break;
			case 2:
				System.out.println("You select process 2");
				break;
			case 3:
				System.out.println("You select process 3");
				break;
			case 0:
				System.out.println("You select exit");
				break;
			default:
				Menu();
			}
		}
		while (selection != 0);
	}
	private static void Menu() 
	{
		System.out.print("MENU\n");
		System.out.print("1.Process 1\n");
		System.out.print("2.Process 2\n");
		System.out.print("3.Process 3\n");
		System.out.print("0.Exit\n");
		System.out.println();
		System.out.print("Type a number 1, 2, 3 to select process");
		System.out.println(" or 0 to exit.");
	}

}