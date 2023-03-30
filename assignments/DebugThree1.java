package assignments;

public class DebugThree1 {
	
	public static void main(String args[])
	   {
		int myCredits = 13;
	      int yourCredits = 17;
	      double rate = 75.84;
	      System.out.println("My tuition:");
	      TuitionBill(myCredits, rate);
	      System.out.println("Your tuition:");
	      TuitionBill(yourCredits, rate);
	   }
	   public static void TuitionBill(int c, double r)
	   {
	      System.out.println("Total due " + (r * c));
	   }
	}