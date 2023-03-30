/**
 *  
 * SP2022_Adult_AKUEGANKEU_TEKEU Class
 *
 */
package SP2022_LAB3PART1_AKUEGANKEU_TEKEU;

public class SP2022_Adult_AKUEGANKEU_TEKEU 
{
	private String name; // user name
	private int height; // user height
	private float expectedBMI;  // user's expected Body Mass Index
	public String sBMI = "18.5 - 24.9";  //this is a string argument for standard BMI since it does not vary
	/**
	 * Instantiate a new Adult class to receive  user input from 
	 * SP2022_AdultWeightManagement_AKUEGANKEU_TEKEU class
	 */
	public SP2022_Adult_AKUEGANKEU_TEKEU(String name, int height, float expectedBMI)
	{
		this.name = name;
		this.height = height;
		this.expectedBMI = expectedBMI;
		
		/**
		 * this will print out the static heading of the output message
		 */
		System.out.println("---------------------------------------------------------");
		System.out.println("File: SP2022_AdultWeightManagement_Akuegankeu_Tekeu.java");
		System.out.println("Adult Weight Management – PAUL WILLIAMS AKUEGANKEU TEKEU");
		System.out.printf("Standard BMI: %33s\n", sBMI); 
		System.out.println("---------------------------------------------------------");
	}
	public String getName() //get the name
	{
		return name;
	}
	public void setName(String name)//sets the name
	{
		this.name = name;
	}
	public int getHeight()  // gets the height
	{
		return height;
	}
	public void setHeight(int height)  //sets the height
	{
		this.height = height;
	}
	public float getExpectedBMI()  //gets the user's expected BMI
	{
		return expectedBMI;
	}
	public void setExpectedBMI(float expectedBMI) //sets the expected BMI
	{
		this.expectedBMI = expectedBMI;
	}
	public double calculateWeight()  //calculates and returns the weight
	{
		double weight = (expectedBMI * height * height) / 703;
		return weight;
	}
	/**
	 * displays the non-static portion of the output message in 
	 * correct format. see pseudo-code for output
	 */
	public String toString() 
	{
		StringBuilder output = new StringBuilder(String.format("Name: %41s\n", name));
		output.append(String.format("Height (inches): %30d\n", height));
		output.append(String.format("BMI: %42.1f\n", expectedBMI));
		output.append("---------------------------------------------------------\n");
		output.append(String.format("Weight (pounds): %30.1f\n", calculateWeight()));
		return output.toString();
	}
}
