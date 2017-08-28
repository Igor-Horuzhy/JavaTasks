
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Игорь
 * 8/17/2017.
 */
public class Main {
    static List<Beers> createBeers(){
        List<Beers> beers = new ArrayList<>();
        beers.add(new Beers("Beer1","Belarus",10.0));
        beers.add(new Beers("Beer2","Belarus",3.0));
        beers.add(new Beers("Beer3","Russia",3));
        beers.add(new Beers("Beer4","USA",3));
        beers.add(new Beers("Beer5","Belgium",3));
        beers.add(new Beers("Beer6","USA",3));
        return beers;
    }

    public static void main(String[] args) {
        List<Beers> beers = createBeers();
        List<Beers> prefferedBeers = new ArrayList<>();
        List<Beers> americanBeers = new ArrayList<>();

        beers.forEach(beer -> System.out.println("Beer: " + beer));

        americanBeers = beers.stream().filter(beer -> Objects.equals(beer.country, "USA")).collect(Collectors.toList());
        System.out.println("==============================");
        System.out.println(americanBeers);
        System.out.println("==============================");

        // Распараллелили стрим, возможно он там на 2 на 2 на 2 разделил все пива, и сортирует каждое, хер знает
        beers.parallelStream()
                .sorted(Comparator.comparing(b -> b.price))
                .forEach(System.out::println);
        System.out.println("==============================");
        System.out.println(beers);

    }
}
