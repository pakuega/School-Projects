
public class DivideEvenly {

	public static void main(String[] args) {
		final int LIMIT = 100;
		int var;
		System.out.print(LIMIT + " is evently divisible by ");
		
		for(var=1; var<=100; ++var)
			if(LIMIT % var == 0)
				System.out.print(var + " ");
		System.out.println();

	}

}
