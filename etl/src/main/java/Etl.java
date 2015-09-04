import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etl {
    public Map<String, Integer> transform (Map<Integer, List<String>> old) {
        Map<String, Integer> result = new HashMap<>();

        for (Integer key : old.keySet()) {
            for (String s : old.get(key)) {
                result.put(s.toLowerCase(), key);
            }
        }

        return result;
    }
}
