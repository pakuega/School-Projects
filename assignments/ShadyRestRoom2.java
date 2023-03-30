package assignments;
import java.util.Scanner;
public class ShadyRestRoom2 {

	public static void main(String[] args) {
	      int selection;
	      int price;
	      int view;
	      String result;
	      final int QUEEN = 1, KING = 2, SUITE = 3;
	      final int LAKE = 1, PARK = 2;
	      final int QPRICE = 125, KPRICE = 139,
	         SPRICE = 165, LPRICE = 15;
	      final String LSTRING = " with a lake view", PSTRING = " with a park view";
	      final String QSTRING = "Queen bed", KSTRING = "King bed",
	         SSTRING = "Suite with a king bed and pull-out couch",
	         INVALIDSTRING = "an invalid option";
	      Scanner in = new Scanner(System.in);
	      System.out.println("\t\n\nMenu\n");
	      System.out.println("(" + QUEEN + ") " + QSTRING);
	      System.out.println("(" + KING + ") " + KSTRING);
	      System.out.println("(" + SUITE + ") " + SSTRING);
	      System.out.print("Enter Selection (1, 2, or 3) >> ");
	      selection = in.nextInt();
	      
	      System.out.println("Please chose a view:");
	      System.out.println("(" + LAKE + ") " + "a lake");
	      System.out.println("(" + PARK + ") " + "a park");
	      System.out.print("Enter Selection (1 or 2) >> ");
	      view = in.nextInt();
	      if(selection == QUEEN)
	    	  if(view != PARK)
	    	  {
	         result = QSTRING + LSTRING;
	         price = QPRICE + LPRICE;
	    	  }
	    	  else
	    	  {
	    		  result = QSTRING + PSTRING;
	      		  price = QPRICE;
	    	  }
	      else
	         if(selection == KING)
	        	 if(view != PARK)
	        	 {
	        		 result = KSTRING + LSTRING;
	        		 price = KPRICE + LPRICE;
	        	 }
	        	 else
	        	 {
	        		 result = KSTRING + PSTRING;
	        		 price = KPRICE;
	        	 }
	         else
	            if (selection == SUITE)
	            	if(view != PARK)
	            	{
	            		result = SSTRING + LSTRING;
	            		price = SPRICE + LPRICE;
	            	}
	            	else
	            	{
	            		result = SSTRING + PSTRING;
	            		price = SPRICE;
	            	}
	            else	
	            {
	                result = INVALIDSTRING;
	                price = 0;
	             }
	      if((view != PARK) && (view != LAKE))
	      {
	    	  result = INVALIDSTRING;
	      }
	    	  
	      System.out.println("You selected " + result + "  $" + price);		

	}

}
