package functional;

import java.util.Arrays;
import java.util.List;

public class CountingElementsQ6 {
    public static void main(String[] args) {
        /*
        Question: Given a list of strings, count how many strings have a length greater than 3 using streams.
         */
        List<String> words = Arrays.asList("Java", "is", "fun", "and", "powerful");
        Long count = words.stream()
                .filter(word -> word.length() > 3)
                .count();
        System.out.println("Count = " + count);
    }
}
