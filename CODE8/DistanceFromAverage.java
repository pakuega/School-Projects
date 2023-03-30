package CODE8;
import java.util.*;
public class DistanceFromAverage {

	public static void main(String[] args) {
		double[] values = new double[15];
		final int cleaner = 99999;
		int i = 1;
		int j = 0;
		double input;
		double total = 0;
		double average;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a numeric value or 99999 to quit >> ");
		input = in.nextDouble();
		if(input == cleaner)
			System.out.println("Please Enter a numeric value >> ");
		while(input != cleaner && i < values.length)
		{
			values[i] = input;
			total = total + input;
			System.out.print("Enter a numeric value or 99999 to quit >>");
			input = in.nextDouble();
			if(input == cleaner)
				break;
			i++;
		}
		average = total / i;
		System.out.println("You entered " + i + " numbers and their average is " + average);
		for(j=1; j <= i; j++ )
		{
			System.out.println(values[j] + " is " + (values[j] - average) + " away from the average");
		}

	}

}
