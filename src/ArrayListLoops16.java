import java.util.ArrayList;
import java.util.List;

public class ArrayListLoops16 {
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

        for(String listOfCars:list){
            System.out.println("listOfCars = " + listOfCars);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.size with using get method "+ (i) + " = " + list.get(i));
        }

    }
}
