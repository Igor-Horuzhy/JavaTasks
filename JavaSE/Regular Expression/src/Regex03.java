import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Игорь
 * 7/28/2017.
 */
public class Regex03 {
    public static void main(String[] args) {
        /*
        Группа символов.
        Поиск цифр в строке
         */
        Pattern pattern = Pattern.compile("(\\d+)");
        Matcher matcher = pattern.matcher("2016 year. 2017 year. 2018year");

        while(matcher.find()){
            System.out.println(matcher.group(1));
        }

        System.out.println();
        System.out.println();
        System.out.println();

         /*
        Будем искать повторяющиеся символы и выводить их единожды. Для этого
        добавим обратную ссылку \\l и точку со звёздочкой.
        .* - Любые цифры, которые повторяются много раз
         */
        Pattern pattern1 = Pattern.compile("(\\d+).*\\1");
        Matcher matcher1 = pattern1.matcher("2016 year. 2017 year. 2018year");

        while(matcher1.find()){
            System.out.println(matcher1.group(1));
        }

        System.out.println();
        System.out.println();
        System.out.println();

         /*
         Если группа используется лишь для группировки и результат не используется,
         то перед шаблоном добавляется знак вопроса и двоеточие. Совпадение в этом
         случае не запоминается
        */

        Pattern pattern2 = Pattern.compile("(?:Mouse|Keyboard)Listener");
        Matcher matcher2 = pattern2.matcher("MouseListener PrintListener KeyboardListener Listener");

        while(matcher2.find()){
            System.out.println(matcher2.group());
        }

        System.out.println();
        System.out.println();
        System.out.println();

         /*
         Если перед шаблоном добавить ?=, в строке будет производится поиск наперед
         Будет выведено только Java 7 или Java 8
         ?! - наоборот, несовпадение
        */

        Pattern pattern3 = Pattern.compile("Java (?=7|8)");
        Matcher matcher3 = pattern3.matcher("Java 7 Java 8 Java 9 Java8");

        while(matcher3.find()){
            System.out.println(matcher3.group());
        }
    }
}
