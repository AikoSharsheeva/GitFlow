public class Array3MathABC {
    public static void main(String[] args) {
    int[] arr = {5, 15, 566, -99, 20, -1};// между 5 и 15 разница будет 10
    int result=subtractFromArray(arr);
        System.out.println("result = " + result);// поэтому ответ будет 10
    }
    public static int subtractFromArray(int[] array){
        if (array.length <= 1) {
            return 777;
        }
        int first = array[0];// извлекаются первые 2 элемента массива
        int second = array[1];

        int result = Math.abs(first - second);// вычесляется абсолютная разница между 1 и 2

        return result;
    }
}
