public class Hamming {

    public static int compute(String a, String b) {

        if (a.length() != b.length()) {
            throw new IllegalArgumentException();
        }

        int hamming = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.toCharArray()[i] != b.toCharArray()[i]) {
                hamming++;
            }
        }

        return hamming;
    }

}
