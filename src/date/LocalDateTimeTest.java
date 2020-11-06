package date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocalDateTimeTest {

    public static void main(String[] args) {
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("d MMM YYYY", Locale.FRENCH);
        CharSequence text = "9 Dec 1961";
        LocalDateTime parse = LocalDateTime.parse(text, formater);
        System.out.println(parse);
    }
}
