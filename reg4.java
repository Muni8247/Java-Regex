package Kond;
import java.util.regex.*;

public class reg4 {
    public static void main(String[] args) {
        // Define a regex pattern to match a literal dot
        String regex = "\\."; // This regex matches a literal dot

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Use the pattern to create a Matcher object
        String text = "Hello.world";
        Matcher matcher = pattern.matcher(text);

        // Find matches in the text
        while (matcher.find()) {
            System.out.println("Match found: " + matcher.group());
        }
    }
}