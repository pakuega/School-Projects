package assignments;
//Paul Williams Akuegankeu Tekeu
public class Event {
	public final static double GUEST_PRICE = 35.00;
	   public final static int LARGE_EVENT = 50;
	   private String eventNumber;
	   private int guests;
	   private double price;
	   
	   public Event(String num, int gsts) {
		   setEventNumber(num);
		   setGuests(gsts);
	   }
	   public Event()
	   {
		   new Event("A000",0); //initialize the values
	   }
	   
	   public void setEventNumber(String num)
	   {
	      eventNumber = num;  // set event number inputed in the event demo class
	   }
	   public void setGuests(int gsts)
	   {
	      guests = gsts; // sets number of guests inputed in the event demo class
	      price = guests * GUEST_PRICE; // calculates the price based on guests number and sets it
	   }
	   public String getEventNumber()
	   {
	      return eventNumber; //returns the number of the event 
	   }
	   public int getGuests()
	   {
	      return guests; //returns the number of guests 
	   }
	   public double getPrice()
	   {
	      return price; // returns the calculated price 
	   }
}
