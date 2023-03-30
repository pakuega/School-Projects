package CODE7;
import java.util.*;
public class PhoneNumberFormat 
{

	public static void main(String[] args) 
	{
	       Scanner in = new Scanner(System.in);
	       String nPhone = "";
	       String format = "";
	       float callnum = 0;
	       do {
	          System.out.println("Enter an area code and phone number\r\n"
	          		+ "as a series of 10 digits\r\n"
	          		+ "Enter 999 to quit: ");
	          nPhone = in.next();
	           
	          try {
	              callnum = Float.parseFloat(nPhone);
	              if(nPhone.length() == 10) 
	              {
	                   format = "("+nPhone.substring(0, 3)+") "+nPhone.substring(3,6)+"-"+nPhone.substring(6);
	                   System.out.println("Formatted phone number: "+format);
	              } 
	              else 
	            	  if(callnum != 999) 
	            	  {
	                   System.out.println("Phone number must be 10 digits");
	                  }
	           } 
	          catch (NumberFormatException e) {
	               System.out.println("Invalid input");
	           }
	       } 
	       while(callnum != 999);
	   }
	}