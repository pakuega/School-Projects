package CODE7;
import java.util.*;
public class ThreeLetterAcronym {

	public static void main(String[] args) {
		String name;
		int i = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Organisation name:");
		name = in.nextLine();
	    String[] words = name.split("\\s+");
	       
	    for (String curr : words) {
	        if (i < 3) 
	        {
	            System.out.print((curr.charAt(0) + "").toUpperCase());
	            i++;
	        }
	       }
	       in.close();
	   }
	}