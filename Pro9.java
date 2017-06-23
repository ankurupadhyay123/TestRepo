import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Pro9 {

    public static void main(String[] args) throws Exception {
        Date d1 = new Date();
        System.out.println("today is "+ d1.toString());
        Locale locItalian = new Locale("it","ch");
        DateFormat df = DateFormat.getDateInstance (DateFormat.FULL, locItalian);
        System.out.println("today is in Italy : "+ df.format(d1));

        Locale locCanada = new Locale("de","DE");
        DateFormat df2 = DateFormat.getDateInstance (DateFormat.FULL, locCanada);
        System.out.println("today is in Germany : "+ df2.format(d1));

    }
}
