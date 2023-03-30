package assignments;
import java.time.*;
public class TenThousandDaysOld {

	public static void main(String[] args) {
		final LocalDate birth = LocalDate.of(2000, 1, 1);
		LocalDate b1 = birth.plusDays(10000);
		
		System.out.println("I will be 10000 days old on " + b1);

	}

}
