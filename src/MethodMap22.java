import java.util.HashMap;
import java.util.Map;

public class MethodMap22 {
    public static void main(String[] args) {
        Map<Character, String> myMap=createMap();
        System.out.println("myMap = " + myMap);
    }
    public static Map<Character, String> createMap(){
        return new HashMap<>();
    }
}
