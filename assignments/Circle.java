package assignments;

public class Circle {
	private double radius;
    private double area;
    private double diameter;
    Circle() {
    	radius=1;
    	diameter = computeDiameter();
    	area= computeArea();
    	
  	
    }
    public void setRadius(double r) {
    	radius =r;
    	diameter= 2*radius;
    	area= Math.PI*Math.pow(radius, 2);
   
    }
    public double getRadius() {
		return radius;
    }
    private double computeDiameter() {
    	double diameter = radius*2;
		return diameter;
    }
    private double computeArea() {
    	double area = Math.PI*Math.pow(radius, 2);
		return area;
    }
    public double getDiameter() {
		return diameter;
    }
    public double getArea() {
		return area;
    }

}