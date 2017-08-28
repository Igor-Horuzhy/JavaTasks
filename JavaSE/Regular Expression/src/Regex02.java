import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Игорь
 * 7/28/2017.
 */
public class Regex02 {
    public static void main(String[] args) {
        /*
        ^ - циркумфлекс или крышка, поиск заданных символов в начале строки
         */
        Pattern pattern = Pattern.compile("^[a-e]");

        Matcher matcher1 = pattern.matcher("a b n f y u p ]");
        System.out.println(matcher1.find());

        Matcher matcher2 = pattern.matcher("f e 5 g a q o");
        System.out.println(matcher2.find());

        System.out.println();


         /*
        $ - поиск в конце строки
         */
        Pattern pattern1 = Pattern.compile("[a-e]$");

        Matcher matcher3 = pattern1.matcher("a b n f y u p");
        System.out.println(matcher3.find());

        Matcher matcher4 = pattern1.matcher("f e 5 g a q o");
        System.out.println(matcher4.find());

        System.out.println();

         /*
        . - любое совпадение с данным символом. Если строка содержит хоть одно число,
        то результат будет true
         */
        Pattern pattern2 = Pattern.compile(".[0-9]");

        Matcher matcher5 = pattern2.matcher("a b n f y u p");
        System.out.println(matcher5.find());

        Matcher matcher6 = pattern2.matcher("f e 5 g a q o");
        System.out.println(matcher6.find());


        System.out.println();

         /*
        | - будем искать или то или то
         */
        Pattern pattern3 = Pattern.compile(".[0-9]|.[a-z]");

        Matcher matcher7 = pattern3.matcher("a b n f y u p");
        System.out.println(matcher7.find());

        Matcher matcher8 = pattern3.matcher("f e 5 g a q o");
        System.out.println(matcher8.find());

        System.out.println();

        /*
        \\d - будем искать только цифры. Одним \ мы экранируем спецсимвол d
         */
        Pattern pattern4 = Pattern.compile("\\d");

        Matcher matcher9 = pattern4.matcher("a b n f y u p");
        System.out.println(matcher9.find());

        Matcher matcher10 = pattern4.matcher("f e 5 g a q o");
        System.out.println(matcher10.find());

        System.out.println();

        /*
        \\D - будем искать все кроме цифр. Одним \ мы экранируем спецсимвол d
         */
        Pattern pattern5 = Pattern.compile("\\D");

        Matcher matcher11 = pattern5.matcher("a b n f y u p");
        System.out.println(matcher11.find());

        Matcher matcher12 = pattern5.matcher("f e 5 g a q o");
        System.out.println(matcher12.find());

        System.out.println();

        /*
       [^0-9] - циркумфлексус внутри квадратных скобок позволяет
       искать символ вне квадратных скобок
         */
        Pattern pattern6 = Pattern.compile("[^0-9]");

        Matcher matcher13 = pattern6.matcher("a b n f y u p");
        System.out.println(matcher13.find());

        Matcher matcher14 = pattern6.matcher("f e 5 g a q o");
        System.out.println(matcher14.find());

        System.out.println();

        /*
       [\\s] - поиск пробелов
         */
        Pattern pattern7 = Pattern.compile("\\s");

        Matcher matcher15 = pattern7.matcher("a b n f y u p");
        System.out.println(matcher15.find());

        Matcher matcher16 = pattern7.matcher("f e 5 g a q o");
        System.out.println(matcher16.find());




    }
}
