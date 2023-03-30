/**
 * SP2022_LAB2PART1_AKUEGANKEU_TEKEU
 * first name: Paul Williams
 * Last name: Akuegankeu Tekeu
 */
package SP2022_LAB2PART1_AKUEGANKEU_TEKEU;
import java.util.*;
public class SP2022_SharesInvestment_AKUEGANKEU_TEKEU 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		final float com = (float) 0.02; // commission cut
		String name; 
		int shareNum;   //number of shares
		float share_PP;   // share purchase price
		float share_SP;   // share sale price
		
		System.out.println("Enter your name: ");   // get the name
		name = input.nextLine();    
		System.out.println("How many shares do you want to invest: ");// get the number of shares
		shareNum = input.nextInt();
		System.out.println("Enter purchase price of a unit share: ");//get the purchase price per share
		share_PP = input.nextFloat();
		System.out.println("Enter the sale price of a unit share: ");// get the sale price per share
		share_SP = input.nextFloat();
		
		float SharesCost = share_PP * shareNum ;// get the cost of purchasing all desired shares
		float PComFee = SharesCost * com ; // get the purchase commission
		float Investment = SharesCost + PComFee; // get the total investment on the shares
		float ShareSales = share_SP * shareNum; // this is the cost of selling all the shares
		float SComfee = ShareSales * com; // get the sales commission
		float Sales = ShareSales - SComfee;// this is the total sale shares money
		float profit = Sales - Investment; // this is the net profit
		
		/**
		 * Display output as proposed. Floating numbers to 2 decimal points 
		 * and all right aligned with the last hyphen "dash"
		 */
		System.out.println("File name: SP2022_SharesInvestment_Akuegankeu_Tekeu.java");
		System.out.println("Spring 2022 semester – PAUL WILLIAMS AKUEGANKEU TEKEU");
		System.out.println("------------------------------------------------------");
		System.out.printf("Name of investor: %36s\n", name);
		System.out.printf("Number of shares: %36s\n", shareNum);
		System.out.printf("Purchase price of each share: %24.2f\n", share_PP);
		System.out.printf("Money Invested: %38.2f\n", Investment);
		System.out.printf("Sale price of each share: %28.2f\n", share_SP);
		System.out.printf("Money returned: %38.2f\n", Sales);
		System.out.println("------------------------------------------------------");
		System.out.printf("The profit gets from investing: %22.2f\n", profit);

	}

}
