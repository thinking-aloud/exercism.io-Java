import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

    private String anagram;

    public Anagram(String anagram) {
        this.anagram = toLowercaseAndSort(anagram);
    }

    public List<String> match(List<String> list) {
        ArrayList<String> result = new ArrayList<>();

        for (String word : list) {
            if (toLowercaseAndSort(word).equalsIgnoreCase(anagram)) {
                result.add(word);
            }
        }
        return result;
    }

    private static String toLowercaseAndSort (String word) {
        char[] charArr = word.toLowerCase().toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }
}
