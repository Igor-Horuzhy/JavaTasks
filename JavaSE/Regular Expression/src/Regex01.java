import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Игорь
 * 7/28/2017.
 */
public class Regex01 {
    public static void main(String[] args) {
        /*
            [a-z] - поиск символов от a до z включительно
              +   - искать можно более чем 1-2 символа
         */
        Pattern pattern = Pattern.compile("[a-z]+");

        Matcher matcher = pattern.matcher("a b c d f g h l 1 2 а 56");
        System.out.println(matcher.find());

        Matcher matcher2 = pattern.matcher("A B C D 92 23 85 34 ");
        System.out.println(matcher2.find());

        Pattern pattern2 = Pattern.compile("[a-zA-Z0-9]");
        Matcher matcher3 = pattern2.matcher("Aq2Z 90");
        System.out.println(matcher3.find());


    }
}
