import java.util.Arrays;

public class Array9Nested {
    public static void main(String[] args) {

        int [][] array ={{10,20,30},{40,50,60},{70,80,90}};
        for(int [] massiv:array){
            for( int data: massiv){
                System.out.print(data + " ");
            }
            System.out.println();
        }
        String [] name={"Aiko", "Anna", "Dana", "Sezim", "raim"};
        for (int i = 0; i <name.length ; i++) {
            
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println(name[i] + " = " +  name[i].length());
        }


        String [] fruits={"Apple", "orange", "kiwi", "Apple", "grapes", "kiwi"};
        for (int k = 0; k < fruits.length; k++) {
            for (int s = k+1; s <6 ; s++) {
            if(fruits[k].equals(fruits[s])){
                System.out.println("Dublicate fruits are " + fruits[s]);

            }

            }
        }
        

    }
}
