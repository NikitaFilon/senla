package taskOne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomMath {

    public int sumOfNumber(String line) {
        int result = 0;
        Matcher matcher = Pattern.compile("\\d").matcher(line);
        while (matcher.find()) {
            result += Integer.parseInt(matcher.group(0));
        }
        return result;
    }

}
