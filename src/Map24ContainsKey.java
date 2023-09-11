import java.util.HashMap;
import java.util.Map;

public class Map24ContainsKey {
    public static void main(String[] args) {
        Map<String, String>myCars=cars();
        System.out.println("cars().size() = " + cars().size());
        System.out.println("myCars = " + myCars);
    }
    public static Map<String, String> cars(){
        Map<String, String> expensiveCars=new HashMap<>();
        expensiveCars.put("1", "Lamborghini");
        expensiveCars.put("2", "Ferrari");
        expensiveCars.put("3", "Porch");
        expensiveCars.put("4","Bugatti" );
        expensiveCars.put("5", "Mercedes");
        expensiveCars.put("6", "Lexus");
        if(expensiveCars.containsKey(6)){
            System.out.println("Contains key num 6");
        }
        return expensiveCars;
    }
}
