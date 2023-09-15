import java.util.HashMap;
import java.util.Map;

public class MapPractice28 {
    public static void main(String[] args) {
        String str = "hello world hello wedevx wedevx wedevx java";
       String[] words=str.split(" ");
       Map<String, Integer> stringIntegerMap=new HashMap<>();
       for(String var:words){
           Integer currentnum=0;
           if(stringIntegerMap.containsKey(var)){
               currentnum=stringIntegerMap.get(var);
           }
           stringIntegerMap.put(var, currentnum+1);
       }
        System.out.println(stringIntegerMap);
    }
}
