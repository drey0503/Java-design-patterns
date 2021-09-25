/**
 * @author Dreyson Clark
 * Flight class configures the flight number, where the flight is coming from, where the flight is going to, how long the flight is,
 * and how many transfers we have.
 */
public class Flight {
    private String flightNum;
    private String from;
    private String to;
    private int duration; // minutes
    private int transfers; // 0,1,2,3, e.t.c.
/**
 * constructor setup for Strings and ints from the class and in the method to be used.
 * @param flightNum
 * @param from
 * @param to
 * @param duration
 * @param transfers
 */
    public Flight(String flightNum, String from, String to, int duration, int transfers) {
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;

    }
}
