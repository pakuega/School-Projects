import java.util.Scanner;
public class Tri {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter char:");
        char aChar = sc.nextLine().charAt(0); //nextLine is used to properly read a single line
        System.out.println("The character is "+aChar);
        if(Character.isUpperCase(aChar)){
            System.out.println(aChar + " is UpperCase");
        }else {
            System.out.println(aChar + " is not UpperCase");
        }
        if(Character.isLowerCase(aChar))
            System.out.println(aChar + " is LowerCase");
        else
            System.out.println(aChar + " is not LowerCase");
        aChar = Character.toLowerCase(aChar);
        System.out.println("After toLowerCase(), aChar is " + aChar);
        aChar = Character.toUpperCase(aChar);
        System.out.println("After toUpperCase(), aChar is " + aChar);
        if(Character.isLetterOrDigit(aChar)) //checking for letter or digit additional testcase
     System.out.println(aChar + " is a letter or digit");
    else
     System.out.println(aChar +
    " is neither a letter nor a digit");
        if(Character.isWhitespace(aChar)) //checking for whitespace additional testcase
 System.out.println(aChar + " is whitespace");
 else
 System.out.println(aChar + " is not whitespace");
    }
 }