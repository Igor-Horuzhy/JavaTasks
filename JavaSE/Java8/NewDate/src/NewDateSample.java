import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

/**
 * Игорь
 * 8/17/2017.
 */
public class NewDateSample {
    public static void main(String[] args) {
        int i;
        LocalDate today = LocalDate.now();
        LocalDate endOfStudy = LocalDate.of(2017,10,21);
        Period remains = Period.between(today,endOfStudy);
        int days = remains.getDays();
        System.out.println(days);

        System.out.println("==============================");
        Instant before = Instant.now();
        for(i = 0; i < 999999999; i++){
            i=i*2/2 + i+i/23 + i*6;
        }
        Instant after = Instant.now();
        long seconds = Duration.between(before,after).getSeconds();
        System.out.println(seconds);
        System.out.println(i);
    }
}
