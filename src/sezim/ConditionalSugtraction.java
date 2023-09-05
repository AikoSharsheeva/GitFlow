package sezim;


/*Description: Write a method called subtractFromArray() that takes an int array as a parameter.

If the first number is greater than the second, it should return first - second (Subtraction).

If the second is greater, it should return second - first (Subtraction).

If both of them are equal or the size of an array equals 1 or less than 1, return 777.

Params: A int array.

Return: The result of a subtraction or 777.

Example:
subtractFromArray([2,3,5,12,56,53,5]); // Returns 1
subtractFromArray([100,-1]); // Returns 101
subtractFromArray([18]); // Returns 777
subtractFromArray([0, 0]); // Returns 777*/
public class ConditionalSugtraction {
    public static void main(String[] args) {
        subtractFromArray(new int[]{2,3,5,12,56,53,5}); // Returns 1
        subtractFromArray(new int[]{100,-1}); // Returns 101
        subtractFromArray(new int[]{18}); // Returns 777
        subtractFromArray(new int[]{0, 0}); // Returns 777

    }

    public  static void subtractFromArray(int[] arr){
        int size = arr.length;
        if (size <= 1){
            System.out.println(777);
        } else {
            if(arr[0]>arr[1]){
                System.out.println(arr[0] - arr[1]);
            } else if (arr[0] < arr[1]) {
                System.out.println(arr[1] - arr[0]);
            } else {
                System.out.println(777);
            }
        }


    }
}
