package taskOne;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomMath {

    private int sumOfNumber(String line) {
        int result = 0;
        Matcher matcher = Pattern.compile("\\d+").matcher(line);
        while (matcher.find()) {
            result += Integer.parseInt(matcher.group(0));
        }
        return result;
    }

    public void enterAndPrintLineNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.print("A line: ");
        String stringNumbers = in.nextLine();
        System.out.println("The amount: " + sumOfNumber(stringNumbers));
    }


}
