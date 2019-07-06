import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main
{
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(1995, Month.AUGUST, 5);
		LocalDate addOneYear;
		for (int i = 0; i <= 24 ; i++) {
			addOneYear = date.plusYears(i);
			System.out.println(addOneYear.format(DateTimeFormatter.ofPattern("dd.MM.uuuu - EEEE")));
		}
	}
}
