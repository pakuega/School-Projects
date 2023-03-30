package assignments;
import java.util.*;
import java.math.*;
public class InBetween {

	public static void main(String[] args) {
		int a;
		int b;
		int high;
		int low;
		int c;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer >> ");
		a = in.nextInt();
		System.out.print("Enter another integer >> ");
		b = in.nextInt();
		
		low = Math.min(a, b);
		high = Math.max(a, b);
		c = low +1;
		if(high - low != 0 && high - low != 1)
		{
			System.out.print("The numbers between " + a + " and " + b + " include: ");
			for(c=c ; c<high ; c++)
			{
				System.out.print(c +" ");
			}
		}
		else
		{
			System.out.println("There are no integers between " + a + " and " + b);
		}
		
		

	}

}
