import java.util.HashMap;

import java.util.Map;


public class MapInitializing21 {
    public static void main(String[] args) {
        Map<Integer, String> students=new HashMap<>();
      students.put(1, "lalisa");
      students.put(2, "rose");
      students.put(3, "flower");
      students.put(4, "jenny");
        System.out.println("students = " + students);
        System.out.println("students.get(3) = " + students.get(3));

    }
}
