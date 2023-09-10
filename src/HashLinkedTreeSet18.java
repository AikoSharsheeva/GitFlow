import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.*;

public class HashLinkedTreeSet18 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Ferrari");
        list.add("Lamborghini");
        list.add("Porsche");
        list.add("Bugatti");
        list.add("Lexus");
        list.add("Mercedes");
        list.add("BMV");
        System.out.println("list = " + list);
// HashSet unique, unordered
        Set<String> hashset=new HashSet<>(list);
        System.out.println("hashset = " + hashset);
//Ordered based on  insertion order
        Set<String> linkesSet=new LinkedHashSet<>(list);
        System.out.println("linkesSet = " + linkesSet);
// Ordered based on what  ordering logic you provider
        Set<String> treesSet=new TreeSet<>(list);
        System.out.println("treesSet = " + treesSet);
    }
}
