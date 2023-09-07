public class Array4FirstgreaterThen {
    public static void main(String[] args) {
        int arr[]={6,3,5,12,56,53,5};
        powerOfTwo(arr);// Сравнивала первоый число с 2 и 3
    }
    public static void powerOfTwo(int[] array) {
        if (array.length <= 2) {
            System.out.println("Not enough data");
        } else {
            int first = array[0];
            int second = array[1];
            int third = array[2];

            int firstSquared = first * first;
            int sumOfSecondAndThird = second + third;

            if (firstSquared >= sumOfSecondAndThird) {
                System.out.println("First is the greatest");
            } else {
                System.out.println("There is no power in first");
            }
        }
    }
}
