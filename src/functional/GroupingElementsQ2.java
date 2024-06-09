package functional;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingElementsQ2 {
    public static void main(String[] args) {
        /*
        Question: Given a list of strings, group the strings by their length.
         */
        List<String> words = Arrays.asList("Java", "is", "fun", "and", "powerful", "language");
        words.stream()
                .collect(Collectors.groupingBy(word -> word.length()))
                .entrySet()
                .forEach(entry -> System.out.println(entry));
    }
}
