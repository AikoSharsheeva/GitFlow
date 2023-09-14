import java.util.HashMap;
import java.util.Map;

public class MapPractice27 {
    public static void main(String[] args) {
        //Счетчик слов
        String text="hello word hello wedevx wedevx wedevx java";
        String [] words=text.split(" ");
        Map<String, Integer> worldOccurrance=new HashMap<>();
        for(String word:words){
            Integer curentValue=0;
            if (worldOccurrance.containsKey(word)) {

                curentValue=worldOccurrance.get(word);
            }
            worldOccurrance.put(word, curentValue+1);
        }
        System.out.println("worldOccurrance = " + worldOccurrance);
    }
}
