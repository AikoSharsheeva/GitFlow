public class Array10LargestNum {
    public static void main(String[] args) {
        int[] num = {10, 55, 37, 16, 60, 15, 90, 22};
        int left = num[0];
        int right = num[1];
        for (int i = 2; i < num.length; i++) {
            if (left > right) {
                right = num[i];
            }else{
                left=right;
                right=num[i];
            }
        }
        System.out.println("Largest number is: " + left);
    }
}
