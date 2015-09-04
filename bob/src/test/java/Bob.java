public class Bob {

    public String hey(String s) {
        // yell (thx @ http://exercism.io/jcbwlkr)
        if (s.equals(s.toUpperCase()) && !s.equals(s.toLowerCase())) {
            return "Whoa, chill out!";
        }
        // question
         else if (s.endsWith("?")) {
            return "Sure.";
        }
        // address, say nothing
        else if (s.trim().length() == 0) {
            return "Fine. Be that way!";
        }
        // rest
        else {
            return "Whatever.";
        }
    }
}