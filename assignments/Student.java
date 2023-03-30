package assignments;

public class Student {
    // the private data members
    private int idNumber;
    private int hours;
    private int points;
    

    // Constructor added in part c
    Student() {
    	idNumber = 9999;
    	points = 12;
    	hours = 3;
    }
    // end of constructor added in part c

    // the public get and set methods

    public void setIdNumber(int x) {
    	idNumber = x;
    }

    public int getIdNumber() {
    	return idNumber;
    }

    public void setHours(int y) {
    	hours = y;
    }

    public int getHours() {
    	return hours;
    }

    public void setPoints(int z) {
    	points = z;
    }

    public int getPoints() {
    	return points;
    }

    // methods to display the fields

    public void showIdNumber() {
    	System.out.println("ID Number is: " + idNumber);
    }

    public void showHours() {
    	System.out.println("Credit Hours: " + hours);
    }

    public void showPoints() {
    	System.out.println("Points Earned: " + points);
    }

    public double getGradePoint() {
    	double GradePoint = (double) points/hours;
    	return GradePoint;
    }

}
