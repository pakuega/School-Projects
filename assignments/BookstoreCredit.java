package assignments;

import java.util.Scanner;

public class BookstoreCredit {

	public static void main(String[] args) {
		String ID;
		double num1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name >> ");
		ID = input.next();
		System.out.print("Enter your gpa >> ");
		num1 = input.nextDouble();
		
		computeDiscount(ID,num1);
		

	}

	public static void computeDiscount(String name, double gpa) {
		System.out.println(name + ", your GPA is " +gpa+ ", so your credit is $" + (gpa*10));
	}
}
