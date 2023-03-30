package assignments;
import java.util.Scanner;
public class TestLease {

	public static void main(String[] args) {

		Lease object = getData();
		showValues(object);
	    
	    
	    
	    
	     
	     
	   }
	   public static void showValues(Lease ls)
	   {
	      System.out.println("\n\nYour lease results:" +
	         "\nName      : " + ls.getName() +
	         "\nApartment : " + ls.getAptNumber() +
	         "\nRent      : " + ls.getRent() +
	         "\nTerm      : " + ls.getTerm() +
	         "\n");
	   }
	   public static Lease getData()
	   {
		   Lease ls = new Lease();
		   Scanner input = new Scanner(System.in);
		   System.out.print("Enter lesee name >> ");
		   String name = input.nextLine();
		   System.out.print("Enter apartment number >> ");
		   int aptNumber = input.nextInt();
		   System.out.print("Enter rent >> ");
		   int rent = input.nextInt();
		   System.out.print("Enter lease term in month >> ");
		   int term = input.nextInt();
		   
		   ls.setName(name);
		   ls.setAptNumber(aptNumber);
		   ls.setRent(rent);
		   ls.setTerm(term);
		   
		   return ls;
		   
		     
	   }
	}