package sezim;


import com.sun.xml.internal.ws.addressing.WsaActionUtil;

/*
Description: Write a method called powerOfTwo() that takes an int array as a parameter.
If the first number raised to the power of 2 is greater or equal to the sum of the second and third numbers, print "First is the greatest". Else, print "There is no power in first". If the array contains only two numbers or less, print "Not enough data".

Params: A int array.

Return: None, only print.

Example:

powerOfTwo([2,3,5,12,56,53,5]); // Output There is no power in first
powerOfTwo([6, 7, 20, 67]); // Output First is the greatest
powerOfTwo([-9, 54, 27, -123]); // Output First is the greatest
powerOfTwo([100, 99]); // Output Not enough data*/
public class PowerOf2 {
    public static void main(String[] args) {
        powerOfTwo(new int[]{2,3,5,12,56,53,5}); // Output There is no power in first
        powerOfTwo(new int[] {6, 7, 20, 67}); // Output First is the greatest
        powerOfTwo(new int[]{-9, 54, 27, -123}); // Output First is the greatest
        powerOfTwo(new int[]{100, 99}); // Output Not enough data*/

    }

    public static void powerOfTwo(int[] array) {

        if (array.length <= 2) {
            System.out.println("Not enough data");
        } else {
            int power = array[0] * array[0];
            int sum = array[1] + array[2];
            if (power > sum) {
                System.out.println("First is the greatest");
            } else if (power == sum) {
                System.out.println("First is the greatest");
            } else {
                System.out.println("There is no power in first");
            }

        }
    }
}
