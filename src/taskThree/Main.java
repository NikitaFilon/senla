package taskThree;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LineHandler lineHandler = new LineHandler();
        String line = getUserInput();
        HashMap<String, Integer> hashMap = lineHandler.getLinesWithVowelsNumbers(line);
        List<Map.Entry<String, Integer>> list = lineHandler.sortByVowelsNumbers(hashMap);
        System.out.println(list);
        System.out.println(lineHandler.wordsByVowels(line));
    }

    private static String getUserInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("A string: ");
        String line = in.nextLine();
        return line;
    }



}
