package taskOne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomMath {
    public static int sumOfNumber(String string) {
        int result = 0;
        Matcher matcher = Pattern.compile("\\d+").matcher(string);
        while (matcher.find()) {
           result += Integer.parseInt(matcher.group(0));
        }
        return result;
    }
}
