package CODE8;
import java.util.Scanner;
public class EventDemo {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int eventType;
		final int arrSize = 3;
		Event[] eventObjects = new Event[arrSize];
		for(int i = 0; i < eventObjects.length; ++i)
		{
			eventObjects[i] = new Event();
			System.out.println("Enter the event number >> ");
			eventType = in.nextInt();
			eventObjects[i].setEventType(eventType);
			eventObjects[i].setPhoneNumber();
			eventObjects[i].setGuests();
		}
		for(int i = 0; i < arrSize; ++i)
		{
			System.out.println("Event Name : " + eventObjects[i].getEvents());
			System.out.println("Phone number : " + eventObjects[i].getPhoneNumber());
			System.out.println("Number of guests : " + eventObjects[i].getGuests());
		}
	}
}