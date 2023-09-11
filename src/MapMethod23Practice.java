import java.util.HashMap;
import java.util.Map;

public class MapMethod23Practice {
    public static void main(String[] args) {
        Map<Integer, String>myfamousTop=createMap();
        System.out.println("myfamousTop = " + myfamousTop);
        System.out.println("myfamousTop.get(4) = " + myfamousTop.get(4));
    }
    public static Map<Integer, String> createMap(){
        Map<Integer, String> famousPeople=new HashMap<>();
        famousPeople.put(1, "Elon Musk");
        famousPeople.put(2, "Steve Jobs");
        famousPeople.put(3, "Bill Gates");
        famousPeople.put(4, "Mark");

        return famousPeople;
    }
}
