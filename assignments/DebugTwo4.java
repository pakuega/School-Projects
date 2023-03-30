package assignments;

import java.util.Scanner;

public class DebugTwo4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	      String costString;
	      double cost;
	      final double TAX = 0.06;
	      System.out.println("Enter price of item you are buying");
	      costString = input.next();
	      cost = Double.parseDouble(costString);
	      
	      double tax = TAX * 100;
	      double price = cost + (cost *TAX);
	      System.out.println("With " + tax +
	      "% tax,  purchase  is $" + price);

	}

}
