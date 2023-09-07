import java.util.Arrays;

public class Array6CountVowel {

    public static void main(String[] args) {
        String[] arr1 = {"hello", "world", "how", "are", "you"};
        String[] arr2 = {"apple", "banana", "cherry", "date"};

        int[] result1 = countVowels(arr1);
        int[] result2 = countVowels(arr2);

        System.out.println(Arrays.toString(result1)); // Output: [2, 1, 1, 2, 2]
        System.out.println(Arrays.toString(result2)); // Output: [2, 3, 2, 2]
    }

    public static int[] countVowels(String[] array) {
        if (array.length == 0) {
            return new int[]{-1}; // Return an array with a single -1 if the input array is empty
        }

        int[] vowelCounts = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            String word = array[i].toLowerCase(); // Convert the word to lowercase for case-insensitive comparison
            int count = 0; // Initialize the count of vowels for the current word

            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);

                // Check if the character is a vowel (a, e, i, o, u)
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }

            vowelCounts[i] = count;
        }

        return vowelCounts;
    }
}


