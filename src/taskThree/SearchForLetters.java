package taskThree;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchForLetters {

    public  void enterLineForUser() {
        Scanner in = new Scanner(System.in);
        System.out.print("A string: ");
        String line = in.nextLine();
        sortingWordsByVowels(line);
        wordsByVowels(line);
    }

    private  void sortingWordsByVowels(String line) {
        HashMap<String, Integer> map = new HashMap<>();
        Pattern pattern =
                Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS
                        | Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(line);
        while (matcher.find())
            map.put(matcher.group().toLowerCase(), numberOfVowelLetters(matcher.group()));


        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }

    private  int numberOfVowelLetters(String string) {
        Pattern vocals = Pattern.compile("(?iu)[аеёиоуыэюэeyuioa]");
        Matcher m = vocals.matcher(string);
        int vocalCounter = 0;
        while (m.find()) {
            vocalCounter++;
        }
        return vocalCounter;
    }


    private  void wordsByVowels(String line) {
        Pattern vocals = Pattern.compile("(?iu)[аеёиоуыэюэeyuioa]");
        Matcher matcher = vocals.matcher(line);
        if (matcher.find()) {
            System.out.println(matcher.replaceFirst(matcher.group().toUpperCase()));
        }
    }

}
