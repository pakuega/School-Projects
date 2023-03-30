package CODE8;
import java.util.*;
public class CarCareChoice {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter selection: \noil change \ntire rotation \nbattery check \nbrake inspection");
        String service = scanner.nextLine();
        if(service.equalsIgnoreCase("oil change")){
            System.out.println(service+" price is $25");
        }
        else if(service.equalsIgnoreCase("tire rotation")){
            System.out.println(service+" price is $22");
        }
        else if(service.equalsIgnoreCase("battery check")){
            System.out.println(service+" price is $15");
        }
        else if(service.equalsIgnoreCase("brake inspection")){
            System.out.println(service+" price is $5");
        }
        else{
            System.out.println("Invalid Entry");
        }
            
    }
}