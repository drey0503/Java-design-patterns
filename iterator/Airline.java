import java.util.Iterator;

/**
 * @author Dreyson Clark the Airline class has the title of the airline, the
 *         array of flights taken, and the number of flights we have in the
 *         array (size)
 */
public class Airline {
	private String title;
	int size;
	private Flight[] flights;

	
	/**
	 * Holds the title of the airline, an array of flights (Initially this array is
	 * size 2), and a size variable (indicating how many items are in the array)
	 * 
	 * @param title
	 */
	public Airline(String title) {
		this.title = title;
		flights = new Flight[2];
		size = 0;
	}

	/**
	 * Creates a flight and adds it to the array. If the array is full, it creates a
	 * new array twice the size, and copies the items into it.
	 * 
	 * @param flightNum
	 * @param from
	 * @param to
	 * @param duration
	 * @param transfers
	 */
	public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
		Flight flightz = new Flight(flightNum, from, to, duration, transfers);
		if (size >= flights.length) {
			flights = growArray(flights);
			flights[size] = flightz;
			size++;
		} else {
			flights[size] = flightz;
			size++;
		}
		
	}

	public Iterator createIterator() {
		return new FlightIterator(flights);
	}

	/**
	 * creating an array twice the size of the array thats passing through it.
	 * 
	 * @param flights
	 */
	private Flight[] growArray(Flight[] flights) {
		Flight[] flightss = new Flight[flights.length * 2];
		for (int i = 0; i < flights.length; i++) {
			flightss[i] = flights[i];
		}
		return flightss;
	}

}