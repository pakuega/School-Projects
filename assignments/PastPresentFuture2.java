package assignments;
import java.util.*;
import java.time.*;
public class PastPresentFuture2 {

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
		
		LocalDate d = LocalDate.of(year, month, day);
		
		if(d.equals(today))
		System.out.println(d + " is today");
		else
			if(d.isBefore(today))
			{
				System.out.println(d + " is in the past");
			}
			else
				if(d.isAfter(today))
				{
					System.out.println(d + " is in the future");
				}
					
	}

}
