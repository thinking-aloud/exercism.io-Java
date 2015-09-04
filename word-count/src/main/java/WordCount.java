import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public Map<String, Integer> Phrase(String input) {
        Map<String, Integer> result = new HashMap<>();

        for (String word : input.split(" ")) {
            word = word.toLowerCase();
            word = word.replaceAll("[,!^:@%&$]", "");

            int count = 0;
            if (result.containsKey(word)) {
                count = result.get(word);
            }

            if(word.length() > 0) {
                result.put(word, count + 1);
            }
        }
        return result;
    }
}
