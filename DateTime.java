import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTime {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(date);
        System.out.println("Current date is: " + strDate);

        formatter = new SimpleDateFormat("MM-dd-yyyy");
        strDate = formatter.format(date);
        System.out.println("Current date is: " + strDate);

        formatter = new SimpleDateFormat("EEEEEE MMMM dd yyyy");
        strDate = formatter.format(date);
        System.out.println("Current date is: " + strDate);

        formatter = new SimpleDateFormat("E MMMM dd HH:mm:ss z yyyy");
        strDate = formatter.format(date);
        System.out.println("Current date and time is: " + strDate);

        formatter = new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");
        strDate = formatter.format(date);
        System.out.println("Current date and time is: " + strDate);
    }
}
