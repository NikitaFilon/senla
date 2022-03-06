package taskThree;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LineHandler {

    public HashMap<String, Integer> getLinesWithVowelsNumbers(String line) {
        HashMap<String, Integer> map = new HashMap<>();
        Pattern pattern =
                Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS
                        | Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(line);
        while (matcher.find())
            map.put(matcher.group().toLowerCase(), numberOfVowelLetters(matcher.group()));

        return map;
    }

    public List<Map.Entry<String, Integer>> sortByVowelsNumbers(HashMap<String, Integer> map){
        var hashMapResult = map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).toList();
        return  hashMapResult;
    }

    private  int numberOfVowelLetters(String string) {
        Pattern vocals = Pattern.compile("(?iu)[аеёиоуыэюэ]");
        Matcher m = vocals.matcher(string);
        int vocalCounter = 0;
        while (m.find()) {
            vocalCounter++;
        }
        return vocalCounter;
    }


    public  String wordsByVowels(String line) {
        Pattern vocals = Pattern.compile("(?iu)[аеёиоуыэюэ]");
        Matcher matcher = vocals.matcher(line);
        if (matcher.find()) {
            return matcher.replaceFirst(matcher.group().toUpperCase());
        }
        return line;
    }

}
