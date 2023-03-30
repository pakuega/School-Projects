/**
 * SP2022_Employee_AKUEGANKEU_TEKEU class
 */
package SP2022_LAB3PART2_AKUEGANKEU_TEKEU;

public class SP2022_Employee_AKUEGANKEU_TEKEU 
{
	private String name;  // Employee name
	private String eID;  // Employee ID number
	private float hRate;   // hourly rate
	private int hrs;   // hours worked
	/**
	 * the next three declarations are done as strings
	 * because they are not used in calculations but
	 * will be used to get the output in the proper format
	 */
	public String fed = "(8.74%)";  //fed tax rate as string
	public String ss = "(6.20%)";  // social security tax rate as string
	public String med = "(1.45%)";   // medicare tax rate as string
	public final double fedTax_RATE = 0.0874;  // Federal tax rate
	public final double ssTax_RATE = 0.0620;  // social security tax rate
	public final double medTax_RATE = 0.0145;  // medicare tax rate
	
	/**
	 *Instantiates a new SP2022_Employee_AKUEGANKEU_TEKEU
	 *to receive the user inputs
	 */
	public SP2022_Employee_AKUEGANKEU_TEKEU(String eID, String name, float hRate, int hrs)
	{
		this.seteID(eID);
		this.setName(name);
		this.sethRate(hRate);
		this.setHrs(hrs);
		
		/**
		 * this will print out the static portion of the output message
		 * the heading of some sort
		 */
		System.out.println("---------------------------------------------------------------");
		System.out.println("File: SP2022_BiweeklyPay_ AKUEGANKEU_TEKEU.java");
		System.out.println("BIWEEKLY PAYMENT OF EMPLOYEE - PAUL WILLIAMS AKUEGANKEU TEKEU");
		System.out.println("---------------------------------------------------------------");
	}

	public String geteID() // get employee ID
	{
		return eID;
	}

	public void seteID(String eID2) //set employee ID
	{
		this.eID = eID2;
	}

	public String getName()   // get the employee name
	{
		return name;
	}

	public void setName(String name)   // set the employee name
	{
		this.name = name;
	}

	public float gethRate()   //get the employee hourly pay
	{
		return hRate;
	}

	public void sethRate(float hRate)   // set the employee hourly pay
	{
		this.hRate = hRate;
	}

	public int getHrs()  // get the number of worked hours
	{
		return hrs;
	}

	public void setHrs(int hrs) //set the number of worked hours
	{
		this.hrs = hrs;
	}
	public double grossPay()  //calculate the gross pay
	{
		double grosspay = hRate * hrs;
		return grosspay;
	}
	public double fedTax()  //calculate the federal tax deduction amount
	{
		double fedtax = fedTax_RATE * grossPay();
		return fedtax;
	}
	public double ssTax()  // calculate the social security tax deduction amount
	{
		double sstax = ssTax_RATE * grossPay();
		return sstax;
	}
	public double medTax()  // calculate the medicare tax deduction amount
	{
		double medtax = medTax_RATE * grossPay();
		return medtax;
	}
	public double netPay()  //calculate the employee net pay
	{
		double deductions = fedTax() + ssTax() + medTax();
		double netpay = grossPay() - deductions;
		return netpay;
	}
	/**
	 * Displays the output in the appropriate format
	 * data is arranged with the proper alignment
	 */
	public String toString() 
	{
		StringBuilder output = new StringBuilder(String.format("Employee ID: %49s\n", eID));
		output.append(String.format("Employee Name: %47s\n", name));
		output.append(String.format("Hourly Salary: %47.1f\n", hRate));
		output.append(String.format("Number of work hours: %40d\n", hrs));
		output.append("---------------------------------------------------------------\n");
		output.append(String.format("Gross Pay: %51.1f\n", grossPay()));
		output.append(String.format("Federal Income Tax %s %35.1f\n",fed, fedTax()));
		output.append(String.format("Social Security Tax %s %34.1f\n",ss, ssTax()));
		output.append(String.format("Medicare Tax %s %41.1f\n",med, medTax()));
		output.append("---------------------------------------------------------------\n");
		output.append(String.format("Net Pay: %53.1f\n", netPay()));
		return output.toString();
	}
}
