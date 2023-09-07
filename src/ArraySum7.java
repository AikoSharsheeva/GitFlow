import java.util.Arrays;

public class ArraySum7 {
    public static void main(String[] args) {
        int[] array={5,1,9,3,7,8,4,6};
        int sum=0;
        for(int i: array ){
            sum+=i;
            System.out.println("The sum = " + sum);
        }

    }
}
