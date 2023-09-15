import java.util.HashMap;
import java.util.Map;

public class Practice29 {
    public static void main(String[] args) {
        // 3 like, 3 i, 1 life, 1 myself, 1 everything 1 my
        String str="i like my life i like myself i like everything";
        String[] words=str.split(" ");
        Map<String, Integer> integerMap=new HashMap<>();
        for(String var:words){
            Integer currentnum=0;
            if(integerMap.containsKey(var)){
                currentnum=integerMap.get(var);
            }
            integerMap.put(var, currentnum);
        }
        System.out.println(integerMap);
    }
}
