package assignments;
//Paul Williams Akuegankeu Tekeu

import java.util.Scanner;
public class EventDemo {
	public static void main(String[] args)
	   {
	      String eventNum;		//event number
	      int guests;			// number of guests
	      Event e = new Event(); //calls the Event class creased and assigns it the value of "e"
	      eventNum = e.getEventNumber();// will use the initialized values
	      guests = e.getGuests();// will use initialized values
	      e.setEventNumber(eventNum); // passes the inputed value to the event class
	      e.setGuests(guests);  // passes the inputed value to the event class
	      CarlysEventPriceWithMethods.displayMotto(); // displays Carly's event Motto
	      displayDetails(e); // displays initialized values
	      
	      eventNum = getEventNumber(); // gets input value and passes it to event class
	      guests = getGuests(); // gets input value and passes it to event class
	      Event e2 = new Event(eventNum,guests);
	      displayDetails(e2);// displays information related to entered values
	   }
	   public static String getEventNumber() //method that gets event number and returns it as eventNum
	   {
	      String num;
	      Scanner input = new Scanner(System.in);
	      System.out.print("Enter event number >> ");
	      num = input.nextLine();
	      return num;
	   }  
	   public static int getGuests()//method that gets guest number and returns it as guests
	   {
	      int guests;
	      Scanner input = new Scanner(System.in);
	      System.out.print("Enter number of guests >> ");
	      guests = input.nextInt();
	      input.nextLine();
	      return guests;
	   }
	   public static void displayDetails(Event e)//Method used to display results based on inputed information
	   {
	      System.out.println("\nEvent #" + e.getEventNumber());
	      System.out.println("The price for an event with " + e.getGuests() +
	         " guests at $" + e.GUEST_PRICE + " per guest is $" + e.getPrice());
	      System.out.println("Whether this is a large event is " +
	         (e.getGuests() >= e.LARGE_EVENT));
	   }
}
