package assignments;

public class TrianglesWithLoops {

	public static void main(String[] args) 
{
	int a;
	int b;
	int c;
	final int LIM = 7;
	
	
	for(a=0 ; a<LIM ; a++) {
		for(c = 0; c<LIM-a;c++) {
			System.out.print(" ");
		}
		for(b=0;b<=2*a;b++) {
			System.out.print("T");
		}
		System.out.println();
}
	
}

}
