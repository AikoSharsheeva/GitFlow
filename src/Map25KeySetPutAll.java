import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map25KeySetPutAll {
    public static void main(String[] args) {
        Map<Integer, String> cities=new HashMap<>();
        cities.put(1, "Paris");
        cities.put(2, "Seoul");
        cities.put(3, "NY");

        Map<Integer, String> cities2=new HashMap<>();
        cities2.put(4, "Bishkek");
        cities2.put(5, "Pekin");
        cities2.put(6, "Moscow");
        System.out.println(" Before cities method PutAll = " + cities);
        System.out.println(" Before cities2 method PutAll = " + cities2);
        cities2.putAll(cities);
        System.out.println("After using method putAll cities2 to cities" + cities2);

        System.out.println("\"===============\" = " + "===============");

        Map<Integer, String> country=new HashMap<>();
        country.put(11, "Korea");
        country.put(25, "japan");
        country.put(33, "China");
        country.put(48, "England");
        System.out.println("country.keySet() = " + country.keySet());
        System.out.println("country.values() = " + country.values());

        Set<Integer> countryKeys=country.keySet();
        System.out.println("country = " + country);
        for(Integer var:countryKeys){
            System.out.println("Convert from Map to Set using keySet() and using loop print " + var);
        }
    }
}
