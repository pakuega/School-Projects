package assignments;
import java.util.*;
public class AcmePay {

	public static void main(String[] args) throws Exception{
		int shift,hours;
		double rate;
		int rplan;
		final double FIRST = 17;
		final double SECOND= 18.50;
		final double THIRD = 22;
		final double PLAN = .03;
		final double OTR = 1.5;
		double regpay = 0, otpay = 0, deduc = 0,netpay, tpay;
		Scanner data = new Scanner(System.in);
		System.out.println("Please enter shift - 1, 2, or 3");
		shift = data.nextInt();
		System.out.println("Please enter hours worked");
		hours = data.nextInt();

		if(shift==1)	
		{	rate = FIRST;
			if(hours<=40)
			regpay = hours*rate;
			else
			{	regpay = 40*rate;
				otpay= (hours-40)*rate*OTR;}
		tpay = regpay+otpay;
		}
		else 
		{	if(shift==2)
			{	rate = SECOND;
				if(hours<=40)
					regpay = hours*rate;
				else
				{
					regpay = 40*rate;
					otpay = (hours-40)*rate*OTR;
				}
			}
		else
		{	rate = THIRD;
			if(hours<=40)
			{	regpay = hours * rate;}
			else
				{
					regpay = 40*rate;
					otpay = (hours-40)*rate*OTR;
				}
			
		}
		if(shift==2 || shift==3)
			System.out.println("Do you want to participate in a retirement plan?"
					+ "\nEnter 1 for yes and 2 for No");
		rplan = data.nextInt();
		tpay = regpay+otpay;
			if(rplan== 1)
				deduc = PLAN * tpay;
		}
		netpay = tpay-deduc;
		System.out.println("Hours worked is " + hours);
		System.out.println("Hourly Pay rate is " + rate);
		System.out.println("Regular pay is " + regpay);
		System.out.println("Overtime pay is " + otpay);
		System.out.println("Retirement deduction is " + deduc );
		System.out.println("Net pay is...................." + netpay);
	}

}
