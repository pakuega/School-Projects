package CODE8;
import java.util.*;
public class Event {
	   public final static double HIGH_GUEST_PRICE = 35.00;
	   public final static double LOW_GUEST_PRICE = 32.00;
	   public final static int LARGE_EVENT = 50;
	   public String phoneNumber;
	   public String eventNumber="";
	   private int guests;
	   private double price;
	   private int eventType;
	   private final String[] EVENT_TYPES = {"wedding", "baptism", "birthday", "corporate", "other"};
	   
	   public void setEventType(int et1)
	   {
		   if(et1>EVENT_TYPES.length)
		   {
			   this.eventType = EVENT_TYPES.length - 1;
		   }
		   else
		   {
			   this.eventType = et1;
		   }
	   }
	   public void setPhoneNumber()
	   {
		   String num = "";
		   Scanner input = new Scanner(System.in);
		   System.out.println("Enter phone number >> ");
		   String phoneNumber = input.nextLine();
		   for(int i = 0; i < phoneNumber.length(); i++)
		   {
			   if(Character.isDigit(phoneNumber.charAt(i)))
			   {
				   num += phoneNumber.charAt(i);
			   }
		   }
		   if(num.length()!=10)
		   {
			   this.phoneNumber = "0000000000";
		   }
		   else
		   {
			   this.phoneNumber = num;
		   }
	   }
	   public void setEventNumber()
	   {
		   Scanner input = new Scanner(System.in);
		   System.out.println("Enter event number:");
		   String eNum = input.nextLine();
		   String initialv = "A000";
		   char c1 = eNum.charAt(0), c2 = eNum.charAt(1), c3 = eNum.charAt(2), c4 = eNum.charAt(3);
		   if(Character.isLetter(c1) && Character.isDigit(c2) && Character.isDigit(c3) && Character.isDigit(c4))
		   {
			   eNum = eNum.toUpperCase();
			   eventNumber = eventNumber.concat(eNum);
		   }
		   else
		   {
			   eventNumber = eventNumber.concat(initialv);
		   }
	   }
	   public void setGuests()
	   {
		   Scanner input = new Scanner(System.in);
		   System.out.println("Enter the number of guests");
		   guests = input.nextInt();
	   }
	   public int getEventType()
	   {
		   return this.eventType;
	   }
	   public String getPhoneNumber()
	   {
		   String val = "";
		   val += "(" + phoneNumber.substring(0, 3)+")";
		   val += phoneNumber.substring(3, 6);
		   val += "-";
		   val += phoneNumber.substring(6, phoneNumber.length());
		   phoneNumber = val;
			return phoneNumber;
	   }
	   public String getEventNumber()
	   {
		   String val2 = "Event number: " + this.eventNumber;
		   return val2;
	   }
	   public int getGuests()
	   {
		   return guests;
	   }
	   public boolean isLargeEvent()
	   {
		   if(guests >= LARGE_EVENT)
		   {
			   return true;
		   }
		   else
			   if(guests < LARGE_EVENT)
			   {
				   return false;
			   }
		   return isLargeEvent();
	   }
	   public int getGuests(boolean largeEvent)
	   {
		   return guests;
	   }
	   public String getEvents()
	   {
		   return EVENT_TYPES[this.eventType];
	   }
}   
