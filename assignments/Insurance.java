package assignments;
import java.util.Scanner;
public class Insurance {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the current year >> ");
		num1 = input.nextInt();
		System.out.print("Enter the birth year >> ");
		num2 = input.nextInt();
		
		calculatePremium(num1, num2);
	
	}
	public static int calculatePremium(int curr, int birth){
		int premium = (((curr - birth) / 10) + 15) * 20;
		System.out.println("The Premium is $" + premium);
		return premium;
	}
	

}
