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
        this.flightNum=flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;

    }
    public String getFrom(){
        return this.from;
    }
    public String getTo(){
        return this.to;
    }
    public int getDuration(){
        return this.duration;
    }
    public int getNumTransders(){
        return this.transfers;
    }
    @Override
    public String toString(){
        
        return "Flight number: "+ flightNum +"/n"+"From: " + from+"/n"+ "To: "+ to 
        +"/n"+"Duration: "+ duration+ "/n" + transfers + "Transfers";
    
    }

}
