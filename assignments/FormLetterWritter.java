package assignments;

public class FormLetterWritter 
{
	final static double TAX = 0.08;
    public static void main(String[] args) {
        final double HIGHPRICE = 24.99;
        final double MEDPRICE = 17.50;
        final double LOPRICE = 10.00;
        final int QUAN1 = 4;
        final int QUAN2 = 6;
        double bill;
        bill = computeBill(HIGHPRICE);
        System.out.println("The total for a photobook that costs $" +
                           HIGHPRICE + " is $" + bill);
        bill = computeBill(MEDPRICE, QUAN1);
        System.out.println("The total for " + QUAN1 +
                           " photobooks that cost $" +
                           MEDPRICE + " is $" + bill);
        bill = computeBill(LOPRICE, QUAN2, 20.00);
        System.out.println("The total for " + QUAN2 +
                           " photobooks that cost $" +
                           LOPRICE + " with a $20 coupon is $" + bill);
    }

    public static double computeBill(double amt) {
        double x = amt + (amt*TAX);
        return x;
    }

    public static double computeBill(double amt, int quantity) {
        double y = (amt*quantity) + (amt*quantity*TAX);
        return y;
    }
    public static double computeBill(double amt, int quantity, double coupon) {
        double z = ((amt*quantity)-coupon) + (((amt*quantity)-coupon)*TAX);
        return z;
    }
}
