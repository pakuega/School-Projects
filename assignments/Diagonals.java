package assignments;

public class Diagonals {

	public static void main(String[] args) {
		int a;
		int b;
		final int LIM = 10;
		
		for(a=1 ; a<=LIM ; a++)
		{
			for(b=1; b<=a; b++)
			{
				if(a==b)
				{
					System.out.print("O");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}

	}

}
