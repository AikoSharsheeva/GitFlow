public class Array2Initializ {
    public static void main(String[] args) {
        int[] array= new int[1000];
        for(int i=0; i<array.length; i++){
            array[i]=i;
            System.out.println("array["+i+"] = " + array[i]);
        }
    }
}
