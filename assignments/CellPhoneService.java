package assignments;
import java.util.*;
public class CellPhoneService 
{
	public static void main(String[] args) 
	{
		int mins;
		int sms;
		int gigs;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter talk minutes needed");
		mins = input.nextInt();
		System.out.println("Enter text messages needed");
		sms = input.nextInt();
		System.out.println("Enter gigabytes of data needed");
		gigs = input.nextInt();
		
        if(mins<500 && sms==0 && gigs==0)
        System.out.println("PLAN A $49 per month");
        else 
        	if(mins<500 && sms>0 && gigs==0)
        {
        	System.out.println("PLAN B $55 permonth");
        }
        else 
        	if(mins>=500 && sms<100 && gigs==0)
            {
        	System.out.println("PLAN C $61 permonth");
            }
        else 
    	    if(mins>=500 && sms>=100 && gigs==0)
            {
            System.out.println("PLAN D $70 permonth");
            }
        else 
    	    if(gigs>0 && gigs<3)
            {
            System.out.println("PLAN E $79 permonth");
            }
        else 
    	    if(gigs>=3)
            {
            System.out.println("PLAN F $87 permonth");
            }
	}
}
