import com.skillbox.airport.*;

public class Main
{
	public static void main(String[] args) {

		Airport airport = Airport.getInstance();
		Terminal terminal = new Terminal("Терминал");
		System.out.println(airport.getAllAircrafts());
		System.out.println(terminal.getFlights());
		System.out.println(terminal.getParkedAircrafts());
	}
}
