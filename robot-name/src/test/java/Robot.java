import java.util.Random;

public class Robot {

    static final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static Random rnd;
    String name;

    public Robot() {
        rnd = new Random();
    }

    public void reset() {

        String newName;
        do {
            newName = "";
            for (int i = 0; i < 2; i++) {
                newName += String.valueOf(characters.charAt(rnd.nextInt(characters.length())));
            }

            for (int i = 0; i < 3; i++) {
                newName += String.valueOf(rnd.nextInt(10));
            }
        } while (newName.equals(name));
        name = newName;
    }

    public String getName() {
        return name;
    }
}
