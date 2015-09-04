import java.util.HashMap;
import java.util.Map;

public class DNA {
    String dna;

    public DNA(String dna) {
        this.dna = dna;
    }

    public int count(char input) {

        if(input != 'A' && input != 'C' && input != 'G' && input != 'T') {
            throw new java.lang.IllegalArgumentException();
        }

        int counter = 0;
        for (char c : dna.toCharArray()) {
            if (c == input) {
                counter++;
            }
        }

        return counter;
    }

    public Map<Character, Integer> nucleotideCounts() {
        Map<Character, Integer> result = new HashMap<>();

        result.put('A', count('A'));
        result.put('C', count('C'));
        result.put('G', count('G'));
        result.put('T', count('T'));

        return result;
    }
}
