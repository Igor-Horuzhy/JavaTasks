import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Игорь
 * 7/28/2017.
 */
public class Regex05_LazyQuantification {
    /*
    Суть ленивой квантификация: по заданному шаблону найдутся максимально короткие
    совпадения в строке. ПРи это она будет очень ленивая, и она захватит стоящие
    перед совпадением символы.
     */
    public static void main(String[] args) {
        int count = 0;
      String s = "192.168.71.19";
      Pattern pattern = Pattern.compile(".*?19"); // 19 либо не повтоярется либо повторяется много раз
        Matcher matcher = pattern.matcher(s);
        while(matcher.find()){
            count++;
            System.out.println("Match found " + s.substring(matcher.start(), matcher.end())
            + "staring at index " + matcher.start() + " end at index " + matcher.end());
        }

    }
}
