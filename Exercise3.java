import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise3 {
    public static void main(String[] args) {

        String Startdate = "04/05/2000";
        String Enddate = "13/05/2022";
        emp em = new emp();
       // em.format();


    }
}
class  emp {
    void diffrence() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");
        String Startdate = "04/05/2000";
        String Enddate = "13/05/2022";

        Date d1;
        Date d2;
        try {
            d1 = sdf.parse(Startdate);
            d2 = sdf.parse(Enddate);

        }
        catch (ParseException e) {
            e.printStackTrace();
        }

    }
}

