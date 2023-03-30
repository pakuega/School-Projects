package assignments;

public class MileConversions {

	public static void main(String[] args) {
		
		final int INCHES_IN_MILE = 63360;
		final int FEET_IN_MILE = 5280;
		final int YARDS_IN_MILE = 1760;
		double miles=4;
		
		double inches = miles * INCHES_IN_MILE;
		double feet = miles * FEET_IN_MILE;
		double yards = miles * YARDS_IN_MILE;
		
		System.out.println(miles + " miles is " + inches + " inches, or " + feet + " feet, or " + yards + " yards");
	}
}
