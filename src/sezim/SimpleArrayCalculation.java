package sezim;



/*
Description: Write a method called calculateArray() that takes an int array as a parameter and returns the sum of the first and last elements in it.
If the size of an array is less than or equal to 1, return 1.
Params: A int array.
Return: The sum of the first and last elements if the size is bigger than 1. Else, return 1.

Example:
calculateArray([2,3,5,12,56,53,5]); // Returns 7
calculateArray([100,-1]); // Returns 99
calculateArray([18]); // Returns 1
*/
public class SimpleArrayCalculation {
    public static void main(String[] args) {
        System.out.println(calculateArray(new int[]{2, 3, 5, 12, 56, 53, 5}));
        System.out.println(calculateArray(new int[] {100,-1}));
        System.out.println(calculateArray(new int []{18}));

    }
    public static int calculateArray(int[] array){
        int size = array.length;
        if (size <= 1){
            return 1;
        }
            int n =  array[0] + array[size - 1];
            return n;




    }
}
