import java.util.Random;

public class Randomcode {
    private final String LETTERS = "qwertyuiopasdfghjklzxcvbnm";
    private final char[] ALPHANUMERIC = (LETTERS + LETTERS.toUpperCase() + "0123456789").toCharArray();

    public String generateRandomAlphanumberic(int length) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append(ALPHANUMERIC[new Random().nextInt(ALPHANUMERIC.length)]);
        }
        return result.toString();

    }
}
