package assignments;
import java.util.Scanner;
public class PaintCamculator {

	public static void main(String[] args) {
		double num1;
		double num2;
		double num3;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter length: ");
		num1 = input.nextDouble();
		System.out.print("Enter width: ");
		num2 = input.nextDouble();
		System.out.print("Enter height: ");
		num3 = input.nextDouble();
		
		double sqft = computeArea(num1, num2, num3);
		double amt = computeGallons(sqft);
		computePrice(amt);
	
	}
	public static double computeArea(double length, double width, double height) {
		double area = 2*height*(length+width);
		return area;
	}
	public static double computeGallons(double area) {
		double gallons = area/350;
		System.out.println("You will need " + gallons + " gallons");
		return gallons;
		
	}
	public static double computePrice(double gallons) {
		double price = gallons * 32;
		System.out.println("The price to paint the room is $" + price);
		return price;
	}

}
