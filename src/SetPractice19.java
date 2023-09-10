import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetPractice19 {
    public static void main(String[] args) {
        String[] words={"apple", "car", "orange", "pink", "apple", "java", "blue", "java", "java", "hello"};
        System.out.println("words = " +Arrays.toString(words));//10 words
//Arrays.asList(var) converts your array to a list
        Set<String> uniqueWord=new HashSet<>(Arrays.asList(words));
        System.out.println("uniqueWord = " + uniqueWord);
        System.out.println("uniqueWord.size() = " + uniqueWord.size());//7
        System.out.println("uniqueWord.contains(\"car\") = " + uniqueWord.contains("car"));

    }
}
