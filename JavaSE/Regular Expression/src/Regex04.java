import java.util.regex.Pattern;

/**
 * Игорь
 * 7/28/2017.
 */

public class Regex04 {
    /*
    Квантификаторы позволяют искать символы или группу символов, которые
    повторяются определенное количество раз. Количество повторов определяется
    разными типами квантификаторов. Квантификатор применяется к символу или
    группе символов, которые стоят перед ним
     */
    public static void main(String[] args) {
        /*
            Проверка строки, в которой 0 должен повторятся 2 раз.
            100 - подходит
         */
        System.out.println(Pattern.compile("10{2}").matcher("0102000").find());

        /*
        Будет true при содержании от 2 до 5 нулей
        */

        System.out.println(Pattern.compile("10{2,5}").matcher("010000").find());

         /*
        Будет true при содержании от 2 нулей
        */

        System.out.println(Pattern.compile("10{2,}").matcher("010000").find());

        /*
        Будет true при содержании одного 0 или нет, т.е true всегда???
        */

        System.out.println(Pattern.compile("10?").matcher("1").find());

        /*
        Будет true при не 0 или при присутсвии множетсва 0
        */

        System.out.println(Pattern.compile("10*").matcher("10").find());

         /*
        Будет true при появлении 0 один или больше раз
        */

        System.out.println(Pattern.compile("10+").matcher("1").find());
    }
}
