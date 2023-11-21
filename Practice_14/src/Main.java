import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //3
        System.out.println();
        String text = "Prices: 25.98 USD, 44 ERR, 0.004 EU, 10.5 RUB";
        Pattern pattern = Pattern.compile("\\b(\\d+(?:\\.\\d+)?)\\s+(USD|RUB|EU)\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String price = matcher.group(1);
            String currency = matcher.group(2);
            System.out.println("Price: " + price + " " + currency);
        }

        //4
        System.out.println();
        String text1 = "(1 + 8) - 9 / 4, 6 / 5 - 2 * 9, 115";
        Pattern pattern1 = Pattern.compile("(?<!\\+)\\d+");
        Matcher matcher1 = pattern1.matcher(text1);

        while (matcher1.find()) {
            System.out.println("Digit found: " + matcher1.group());
        }

        //5
        System.out.println();
        String date1 = "29/02/2000";
        String date2 = "30-04-2003";
        String regex = "^(0[1-9]|[12][0-9]|3[01])\\/(0[1-9]|1[012])\\/(19\\d\\d|20\\d\\d|9999)$";

        pattern = Pattern.compile(regex);


        System.out.println("Date1: " + pattern.matcher(date1).matches()); // true
        System.out.println("Date2: " + pattern.matcher(date2).matches()); // false

        //6
        System.out.println();
        String email1 = "user@example.com";
        String email2 = "myhost@@@com.ru";
        pattern = Pattern.compile("^(?!\\.)[\\w.-]+@[\\w.-]+\\.\\w{2,}$");

        System.out.println("Email1: " + pattern.matcher(email1).matches()); // true
        System.out.println("Email2: " + pattern.matcher(email2).matches()); // false

        //7
        System.out.println();
        String password1 = "F032_Password";
        String password2 = "smart_pass";
        pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[\\w]{8,}$");

        System.out.println("Password1: " + pattern.matcher(password1).matches()); // true
        System.out.println("Password2: " + pattern.matcher(password2).matches()); // false
    }
}