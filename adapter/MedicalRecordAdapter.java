import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Dreyson Clark
 * This class uses the information from the health record, to return the data in the same format as the Medical Record.
 */
public class MedicalRecordAdapter implements MedicalRecord {
    private HealthRecord record;

    public MedicalRecordAdapter(HealthRecord record) {

        this.record = record;
    }
/**
 * gets the first name in the element 0 seperated by a space.
 */
    public String getFirstName() {
        String[] splitStr = record.getName().split(" ");
        return splitStr[0];
    };

    /**
     * gets the last name in the element 1 seperated by a space.
     */
    public String getLastName() {
        String[] splitStr = record.getName().split(" ");
        return splitStr[1];
    };
/**
 * returns the birthday from the medical record
 */
    public Date getBirthday() {
        return record.getBirthdate();
    };
/**
 * returns the gender from the medical record in uppercase format.
 */
    public Gender getGender() {
        String gend = record.getGender();
        Gender gender = Gender.valueOf(gend.toUpperCase());
        return gender;
    };
/**
 * makeDate function returns the date in the format (year,month,day)
 * @param year
 * @param month
 * @param day
 * @return
 */
    private Date makeDate(int year, int month, int day) {
        Calendar myCalendar = new GregorianCalendar(year, month - 1, day);
        return myCalendar.getTime();
    }
/**
 * adds the history of visits from patient from the medical record with a date, wellness status and comments of condition
 */
    public void addVisit(Date date, boolean well, String description) {
        record.addHistory(date, well, description);
    };
/**
 * gets the patients medical history that was already stored in the previous system by parsing through the medical records.
 */
    public ArrayList<Visit> getVisitHistory() {
        ArrayList<Visit> visits = new ArrayList<Visit>();
        for (int i = 0; i < record.getHistory().size(); i++) {
            String hist = record.getHistory().get(i);
            String[] split = hist.split("\n");
            String[] dateFormat = split[0].split(": ");
            String[] newline = dateFormat[1].split("\\n");
            String[] dates = newline[0].split(", ");
            Date date = makeDate(Integer.parseInt(dates[2]), Integer.parseInt(dates[1]),Integer.parseInt(dates[0].substring(4, 6)));
            String[] comments = split[1].split(": ");
            String[] newlines = comments[1].split("\\n");
            Boolean status = Boolean.parseBoolean(newlines[0]);
            String[] data = split[2].split(": ");
            String[] info = data[1].split("\\n");
            visits.add(new Visit(date, status, info[0]));
        }
        return visits;
    }
    /**
     * toString that returns the first and last name, birthdate, gender, and medical visit history.
     */
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String result = "***** " + getFirstName() + " " + getLastName() + "*****" + "\n" + "Birthday:"
                + simpleDateFormat.format(getBirthday()) + "\n" + "Gender: " + getGender() + "\n"
                + "Medical Visit History: " + "\n";
        if (getVisitHistory().size() == 0)
            result += "No visits yet";
        else {
            for (Visit visit : getVisitHistory()) {
                result += visit.toString() + "\n";
            }
        }
        return result;
    }
}
