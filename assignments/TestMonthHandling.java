package assignments;
import java.time.*;
public class TestMonthHandling {
    public static void main(String[] args) {
        LocalDate a = LocalDate.of(LocalDate.now().getYear(), 1, 31);
        LocalDate b = LocalDate.of(LocalDate.now().getYear(), 12, 31);
        
        LocalDate a1 = a.plusMonths(1);
        LocalDate b1 = b.plusMonths(1);
        LocalDate a2 = a.plusMonths(2);
        LocalDate b2 = b.plusMonths(2);
        LocalDate a3 = a.plusMonths(3);
        LocalDate b3 = b.plusMonths(3);
        
        System.out.println("First date " + a);
        System.out.println("Second date " + a1);
        System.out.println("Third date " + a2);
        System.out.println("Fourth date " + a3);
        System.out.println("First date " + b);
        System.out.println("Second date " + b1);
        System.out.println("Third date " + b2);
        System.out.println("Fourth date " + b3);
    }
}

