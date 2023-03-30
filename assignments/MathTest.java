package assignments;

public class MathTest {

	public static void main(String[] args) {
		double a = Math.sqrt(37);
		double b = Math.sin(300);
		double c = Math.cos(300);
		double d = Math.floor(22.8);
		double e = Math.ceil(22.8);
		double f = Math.round(22.8);
		int n = 'D';
		int g = Math.max('D', 71);
		int h = Math.min('D', 71);
		int i = (int) (20*Math.random());
		
		System.out.println("The Square root of 37 is " + a);
		System.out.println("Sine 300 is " + b + " and cosine 300 is " + c);
		System.out.println("The floor of 22.8 is " + d + ", the ceiling of 22.8 is " + e + ", and the round of 22.8 is " + f);
		System.out.println("The larger of character 'D' and the integer 71 is " + g + " and the smaller is " + h);
		System.out.println("A random number between 0 and 20 is " + i);
		
	}

}
