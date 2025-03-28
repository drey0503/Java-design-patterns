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
  /**
   * my getter method's for the private int's and string's
   * @return
   */  
    public String getFrom(){
        return this.from;
    }
    public String getTo(){
        return this.to;
    }
    public int getDuration(){
        return this.duration;
    }
    public int getNumTransfers(){
        return this.transfers;
    }
    /**
     * in this toString I set up the format for each case of flight transfers. 
     */
    @Override
    public String toString(){
        if(transfers ==0){
        return "Flight Number: "+ flightNum +"\n"+"From: " + from+"\n"+ "To: "+ to 
        +"\n"+"Duration: "+ duration/60 + " hours " +duration%60+" minutes "+"\n" + "Direct Flight";
        }
        if(transfers ==1){
           return "Flight Number: "+ flightNum +"\n"+"From: " + from+"\n"+ "To: "+ to +"\n"+"Duration: "+
           duration/60 + " hours " +duration%60+" minutes "+"\n" + "1 Transfer";
        }
        else {
        return "Flight Number: "+ flightNum +"\n"+"From: " + from+"\n"+ "To: "+ to 
        +"\n"+"Duration: "+duration/60 + " hours " +duration%60+" minutes"+"\n" + transfers+ " transfers";
        }
    }
    }


