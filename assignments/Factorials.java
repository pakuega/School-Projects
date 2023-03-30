package assignments;
import java.math.*;
public class Factorials {
	public static void main(String[] args) {
		final int LIMIT = 10;
		int a;
		int b;
		for(a = 1; a <= LIMIT; ++a)
		{
		BigInteger fact = BigInteger.ONE;
		for(b=1; b<=a;b++)
		{
		fact = fact.multiply(BigInteger.valueOf(b));
		}
		System.out.println(a + " factorial is " + fact);
		}
	}
}