/**
 * @author Dreyson Clark
 * in this class I set up the flight iterator and Implements the java.util Iterator
 */
import java.util.Iterator;

public class Flightiterator implements Iterator {
    private Flight[] flights;
    private int position = 0;

/**
 * Constructor -> accepts an array of flights
 * @param flights
 */
    public Flightiterator(Flight[] flights) {
        this.flights = flights;
    }

/**
 * next(): Returns the next flight, if there is one, and null otherwise
 */
    public Flight next() {
        Flight flight = flights[position];
        position = position + 1;
        return flight;
    }

/**
 * hasNext(): returns true if there more flights to iterate over
 */
    public boolean hasNext() {
        if (position >= flights.length || flights[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}