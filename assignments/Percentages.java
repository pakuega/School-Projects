package assignments;

public class Percentages {
	
	public static void main (String args[]) {
        
		double num1 = 2.0;
		double num2 = 5.0;
		
		computePercent(num1, num2);
		
				
    }
    public static void computePercent(double x, double y) {
        
    	System.out.println(x + " is " + ((x/y)*100) + " percent of " +y);
    	System.out.println(y + " is " + ((y/x)*100) + " percent of " +x);
    	
    }


}
