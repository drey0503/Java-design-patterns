import java.util.Iterator;

public class FlightIterator implements Iterator {
    private Flight[] flights;
    private int position = 0;

    public FlightIterator(Flight[] flights) {
        this.flights = flights;
    }

    public Flight next() {
        Flight flight = flights[position];
        position = position + 1;
        return flight;
    }

    public boolean hasNext() {
        if (position >= flights.length || flights[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}