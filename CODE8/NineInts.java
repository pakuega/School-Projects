package CODE8;
public class NineInts
{
	public static void main(String[] args)
	{
		final int totalNum = 9;
		int[] arrayNum = {10, 15, 19, 23, 26, 29, 31, 34, 38};
		System.out.println("From first to last: ");
		for(int i = 0; i < totalNum; i++)
			System.out.print(arrayNum[i] + " ");
		System.out.println("\nFrom last to first: ");
		for(int i = totalNum-1; i >= 0; i--)
			System.out.print(arrayNum[i] + " ");
	}
}