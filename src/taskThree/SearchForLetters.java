package taskThree;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchForLetters {
    private static int numberOfVowelLetters(String string) {
        Pattern vocals = Pattern.compile("(?iu)[аеёиоуыэюяіэ]");
        Matcher m = vocals.matcher(string);
        int vocalCounter = 0;
        while (m.find()) {
            vocalCounter++;
        }
        return vocalCounter;
    }

    public static void sortingWordsByVowels(String string) {
        HashMap<String, Integer> map = new HashMap<>();
        Pattern pattern =
                Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS
                        | Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find())
            map.put(matcher.group().toLowerCase(), numberOfVowelLetters(matcher.group()));


        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
