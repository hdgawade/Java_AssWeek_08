import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class harshada {
    public static void main(String[] args) {
        String time12Hour = "07:45:30 PM"; // Replace with your input time in 12-hour format
        String militaryTime = convertToMilitaryTime(time12Hour);

        System.out.println("Military Time: " + militaryTime);
    }

    private static String convertToMilitaryTime(String time12Hour) {
        try {
            // Parse input time in 12-hour format
            SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ss a");
            Date date = inputFormat.parse(time12Hour);

            // Format the parsed date in 24-hour format
            SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
            return outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return "Invalid input";
        }
    }
}
