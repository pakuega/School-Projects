package assignments;
import java.util.Scanner;
public class AscendingAndDescending {

	public static void main(String[] args) {
		int d1, d2, d3, alpha, omega, median;
		Scanner digit =  new Scanner(System.in);
		System.out.print("Enter an integer... ");
		d1 = digit.nextInt();
		System.out.print("And another... ");
		d2 = digit.nextInt();
		System.out.print("And just one more... ");
		d3 = digit.nextInt();
		
		alpha = d1; 
		omega = d1;
		if(d2>omega)
			omega = d2;
		if(d3>omega)
			omega = d3;
		if(d2<alpha)
			alpha = d2;
		if(d3<alpha)
			alpha = d3;
		median = (d1+d2+d3)-(alpha+omega);
		
		System.out.println("Ascending: " + alpha + " "+  median + " " + omega);
		System.out.println("Descending: " + omega + " "+  median + " " + alpha);
		
		

	}

}
