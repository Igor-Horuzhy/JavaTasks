/**
 * Игорь
 * 8/17/2017.
 */
public class Beers {
    String name;
   String country;
   double price;

    public Beers(String name, String country, double price) {
        this.name = name;
        this.country = country;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Name: " + name + " Country: " + country + " Price: " + price;
    }
}
