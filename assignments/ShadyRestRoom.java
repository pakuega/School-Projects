package assignments;
import java.util.Scanner;
public class ShadyRestRoom {

	public static void main(String[] args) {
		int num;
		String message;
		final int QUEEN = 1;
		final int KING = 2;
		final int KPCS = 3;
		final int Q_PRICE = 125;
		final int K_PRICE = 139;
		final int KPC_PRICE = 165;
		final int D_PRICE = 0;
		final String Q = "Queen bed";
		final String K = "King bed";
		final String KPC = "Suite with a king bed and pull-out couch";
		final String D = "an invalid option";
		
		System.out.println("Menu" + "\n" + "\n(1)"+ Q + "\n(2)" + K +
							"\n(3)" + KPC);
		Scanner d = new Scanner(System.in);
		System.out.print("Enter Selection (1, 2, 3) >> ");
		num = d.nextInt();
		
		switch(num)
		{
			case(QUEEN):
			{
				message = Q + " $" +Q_PRICE;
				break;
			}
			case(KING):
			{
				message = K + " $" + K_PRICE;
				break;
			}
			case(KPCS):
			{
				message = KPC + " $" + KPC_PRICE;
				break;
			}
			default:
			{
				message = D + " $" + D_PRICE;
				break;
			}
		
		}
			
		System.out.println("You selected " + message);		

	}

}
