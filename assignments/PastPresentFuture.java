package assignments;
import java.util.*;
import java.time.*;
public class PastPresentFuture {

	public static void main(String[] args) {
		int year;
		int month;
		int day;
		
		LocalDate today = LocalDate.now();
		
		int YEAR = today.getYear();
		int MONTH = today.getMonthValue()+1;
		int DAY = today.getDayOfMonth();
		
		Scanner date = new Scanner(System.in);
		System.out.print("Enter a month >> ");
		month = date.nextInt();
		System.out.print("Enter a day >> ");
		day = date.nextInt();
		System.out.print("Enter a year (four digits) >> ");
		year = date.nextInt();
		
		if(year==YEAR)
		{
			if(month==MONTH)
			{
				System.out.println(month + " is this month ");
			}
			else
				if(month < MONTH)
				{
				System.out.println(month + " was a month earlier this year");	
				}
				else
					if(month > MONTH)
					{
					System.out.println(month + " is a month later this year");	
					}
		}
		else
		{
			System.out.println(year + " is not this year");
		}

	}

}
