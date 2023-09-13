import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntrySetMapListAsValue26 {
    public static void main(String[] args) {
        Map<Integer, String> entry=new HashMap<>();
        entry.put(1, "Elon Musk");
        entry.put(2, "Steve Jobs");
        entry.put(3, "Bill Gates");
        entry.put(4, "Mark");

        for(Map.Entry<Integer, String> var: entry.entrySet()){
            System.out.println("var.getKey() = " + var.getKey());
            System.out.println("var.getValue() = " + var.getValue());
        }
        HashMap<String, List <String>> manager=new HashMap<>();
         List<String> emploees=new ArrayList<>();
         emploees.add("Steve");
         emploees.add("Alice");
         emploees.add("John");
         emploees.add("Jane");

         manager.put("Elon", emploees);
        System.out.println(manager);

    }
}
