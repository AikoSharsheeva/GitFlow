public class ParseInt13 {
    public static void main(String[] args) {
        String input1 = "3 5 2 8 10";
        int result1 = sumEvenNumbers(input1);
        System.out.println("Result 1: " + result1);
    }

    public static int sumEvenNumbers(String input) {
        if (input.isEmpty()) {
            return 0; // Return 0 for empty or null input
        }

        String[] numbers = input.split("\\s+"); // Split the input string by whitespace
        int sum = 0;

        for (String number : numbers) {

            int num = Integer.parseInt(number);
            if (num % 2 == 0) {
                sum += num; // Add even numbers to the sum
            }
        }

        return sum;
    }

}

