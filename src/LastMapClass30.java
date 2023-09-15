import java.util.HashMap;
import java.util.Map;

public class LastMapClass30 {
    public static void main(String[] args) {
        //life 1, is 1, wonderful 3
        String str="life is wonderful wonderful wonderful";
        String[] words=str.split(" ");
        Map<String, Integer> integerMap=new HashMap<>();
        for(String var:words){
            Integer currentNum=0;
            if(integerMap.containsKey(var)){
                currentNum=integerMap.get(var);
            }
            integerMap.put(var, currentNum+1);
        }
        System.out.println("integerMap = " + integerMap);

    }
}
