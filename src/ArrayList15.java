import java.util.ArrayList;

public class ArrayList15 {

    public static void main(String[] args) {

        // ADD, GET, SET, SIZE, REMOVE
        //Initializing with any primitive types
        ArrayList list=new ArrayList();
        list.add("Steve");
        list.add("Jobs");
        list.add(2011);
        System.out.println(list);
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.size() = " + list.size());

        //Initializing with 1 diamond
        ArrayList<Integer> list2= new ArrayList<>();
        list2.add(12345679);
        list2.add(888);
        list2.add(0,333);
        list2.add(0, 777);
        System.out.println("list2 = " + list2);
        list2.remove(2);
        System.out.println("list2 = ater removing element " + list2);

        //Initislizing and rectrict (Ограничивать) to only String with 2 diamond
        ArrayList<String> list3=new ArrayList<String>();
        list3.add("Hello");
        list3.add("World");
        System.out.println("list3 = " + list3);
        list3.set(0, "Hi");
        System.out.println("list3 after SET = " + list3);


    }
}
